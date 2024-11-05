package com.example.pttk1.model;

import java.time.LocalDateTime;

public class NhanVienBanHang803 extends ThanhVien803{
    private int id;
    private int thanhVienId;
    private String trangThai;
    private LocalDateTime ngayVaoLam;
    private String caLamViec;

    public NhanVienBanHang803(String username, String password, String hoTen, String diaChi, String soDienThoai, String ngaySinh, String gioiTinh, String vaiTro, int thanhVienId, String trangThai, LocalDateTime ngayVaoLam, String caLamViec) {
        super(username, password, hoTen, diaChi, soDienThoai, ngaySinh, gioiTinh, vaiTro);
        this.thanhVienId = thanhVienId;
        this.trangThai = trangThai;
        this.ngayVaoLam = ngayVaoLam;
        this.caLamViec = caLamViec;
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

    public String getTrangThai() {
        return trangThai;
    }

    public void setTrangThai(String trangThai) {
        this.trangThai = trangThai;
    }

    public LocalDateTime getNgayVaoLam() {
        return ngayVaoLam;
    }

    public void setNgayVaoLam(LocalDateTime ngayVaoLam) {
        this.ngayVaoLam = ngayVaoLam;
    }

    public String getCaLamViec() {
        return caLamViec;
    }

    public void setCaLamViec(String caLamViec) {
        this.caLamViec = caLamViec;
    }
}
