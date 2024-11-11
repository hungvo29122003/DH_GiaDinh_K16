package com.nhom4.ui.deleteInvoice;

import com.nhom4.useCase.deleteInvoice.DeleteInvoiceInputDTO;
import com.nhom4.useCase.deleteInvoice.DeleteInvoiceInputBoundary;

public class DeleteInvoiceController {
    private DeleteInvoiceInputBoundary deleteInvoiceInputBoundary;

    public DeleteInvoiceController(DeleteInvoiceInputBoundary deleteInvoiceInputBoundary) {
        this.deleteInvoiceInputBoundary = deleteInvoiceInputBoundary;
    }

    public void execute(DeleteInvoiceInputDTO deleteInvoiceInputDTO) {
        this.deleteInvoiceInputBoundary.execute(deleteInvoiceInputDTO);
    }
}
