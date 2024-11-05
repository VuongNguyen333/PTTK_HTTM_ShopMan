package com.example.pttk1.model;

public class GioHang803 {
    private int id;
    private int khachHangId;
    private int tongTien;

    public GioHang803(int khachHangId, int tongTien) {
        this.khachHangId = khachHangId;
        this.tongTien = tongTien;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getKhachHangId() {
        return khachHangId;
    }

    public void setKhachHangId(int khachHangId) {
        this.khachHangId = khachHangId;
    }

    public int getTongTien() {
        return tongTien;
    }

    public void setTongTien(int tongTien) {
        this.tongTien = tongTien;
    }
}
