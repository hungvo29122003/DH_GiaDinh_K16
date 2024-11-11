package com.nhom4.useCase.getListInvoice;

import java.util.List;

public interface GetListInvoiceOutputBoundary {
    public void exportError(GetListInvoiceOutputDTO responseData);

    public void present(List<GetListInvoiceOutputDTO> outputDTO);
}
