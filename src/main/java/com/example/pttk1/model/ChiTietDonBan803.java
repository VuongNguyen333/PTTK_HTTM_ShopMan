package com.example.pttk1.model;

public class ChiTietDonBan803 {
    private int id;
    private int hoaDonBanId;
    private int hangHoaId;
    private int soLuong;

    public ChiTietDonBan803(int hoaDonBanId, int hangHoaId, int soLuong) {
        this.hoaDonBanId = hoaDonBanId;
        this.hangHoaId = hangHoaId;
        this.soLuong = soLuong;
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
