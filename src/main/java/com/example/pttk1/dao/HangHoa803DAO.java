package com.example.pttk1.dao;

import com.example.pttk1.model.HangHoa803;
import com.example.pttk1.utils.DBUtils;

import javax.servlet.ServletException;
import java.io.IOException;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class HangHoa803DAO {
    public List<HangHoa803> getAllHangHoa() {
        List<HangHoa803> hangHoas = new ArrayList<>();
        String sql = "SELECT * FROM tbl_hanghoa";

        try (Connection conn = DBUtils.getConnection();
             PreparedStatement statement = conn.prepareStatement(sql);
             ResultSet rs = statement.executeQuery()) {

            while (rs.next()) {
                HangHoa803 hangHoa = new HangHoa803();
                hangHoa.setId(rs.getInt("id"));
                hangHoa.setTenHangHoa(rs.getString("tenHangHoa"));
                hangHoa.setMoTa(rs.getString("moTa"));
                hangHoa.setNgaySanXuat(rs.getTimestamp("ngaySanXuat").toLocalDateTime());
                hangHoa.setNgayHetHan(rs.getTimestamp("ngayHetHan").toLocalDateTime());
                hangHoa.setGia(rs.getInt("gia"));
                hangHoa.setSoLuong(rs.getInt("soLuong"));
                hangHoa.setHinhAnh(rs.getString("hinhAnh"));
                hangHoas.add(hangHoa);
            }
        } catch (SQLException | ClassNotFoundException e) {
            e.printStackTrace();
        }

        return hangHoas;
    }

    public List<HangHoa803> searchHangHoa(String query) {
        List<HangHoa803> result = new ArrayList<>();
        String sql = "SELECT * FROM tbl_hanghoa WHERE tenHangHoa LIKE ?";
        try (Connection conn = DBUtils.getConnection();
             PreparedStatement stmt = conn.prepareStatement(sql)) {
            stmt.setString(1, "%" + query + "%");
            ResultSet rs = stmt.executeQuery();
            while (rs.next()) {
                HangHoa803 hangHoa = new HangHoa803();
                // Lấy dữ liệu từ rs và gán vào hangHoa
                hangHoa.setId(rs.getInt("id"));
                hangHoa.setTenHangHoa(rs.getString("tenHangHoa"));
                hangHoa.setMoTa(rs.getString("moTa"));
                hangHoa.setNgaySanXuat(rs.getTimestamp("ngaySanXuat").toLocalDateTime());
                hangHoa.setNgayHetHan(rs.getTimestamp("ngayHetHan").toLocalDateTime());
                hangHoa.setGia(rs.getInt("gia"));
                hangHoa.setSoLuong(rs.getInt("soLuong"));
                hangHoa.setHinhAnh(rs.getString("hinhAnh"));
                result.add(hangHoa);
            }
        } catch (SQLException e) {
            e.printStackTrace();
        } catch (ClassNotFoundException e) {
            throw new RuntimeException(e);
        }
        return result;
    }

    public List<HangHoa803> getAllHangHoaBan(String startDate, String endDate) throws ServletException, IOException {
        List<HangHoa803> danhSachHangHoaBan = new ArrayList<>();

        String sql = "SELECT h.*" +
            "FROM tbl_hanghoa h " +
            "JOIN tbl_chitietdonban c ON h.id = c.hangHoaId " +
            "JOIN tbl_hoadonban hd ON c.hoaDonBanId = hd.id " +
            "WHERE hd.ngayBan BETWEEN ? AND ? " +
            "GROUP BY h.id";

        try (Connection conn = DBUtils.getConnection();
             PreparedStatement stmt = conn.prepareStatement(sql)) {
            stmt.setDate(1, java.sql.Date.valueOf(startDate));
            stmt.setDate(2, java.sql.Date.valueOf(endDate));

            ResultSet rs = stmt.executeQuery();

            while (rs.next()) {
                HangHoa803 hangHoa = new HangHoa803();
                hangHoa.setId(rs.getInt("id"));
                hangHoa.setTenHangHoa(rs.getString("tenHangHoa"));
                hangHoa.setGia(rs.getInt("gia"));
                hangHoa.setHinhAnh(rs.getString("hinhAnh"));
                hangHoa.setNgaySanXuat(rs.getTimestamp("ngaySanXuat").toLocalDateTime());
                hangHoa.setNgayHetHan(rs.getTimestamp("ngayHetHan").toLocalDateTime());


                // Tạo đối tượng HangHoaDoanhThu và thêm vào danh sách
                danhSachHangHoaBan.add(hangHoa);
            }
        } catch (SQLException e) {
            e.printStackTrace();
        } catch (ClassNotFoundException e) {
            throw new RuntimeException(e);
        }

        return danhSachHangHoaBan;
    }


}
