package com.example.pttk1.model;

public class KhachHang803 extends ThanhVien803{
    private int id;

    private int thanhVienId;
    private boolean trangThai;

    public KhachHang803(String username, String password, String hoTen, String diaChi, String soDienThoai, String ngaySinh, String gioiTinh, String vaiTro, int thanhVienId, boolean trangThai) {
        super(username, password, hoTen, diaChi, soDienThoai, ngaySinh, gioiTinh, vaiTro);
        this.thanhVienId = thanhVienId;
        this.trangThai = trangThai;
    }

    @Override
    public int getId() {
        return id;
    }

    @Override
    public void setId(int id) {
        this.id = id;
    }

    public int getThanhVienId() {
        return thanhVienId;
    }

    public void setThanhVienId(int thanhVienId) {
        this.thanhVienId = thanhVienId;
    }

    public boolean isTrangThai() {
        return trangThai;
    }

    public void setTrangThai(boolean trangThai) {
        this.trangThai = trangThai;
    }
}
