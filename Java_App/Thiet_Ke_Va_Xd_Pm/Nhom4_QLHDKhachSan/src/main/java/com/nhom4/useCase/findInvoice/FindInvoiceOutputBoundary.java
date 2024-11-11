package com.nhom4.useCase.findInvoice;

import java.util.List;

public interface FindInvoiceOutputBoundary {
    public void exportError(FindInvoiceOutputDTO responseError);

    public void present(List<FindInvoiceOutputDTO> listInvoice);
}
