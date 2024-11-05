package com.example.pttk1.model;

import java.time.LocalDateTime;

public class HoaDonBan803 {
    private int id;
    private int khachHangId;
    private int nhanVienBanHangId;
    private LocalDateTime ngayBan;
    private boolean trangThai;

    public HoaDonBan803(int khachHangId, int nhanVienBanHangId, LocalDateTime ngayBan, boolean trangThai) {
        this.khachHangId = khachHangId;
        this.nhanVienBanHangId = nhanVienBanHangId;
        this.ngayBan = ngayBan;
        this.trangThai = trangThai;
    }

    public boolean isTrangThai() {
        return trangThai;
    }

    public void setTrangThai(boolean trangThai) {
        this.trangThai = trangThai;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public LocalDateTime getNgayBan() {
        return ngayBan;
    }

    public void setNgayBan(LocalDateTime ngayBan) {
        this.ngayBan = ngayBan;
    }

    public int getKhachHangId() {
        return khachHangId;
    }

    public void setKhachHangId(int khachHangId) {
        this.khachHangId = khachHangId;
    }

    public int getNhanVienBanHangId() {
        return nhanVienBanHangId;
    }

    public void setNhanVienBanHangId(int nhanVienBanHangId) {
        this.nhanVienBanHangId = nhanVienBanHangId;
    }
}
