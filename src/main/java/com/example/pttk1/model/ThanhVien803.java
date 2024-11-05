package com.example.pttk1.model;

public class ThanhVien803{
    private int id;
    private String username;
    private String password;
    private String hoTen;
    private String diaChi;
    private String soDienThoai;
    private String ngaySinh;
    private String gioiTinh;
    private String vaiTro;

    public ThanhVien803(String username, String password, String hoTen, String diaChi, String soDienThoai, String ngaySinh, String gioiTinh, String vaiTro) {
        this.username = username;
        this.password = password;
        this.hoTen = hoTen;
        this.diaChi = diaChi;
        this.soDienThoai = soDienThoai;
        this.ngaySinh = ngaySinh;
        this.gioiTinh = gioiTinh;
        this.vaiTro = vaiTro;
    }

    public ThanhVien803() {
    }

    public ThanhVien803(int id, String username, String password, String hoTen, String diaChi, String soDienThoai, String ngaySinh, String gioiTinh, String vaiTro) {
        this.id = id;
        this.username = username;
        this.password = password;
        this.hoTen = hoTen;
        this.diaChi = diaChi;
        this.soDienThoai = soDienThoai;
        this.ngaySinh = ngaySinh;
        this.gioiTinh = gioiTinh;
        this.vaiTro = vaiTro;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getHoTen() {
        return hoTen;
    }

    public void setHoTen(String hoTen) {
        this.hoTen = hoTen;
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

    public String getNgaySinh() {
        return ngaySinh;
    }

    public void setNgaySinh(String ngaySinh) {
        this.ngaySinh = ngaySinh;
    }

    public String getGioiTinh() {
        return gioiTinh;
    }

    public void setGioiTinh(String gioiTinh) {
        this.gioiTinh = gioiTinh;
    }

    public String getVaiTro() {
        return vaiTro;
    }

    public void setVaiTro(String vaiTro) {
        this.vaiTro = vaiTro;
    }
}
