package com.nhom4.ui.findInvoice;

import com.nhom4.useCase.findInvoice.FindInvoiceInputBoundary;
import com.nhom4.useCase.findInvoice.FindInvoiceInputDTO;

public class FindInvoiceController {
    private FindInvoiceInputBoundary findInvoiceInputBoundary;

    public FindInvoiceController(FindInvoiceInputBoundary findInvoiceInputBoundary) {
        this.findInvoiceInputBoundary = findInvoiceInputBoundary;
    }

    public void execute(FindInvoiceInputDTO findInvoiceInputDTO) {
        this.findInvoiceInputBoundary.execute(findInvoiceInputDTO);
    }
}
