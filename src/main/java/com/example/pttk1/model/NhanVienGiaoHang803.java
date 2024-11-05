package com.example.pttk1.model;

import java.time.LocalDateTime;

public class NhanVienGiaoHang803 extends ThanhVien803{
    private int id;
    private int thanhVienId;
    private String trangThai;
    private String khuVucGiaoHang;
    private LocalDateTime ngayVaoLam;

    public NhanVienGiaoHang803(String username, String password, String hoTen, String diaChi, String soDienThoai, String ngaySinh, String gioiTinh, String vaiTro, int thanhVienId, String trangThai, String khuVucGiaoHang, LocalDateTime ngayVaoLam) {
        super(username, password, hoTen, diaChi, soDienThoai, ngaySinh, gioiTinh, vaiTro);
        this.thanhVienId = thanhVienId;
        this.trangThai = trangThai;
        this.khuVucGiaoHang = khuVucGiaoHang;
        this.ngayVaoLam = ngayVaoLam;
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

    public String getKhuVucGiaoHang() {
        return khuVucGiaoHang;
    }

    public void setKhuVucGiaoHang(String khuVucGiaoHang) {
        this.khuVucGiaoHang = khuVucGiaoHang;
    }

    public LocalDateTime getNgayVaoLam() {
        return ngayVaoLam;
    }

    public void setNgayVaoLam(LocalDateTime ngayVaoLam) {
        this.ngayVaoLam = ngayVaoLam;
    }
}
