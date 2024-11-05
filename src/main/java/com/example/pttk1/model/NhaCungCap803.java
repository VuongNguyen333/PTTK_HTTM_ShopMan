package com.example.pttk1.model;

public class NhaCungCap803 {
    private int id;
    private String tenNhaCungCap;
    private String diaChi;
    private String soDienThoai;

    public NhaCungCap803(String tenNhaCungCap, String diaChi, String soDienThoai) {
        this.tenNhaCungCap = tenNhaCungCap;
        this.diaChi = diaChi;
        this.soDienThoai = soDienThoai;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getTenNhaCungCap() {
        return tenNhaCungCap;
    }

    public void setTenNhaCungCap(String tenNhaCungCap) {
        this.tenNhaCungCap = tenNhaCungCap;
    }

    public String getDiaChi() {
        return diaChi;
    }

    public void setDiaChi(String diaChi) {
        this.diaChi = diaChi;
    }

    public String getSoDienThoai() {
        return soDienThoai;
    }

    public void setSoDienThoai(String soDienThoai) {
        this.soDienThoai = soDienThoai;
    }
}
