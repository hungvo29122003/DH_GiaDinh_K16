package com.nhom4.ui.getListInvoice;

import com.nhom4.useCase.getListInvoice.GetListInvoiceInputBoundary;

public class GetListInvoiceController {
    private GetListInvoiceInputBoundary getListInvoiceInputBoundary;

    public GetListInvoiceController(GetListInvoiceInputBoundary getListInvoiceInputBoundary) {
        this.getListInvoiceInputBoundary = getListInvoiceInputBoundary;
    }

    public void execute() {
        this.getListInvoiceInputBoundary.execute();
    }
}
