package com.example.pttk1.dao;

import com.example.pttk1.constants.MessageConstants;
import com.example.pttk1.constants.VaiTroConstants;
import com.example.pttk1.model.ThanhVien803;
import com.example.pttk1.utils.DBUtils;

import java.sql.*;

public class ThanhVien803DAOImpl implements ThanhVien803DAO {
    public String addUser(ThanhVien803 user) {
        String sql = "INSERT INTO tbl_thanhvien (username, password, hoTen, diaChi, soDienThoai, ngaySinh, gioiTinh, vaiTro) VALUES (?, ?, ?, ?, ?, ?, ?, ?)";
        ThanhVien803 existingUser = checkRegister(user.getUsername());
        if (existingUser != null) {
            return MessageConstants.EXISTED_USER;
        }
        if (user == null) {
            throw new IllegalArgumentException("User cannot be null");
        }

        try (Connection conn = DBUtils.getConnection();
             PreparedStatement statement = conn.prepareStatement(sql, Statement.RETURN_GENERATED_KEYS)) {
            statement.setString(1, user.getUsername());
            statement.setString(2, user.getPassword());
            statement.setString(3, user.getHoTen());
            statement.setString(4, user.getDiaChi());
            statement.setString(5, user.getSoDienThoai());
            statement.setString(6, user.getNgaySinh());
            statement.setString(7, user.getGioiTinh());
            statement.setString(8, VaiTroConstants.KHACH_HANG);

            int rowsAffected = statement.executeUpdate();
            if (rowsAffected > 0) {
                // Lấy ID tự tăng của bản ghi mới
                ResultSet generatedKeys = statement.getGeneratedKeys();
                if (generatedKeys.next()) {
                    int generatedId = generatedKeys.getInt(1); // Lấy ID đầu tiên từ `getGeneratedKeys()`
                    return String.valueOf(generatedId); // Trả về ID của bản ghi vừa được thêm
                } else {
                    return MessageConstants.SIGNUP_FAIL; // Trường hợp không có ID nào được trả về
                }
            } else {
                return MessageConstants.SIGNUP_FAIL; // Trường hợp không thêm thành công
            }
        } catch (SQLException e) {
            e.printStackTrace();
            return e.getMessage();
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
            throw new RuntimeException("Database connection error", e); // Ném ra ngoại lệ
        }
    }


    // Lấy người dùng theo tên đăng nhập
    public ThanhVien803 checkRegister(String username) {
        String sql = "SELECT * FROM tbl_thanhvien WHERE username = ?";

        try (Connection conn = DBUtils.getConnection();
             PreparedStatement statement = conn.prepareStatement(sql)) {
            statement.setString(1, username);
            ResultSet resultSet = statement.executeQuery();

            if (resultSet.next()) {
                return new ThanhVien803(
                    resultSet.getInt("id"),
                    resultSet.getString("username"),
                    resultSet.getString("password"),
                    resultSet.getString("hoTen"),
                    resultSet.getString("diaChi"),
                    resultSet.getString("soDienThoai"),
                    resultSet.getString("ngaySinh"),
                    resultSet.getString("gioiTinh"),
                    resultSet.getString("vaiTro")
                );
            }
        } catch (SQLException e) {
            e.printStackTrace();
        } catch (ClassNotFoundException e) {
            throw new RuntimeException(e);
        }
        return null; // Trả về null nếu không tìm thấy
    }

    public ThanhVien803 login(String username, String password) {
        ThanhVien803 user = checkRegister(username);
        return ( user != null && user.getPassword().equals(password)) ? user : null;
    }
}
