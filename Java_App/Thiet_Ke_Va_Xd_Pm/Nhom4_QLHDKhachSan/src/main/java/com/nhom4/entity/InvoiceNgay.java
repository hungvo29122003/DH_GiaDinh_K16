package com.nhom4.entity;

import java.util.Date;

public class InvoiceNgay extends Invoice {
    private int soNgay;

    public InvoiceNgay() {

    }

    public InvoiceNgay(int maHD, String tenKhachHang, Date ngayHoaDon, String maPhong, double donGia, String loaiHoaDon, int soNgay) {
        setMaHD(maHD);
        setTenKhachHang(tenKhachHang);
        setNgayHoaDon(ngayHoaDon);
        setMaPhong(maPhong);
        setDonGia(donGia);
        setLoaiHoaDon(loaiHoaDon);
        setSoNgay(soNgay);
    }

    @Override
    public double tinhThanhTien() {
        return this.soNgay * this.getDonGia();
    }

    public int getSoNgay() {
        return soNgay;
    }

    public void setSoNgay(int soNgay) {
        this.soNgay = soNgay;
    }


}
