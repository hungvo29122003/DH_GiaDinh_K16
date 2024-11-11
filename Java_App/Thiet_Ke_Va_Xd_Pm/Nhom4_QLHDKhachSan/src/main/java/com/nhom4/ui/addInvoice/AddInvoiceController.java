package com.nhom4.ui.addInvoice;

import com.nhom4.useCase.addInvoice.AddInvoiceInputBoundary;
import com.nhom4.useCase.addInvoice.AddInvoiceInputDTO;

public class AddInvoiceController {
    private AddInvoiceInputBoundary addInvoiceInputBoundary;

    public AddInvoiceController(AddInvoiceInputBoundary addInvoiceInputBoundary) {
        this.addInvoiceInputBoundary = addInvoiceInputBoundary;
    }

    public void execute(AddInvoiceInputDTO addInvoiceInputDTO) {
        this.addInvoiceInputBoundary.execute(addInvoiceInputDTO);
    }
}
