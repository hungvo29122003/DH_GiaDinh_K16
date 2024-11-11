package com.nhom4.ui.deleteInvoice;

import com.nhom4.useCase.deleteInvoice.DeleteInvoiceOutputBoundary;
import com.nhom4.useCase.deleteInvoice.DeleteInvoiceOutputDTO;

public class DeleteInvoicePresenter implements DeleteInvoiceOutputBoundary {
    private DeleteInvoiceView deleteInvoiceView;
    private DeleteInvoiceViewModel deleteInvoiceViewModel;

    public DeleteInvoicePresenter(DeleteInvoiceView deleteInvoiceView, DeleteInvoiceViewModel deleteInvoiceViewModel) {
        this.deleteInvoiceView = deleteInvoiceView;
        this.deleteInvoiceViewModel = deleteInvoiceViewModel;
    }

    @Override
    public void exportError(DeleteInvoiceOutputDTO responseError) {
        this.deleteInvoiceViewModel.status = "error";
        this.deleteInvoiceViewModel.msg = responseError.getMsg();

        if (this.deleteInvoiceView != null) {
            this.deleteInvoiceView.showMsgError(this.deleteInvoiceViewModel);
        }
    }

    @Override
    public void present(DeleteInvoiceOutputDTO outputDTO) {
        this.deleteInvoiceViewModel.status = "success";
        this.deleteInvoiceViewModel.msg = outputDTO.getMsg();
        if (this.deleteInvoiceView != null) {
            this.deleteInvoiceView.showMsgResult(this.deleteInvoiceViewModel);
        }
    }
}
