package com.example.pttk1.model;

public class ThongKeChiTietDonBan803 extends ChiTietDonBan803 {
    private int tongTien;
    private String nguoiMua;
    private String ngayBan;
    private int maHoaDon;
    private String tenHangHoa;

    public ThongKeChiTietDonBan803(int hoaDonBanId, int hangHoaId, int soLuong, int tongTien, String nguoiMua, String ngayBan, int maHoaDon, String tenHangHoa) {
        super(hoaDonBanId, hangHoaId, soLuong);
        this.tongTien = tongTien;
        this.nguoiMua = nguoiMua;
        this.ngayBan = ngayBan;
        this.maHoaDon = maHoaDon;
        this.tenHangHoa = tenHangHoa;
    }

    public ThongKeChiTietDonBan803(int hoaDonBanId, int hangHoaId, int soLuong) {
        super(hoaDonBanId, hangHoaId, soLuong);
    }

    public ThongKeChiTietDonBan803() {
        super();
    }

    public int getTongTien() {
        return tongTien;
    }

    public void setTongTien(int tongTien) {
        this.tongTien = tongTien;
    }

    public String getNguoiMua() {
        return nguoiMua;
    }

    public void setNguoiMua(String nguoiMua) {
        this.nguoiMua = nguoiMua;
    }

    public String getNgayBan() {
        return ngayBan;
    }

    public void setNgayBan(String ngayBan) {
        this.ngayBan = ngayBan;
    }

    public int getMaHoaDon() {
        return maHoaDon;
    }

    public void setMaHoaDon(int maHoaDon) {
        this.maHoaDon = maHoaDon;
    }

    public String getTenHangHoa() {
        return tenHangHoa;
    }

    public void setTenHangHoa(String tenHangHoa) {
        this.tenHangHoa = tenHangHoa;
    }
}
