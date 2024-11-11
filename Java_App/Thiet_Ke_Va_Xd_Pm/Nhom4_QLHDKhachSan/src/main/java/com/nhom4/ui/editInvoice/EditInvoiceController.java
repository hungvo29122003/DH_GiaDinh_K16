package com.nhom4.ui.editInvoice;

import com.nhom4.useCase.editInvoice.EditInvoiceInputBoundary;
import com.nhom4.useCase.editInvoice.EditInvoiceInputDTO;

public class EditInvoiceController {
    private EditInvoiceInputBoundary editInvoiceInputBoundary;

    public EditInvoiceController(EditInvoiceInputBoundary editInvoiceInputBoundary) {
        this.editInvoiceInputBoundary = editInvoiceInputBoundary;
    }

    public void executeFind(EditInvoiceInputDTO editInvoiceInputDTO) {
        this.editInvoiceInputBoundary.executeFind(editInvoiceInputDTO);
    }

    public void execute(EditInvoiceInputDTO editInvoiceInputDTO) {
        this.editInvoiceInputBoundary.execute(editInvoiceInputDTO);
    }

}
