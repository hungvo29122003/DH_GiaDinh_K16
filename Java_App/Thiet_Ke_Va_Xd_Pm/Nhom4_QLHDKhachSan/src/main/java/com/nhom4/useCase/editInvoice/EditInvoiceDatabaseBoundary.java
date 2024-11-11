package com.nhom4.useCase.editInvoice;

import com.nhom4.entity.Invoice;

public interface EditInvoiceDatabaseBoundary {
    public void updateInvoice(Invoice invoice);

    public Invoice getInvoice(int maHD);

    public Boolean isExist(int maHD);
}
