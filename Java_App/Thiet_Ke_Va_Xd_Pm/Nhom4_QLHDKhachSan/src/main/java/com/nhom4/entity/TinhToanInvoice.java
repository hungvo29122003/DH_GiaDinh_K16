package com.nhom4.entity;

import java.util.List;

public class TinhToanInvoice {


    public TinhToanInvoice() {

    }

    public int tinhTongInvoice(List<Invoice> newListInvoice) {
        int total = 0;
        for (Invoice invoice : newListInvoice) {
            total += 1;
        }

        return total;
    }

    public double tinhTrungBinhThanhTien(List<Invoice> newListInvoice) {
        double thanhTien = 0;
        for (Invoice invoice : newListInvoice) {
            if (invoice.getClass().equals(InvoiceNgay.class)) {
                InvoiceNgay invoiceVN = (InvoiceNgay) invoice;
                thanhTien = thanhTien + invoiceVN.tinhThanhTien();
            }

            if (invoice.getClass().equals(InvoiceGio.class)) {
                InvoiceGio invoiceNuocNgoai = (InvoiceGio) invoice;
                thanhTien = thanhTien + invoiceNuocNgoai.tinhThanhTien();
            }
        }

        return thanhTien;
    }
}
