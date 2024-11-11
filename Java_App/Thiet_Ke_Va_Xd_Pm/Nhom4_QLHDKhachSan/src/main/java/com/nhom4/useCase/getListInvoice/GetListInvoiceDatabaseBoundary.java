package com.nhom4.useCase.getListInvoice;

import java.util.List;

import com.nhom4.entity.Invoice;

public interface GetListInvoiceDatabaseBoundary {
    public List<Invoice> getAllInvoices();
}
