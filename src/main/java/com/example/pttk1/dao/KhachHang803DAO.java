package com.example.pttk1.dao;

import com.example.pttk1.constants.VaiTroConstants;
import com.example.pttk1.utils.DBUtils;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class KhachHang803DAO {
    public void addKhachHang(int thanhVienId) {
        String sql = "INSERT INTO tbl_khachhang(thanhVienId) VALUES(?)";

        try (Connection conn = DBUtils.getConnection();
             PreparedStatement statement = conn.prepareStatement(sql)) {
            statement.setInt(1, thanhVienId);
            statement.executeUpdate();
        } catch (SQLException e) {
            e.printStackTrace();
        } catch (ClassNotFoundException e) {
            throw new RuntimeException(e);
        }
    }
}
