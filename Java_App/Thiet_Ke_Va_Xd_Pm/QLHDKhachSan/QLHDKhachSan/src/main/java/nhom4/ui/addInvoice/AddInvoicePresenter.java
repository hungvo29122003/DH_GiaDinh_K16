package nhom4.ui.addInvoice;


import nhom4.useCase.addInvoice.AddInvoiceOutputBoundary;
import nhom4.useCase.addInvoice.AddInvoiceOutputDTO;

public class AddInvoicePresenter implements AddInvoiceOutputBoundary {
    private AddInvoiceView addInvoiceView;
    private AddInvoiceViewModel addInvoiceViewModel;

    public AddInvoicePresenter(AddInvoiceView addInvoiceView, AddInvoiceViewModel addInvoiceViewModel) {
        this.addInvoiceView = addInvoiceView;
        this.addInvoiceViewModel = addInvoiceViewModel;
    }

    @Override
    public void executeError(AddInvoiceOutputDTO responseError) {
        this.addInvoiceViewModel.status = responseError.getStatus();
        this.addInvoiceViewModel.msg = responseError.getMessage();

        if (this.addInvoiceView != null) {
            this.addInvoiceView.showMsgError(this.addInvoiceViewModel);
        }
    }

    @Override
    public void executeResult(AddInvoiceOutputDTO responseData) {
        this.addInvoiceViewModel.status = responseData.getStatus();
        this.addInvoiceViewModel.msg = responseData.getMessage();

        if (this.addInvoiceView != null) {
            this.addInvoiceView.showMsgResult(this.addInvoiceViewModel);
        }
    }
}
