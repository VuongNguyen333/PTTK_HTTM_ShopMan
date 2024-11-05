package com.example.pttk1.model;

import java.time.LocalDateTime;

public class HoaDonNhap803 {
    private int id;
    private int nhaCungCapId;
    private int nhanVienQuanLyId;
    private LocalDateTime ngayNhap;
    private boolean trangThai;
    private int tongTien;

    public HoaDonNhap803() {
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getNhaCungCapId() {
        return nhaCungCapId;
    }

    public void setNhaCungCapId(int nhaCungCapId) {
        this.nhaCungCapId = nhaCungCapId;
    }

    public int getNhanVienQuanLyId() {
        return nhanVienQuanLyId;
    }

    public void setNhanVienQuanLyId(int nhanVienQuanLyId) {
        this.nhanVienQuanLyId = nhanVienQuanLyId;
    }

    public LocalDateTime getNgayNhap() {
        return ngayNhap;
    }

    public void setNgayNhap(LocalDateTime ngayNhap) {
        this.ngayNhap = ngayNhap;
    }

    public boolean isTrangThai() {
        return trangThai;
    }

    public void setTrangThai(boolean trangThai) {
        this.trangThai = trangThai;
    }

    public int getTongTien() {
        return tongTien;
    }

    public void setTongTien(int tongTien) {
        this.tongTien = tongTien;
    }

    public HoaDonNhap803(int nhaCungCapId, int nhanVienQuanLyId, LocalDateTime ngayNhap, boolean trangThai, int tongTien) {
        this.nhaCungCapId = nhaCungCapId;
        this.nhanVienQuanLyId = nhanVienQuanLyId;
        this.ngayNhap = ngayNhap;
        this.trangThai = trangThai;
        this.tongTien = tongTien;
    }
}
