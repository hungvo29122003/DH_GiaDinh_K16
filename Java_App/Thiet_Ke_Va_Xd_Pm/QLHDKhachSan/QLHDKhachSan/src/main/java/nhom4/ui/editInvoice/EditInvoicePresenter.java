package nhom4.ui.editInvoice;

import nhom4.useCase.editInvoice.EditInvocieOutputBoundary;
import nhom4.useCase.editInvoice.EditInvoiceOutputDTO;

public class EditInvoicePresenter implements EditInvocieOutputBoundary {
    private EditInvoiceView editInvoiceView;
    private EditInvoiceViewModel editInvoiceViewModel;

    public EditInvoicePresenter(EditInvoiceView editInvoiceView, EditInvoiceViewModel editInvoiceViewModel) {
        this.editInvoiceView = editInvoiceView;
        this.editInvoiceViewModel = editInvoiceViewModel;
    }

    public EditInvoiceViewModel getEditInvoiceViewModel() {
        return this.editInvoiceViewModel;
    }

    @Override
    public void executeError(EditInvoiceOutputDTO responseError) {
        editInvoiceViewModel.status = responseError.getStatus();
        editInvoiceViewModel.msg = responseError.getMessage();

        if (this.editInvoiceView != null) {
            this.editInvoiceView.showMsgError(this.editInvoiceViewModel);
        }
    }

    @Override
    public void executeResult(EditInvoiceOutputDTO responseResult) {
        editInvoiceViewModel.msg = responseResult.getMessage();
        editInvoiceViewModel.status = responseResult.getStatus();

        if (this.editInvoiceView != null) {
            this.editInvoiceView.showMsgResult(this.editInvoiceViewModel);
        }
    }
}
