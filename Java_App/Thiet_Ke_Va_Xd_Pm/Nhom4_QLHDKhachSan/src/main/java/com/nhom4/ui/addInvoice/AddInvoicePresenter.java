package com.nhom4.ui.addInvoice;

import com.nhom4.useCase.addInvoice.AddInvoiceOutputBoundary;
import com.nhom4.useCase.addInvoice.AddInvoiceOutputDTO;

public class AddInvoicePresenter implements AddInvoiceOutputBoundary {
    private AddInvoiceView addInvoiceView;
    private AddInvoiceViewModel addInvoiceViewModel;

    public AddInvoicePresenter(AddInvoiceView addInvoiceView, AddInvoiceViewModel addInvoiceViewModel) {
        this.addInvoiceView = addInvoiceView;
        this.addInvoiceViewModel = addInvoiceViewModel;
    }

    @Override
    public void exportError(AddInvoiceOutputDTO responseError) {
        this.addInvoiceViewModel.status = responseError.getStatus();
        this.addInvoiceViewModel.msg = responseError.getMsg();

        if (this.addInvoiceView != null) {
            this.addInvoiceView.showMsgError(this.addInvoiceViewModel);
        }
    }

    @Override
    public void present(AddInvoiceOutputDTO outputDTO) {
        this.addInvoiceViewModel.status = outputDTO.getStatus();
        this.addInvoiceViewModel.msg = outputDTO.getMsg();

        if (this.addInvoiceView != null) {
            this.addInvoiceView.showMsgResult(this.addInvoiceViewModel);
        }
    }
}
