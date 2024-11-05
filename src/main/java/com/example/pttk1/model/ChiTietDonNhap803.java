package com.example.pttk1.model;

public class ChiTietDonNhap803 {
    private int id;
    private int hoaDonNhapId;
    private int hangHoaId;
    private int soLuong;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getHoaDonNhapId() {
        return hoaDonNhapId;
    }

    public void setHoaDonNhapId(int hoaDonNhapId) {
        this.hoaDonNhapId = hoaDonNhapId;
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

    public ChiTietDonNhap803(int hoaDonNhapId, int hangHoaId, int soLuong) {
        this.hoaDonNhapId = hoaDonNhapId;
        this.hangHoaId = hangHoaId;
        this.soLuong = soLuong;
    }
}
