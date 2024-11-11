package nhom4.useCase.addInvoice;

public interface AddInvoiceOutputBoundary {
public void executeError(AddInvoiceOutputDTO responseError);
public void executeResult(AddInvoiceOutputDTO responseData);
}
