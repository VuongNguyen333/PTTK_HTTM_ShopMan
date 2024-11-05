package com.example.pttk1.dao;

import com.example.pttk1.model.ThongKeChiTietDonBan803;
import com.example.pttk1.utils.DBUtils;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class ThongKeChiTietDonBan803DAO {
    public List<ThongKeChiTietDonBan803> getThongKeGiaoDich(int hangHoaId, String ngayBatDau, String ngayKetThuc) {
        List<ThongKeChiTietDonBan803> danhSachGiaoDich = new ArrayList<>();
        String sql = "SELECT h.tenHangHoa, h.gia, hd.ngayBan, hd.id as hoaDonId, c.soLuong, tv.username " +
            "FROM tbl_hanghoa h " +
            "JOIN tbl_chitietdonban c ON h.id = c.hangHoaId " +
            "JOIN tbl_hoadonban hd ON c.hoaDonBanId = hd.id " +
            "JOIN tbl_thanhvien tv ON tv.id = hd.khachHangThanhVienId " +
            "WHERE h.id = ? AND hd.ngayBan BETWEEN ? AND ? " +
            "GROUP BY hd.ngayBan, c.soLuong, tv.username, hd.id " +
            "LIMIT 0, 1000";

        try (Connection conn = DBUtils.getConnection();
             PreparedStatement stmt = conn.prepareStatement(sql)) {
            stmt.setInt(1, hangHoaId);
            stmt.setDate(2, java.sql.Date.valueOf(ngayBatDau));
            stmt.setDate(3, java.sql.Date.valueOf(ngayKetThuc));

            ResultSet rs = stmt.executeQuery();

            while (rs.next()) {
                ThongKeChiTietDonBan803 hangHoa = new ThongKeChiTietDonBan803();
                hangHoa.setTenHangHoa(rs.getString("tenHangHoa"));
                hangHoa.setNguoiMua(rs.getString("username"));
                hangHoa.setNgayBan(String.valueOf(rs.getTimestamp("ngayBan").toLocalDateTime()));
                hangHoa.setSoLuong(rs.getInt("soLuong"));
                hangHoa.setTongTien(rs.getInt("soLuong") * rs.getInt("gia"));
                hangHoa.setMaHoaDon(rs.getInt("hoaDonId"));
                danhSachGiaoDich.add(hangHoa);
            }
        } catch (SQLException e) {
            e.printStackTrace();
        } catch (ClassNotFoundException e) {
            throw new RuntimeException(e);
        }
        return danhSachGiaoDich;
    }
}
