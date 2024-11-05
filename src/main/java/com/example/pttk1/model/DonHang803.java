package com.example.pttk1.model;

import java.time.LocalDateTime;

public class DonHang803 {
    private int id;
    private int hoaDonBanId;
    private int nhanVienGiaoHangId;
    private LocalDateTime ngayGiaoHang;
    private boolean trangThai;
    private String diaChiGiaoHang;

    public DonHang803(int hoaDonBanId, int nhanVienGiaoHangId, LocalDateTime ngayGiaoHang, boolean trangThai, String diaChiGiaoHang) {
        this.hoaDonBanId = hoaDonBanId;
        this.nhanVienGiaoHangId = nhanVienGiaoHangId;
        this.ngayGiaoHang = ngayGiaoHang;
        this.trangThai = trangThai;
        this.diaChiGiaoHang = diaChiGiaoHang;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getHoaDonBanId() {
        return hoaDonBanId;
    }

    public void setHoaDonBanId(int hoaDonBanId) {
        this.hoaDonBanId = hoaDonBanId;
    }

    public int getNhanVienGiaoHangId() {
        return nhanVienGiaoHangId;
    }

    public void setNhanVienGiaoHangId(int nhanVienGiaoHangId) {
        this.nhanVienGiaoHangId = nhanVienGiaoHangId;
    }

    public LocalDateTime getNgayGiaoHang() {
        return ngayGiaoHang;
    }

    public void setNgayGiaoHang(LocalDateTime ngayGiaoHang) {
        this.ngayGiaoHang = ngayGiaoHang;
    }

    public boolean isTrangThai() {
        return trangThai;
    }

    public void setTrangThai(boolean trangThai) {
        this.trangThai = trangThai;
    }

    public String getDiaChiGiaoHang() {
        return diaChiGiaoHang;
    }

    public void setDiaChiGiaoHang(String diaChiGiaoHang) {
        this.diaChiGiaoHang = diaChiGiaoHang;
    }
}
