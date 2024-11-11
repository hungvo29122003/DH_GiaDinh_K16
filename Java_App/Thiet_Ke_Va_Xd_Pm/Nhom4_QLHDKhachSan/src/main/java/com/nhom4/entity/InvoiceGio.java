package com.nhom4.entity;

import java.util.Date;

public class InvoiceGio extends Invoice {
    private int soGio;

    public InvoiceGio() {

    }

    public InvoiceGio(int maHD, String tenKhachHang, Date ngayHoaDon, String maPhong, double donGia, String loaiHoaDon, int soGio) {
        setMaHD(maHD);
        setTenKhachHang(tenKhachHang);
        setNgayHoaDon(ngayHoaDon);
        setMaPhong(maPhong);
        setDonGia(donGia);
        setLoaiHoaDon(loaiHoaDon);
        setSoGio(soGio);
    }

    @Override
    public double tinhThanhTien() {
        return this.soGio * this.getDonGia();
    }

    public int getSoGio() {
        return soGio;
    }

    public void setSoGio(int soGio) {
        this.soGio = soGio;
    }
}
