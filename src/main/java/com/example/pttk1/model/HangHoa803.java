package com.example.pttk1.model;

import java.sql.Blob;
import java.time.LocalDateTime;

public class HangHoa803 {
    private int id;
    private String tenHangHoa;
    private String moTa;
    private LocalDateTime ngaySanXuat;
    private LocalDateTime ngayHetHan;
    private int gia;
    private int soLuong;
    private String hinhAnh;

    public HangHoa803(String tenHangHoa, String moTa, LocalDateTime ngaySanXuat, LocalDateTime ngayHetHan, int gia, int soLuong, String hinhAnh) {
        this.tenHangHoa = tenHangHoa;
        this.moTa = moTa;
        this.ngaySanXuat = ngaySanXuat;
        this.ngayHetHan = ngayHetHan;
        this.gia = gia;
        this.soLuong = soLuong;
        this.hinhAnh = hinhAnh;
    }

    public HangHoa803(int id, String tenHangHoa, String moTa, LocalDateTime ngaySanXuat, LocalDateTime ngayHetHan, int gia, int soLuong, String hinhAnh) {
        this.id = id;
        this.tenHangHoa = tenHangHoa;
        this.moTa = moTa;
        this.ngaySanXuat = ngaySanXuat;
        this.ngayHetHan = ngayHetHan;
        this.gia = gia;
        this.soLuong = soLuong;
        this.hinhAnh = hinhAnh;
    }

    public HangHoa803() {

    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getTenHangHoa() {
        return tenHangHoa;
    }

    public void setTenHangHoa(String tenHangHoa) {
        this.tenHangHoa = tenHangHoa;
    }

    public String getMoTa() {
        return moTa;
    }

    public void setMoTa(String moTa) {
        this.moTa = moTa;
    }

    public LocalDateTime getNgaySanXuat() {
        return ngaySanXuat;
    }

    public void setNgaySanXuat(LocalDateTime ngaySanXuat) {
        this.ngaySanXuat = ngaySanXuat;
    }

    public LocalDateTime getNgayHetHan() {
        return ngayHetHan;
    }

    public void setNgayHetHan(LocalDateTime ngayHetHan) {
        this.ngayHetHan = ngayHetHan;
    }

    public int getSoLuong() {
        return soLuong;
    }

    public void setSoLuong(int soLuong) {
        this.soLuong = soLuong;
    }

    public String getHinhAnh() {
        return hinhAnh;
    }

    public void setHinhAnh(String hinhAnh) {
        this.hinhAnh = hinhAnh;
    }

    public int getGia() {
        return gia;
    }

    public void setGia(int gia) {
        this.gia = gia;
    }
}
