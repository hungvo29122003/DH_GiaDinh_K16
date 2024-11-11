package com.nhom4.useCase.addInvoice;

import com.nhom4.entity.Invoice;

public interface AddInvoiceDatabaseBoundary {
    public void addInvoice(Invoice invoice);

    public Boolean isExist(int maKH);
}
