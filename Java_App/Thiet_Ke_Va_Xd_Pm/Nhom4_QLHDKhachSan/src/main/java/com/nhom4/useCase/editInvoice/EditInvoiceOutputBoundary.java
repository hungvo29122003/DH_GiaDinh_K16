package com.nhom4.useCase.editInvoice;

public interface EditInvoiceOutputBoundary {
    public void exportError(EditInvoiceOutputDTO responseError);

    public void present(EditInvoiceOutputDTO outputDTO);

    public void presentFind(EditInvoiceOutputDTO editInvoiceOutputDTO);
}
