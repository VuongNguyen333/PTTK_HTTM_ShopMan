package com.example.pttk1.model;

public class ChiTietGioHang803 {
    private int id;
    private int gioHangId;
    private int hangHoaId;
    private int soLuong;

    public ChiTietGioHang803(int gioHangId, int hangHoaId, int soLuong) {
        this.gioHangId = gioHangId;
        this.hangHoaId = hangHoaId;
        this.soLuong = soLuong;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getGioHangId() {
        return gioHangId;
    }

    public void setGioHangId(int gioHangId) {
        this.gioHangId = gioHangId;
    }

    public int getHangHoaId() {
        return hangHoaId;
    }

    public void setHangHoaId(int hangHoaId) {
        this.hangHoaId = hangHoaId;
    }

    public int getSoLuong() {
        return soLuong;
    }

    public void setSoLuong(int soLuong) {
        this.soLuong = soLuong;
    }
}
