package com.nhom4.useCase.addInvoice;

public interface AddInvoiceOutputBoundary {
    public void exportError(AddInvoiceOutputDTO outputDTO);

    public void present(AddInvoiceOutputDTO outputDTO);
}
