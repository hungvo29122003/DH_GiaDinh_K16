package com.nhom4.useCase.findInvoice;

import java.util.Date;
import java.util.List;

import com.nhom4.entity.Invoice;

public interface FindInvoiceDatabaseBoundary {
    public List<Invoice> findInvoice(String tenKH, String maHD, Date ngayHD);

    List<Invoice> findInvoice(String tenKH);

//    List<Invoice> findInvoice(String tenKH);
}
