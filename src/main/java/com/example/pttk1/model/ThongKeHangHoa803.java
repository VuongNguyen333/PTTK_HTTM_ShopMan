package com.example.pttk1.model;

import java.time.LocalDateTime;

public class ThongKeHangHoa803 extends HangHoa803 {
    private int soLuongBan;
    private int tongTien;
    private String nguoiMua;
    private String ngayBan;

    private int maHoaDon;

    public int getMaHoaDon() {
        return maHoaDon;
    }

    public void setMaHoaDon(int maHoaDon) {
        this.maHoaDon = maHoaDon;
    }

    public String getNgayBan() {
        return ngayBan;
    }

    public void setNgayBan(String ngayBan) {
        this.ngayBan = ngayBan;
    }

    public String getNguoiMua() {
        return nguoiMua;
    }

    public void setNguoiMua(String nguoiMua) {
        this.nguoiMua = nguoiMua;
    }

    public ThongKeHangHoa803(String tenHangHoa, String moTa, LocalDateTime ngaySanXuat, LocalDateTime ngayHetHan, int gia, int soLuong, String hinhAnh, int soLuongBan, int tongTien, String ngayBan) {
        super(tenHangHoa, moTa, ngaySanXuat, ngayHetHan, gia, soLuong, hinhAnh);
        this.soLuongBan = soLuongBan;
        this.tongTien = tongTien;
        this.ngayBan = ngayBan;
    }

    public ThongKeHangHoa803() {

    }

    public int getSoLuongBan() {
        return soLuongBan;
    }

    public void setSoLuongBan(int soLuongBan) {
        this.soLuongBan = soLuongBan;
    }

    public int getTongTien() {
        return tongTien;
    }

    public void setTongTien(int tongTien) {
        this.tongTien = tongTien;
    }
}
