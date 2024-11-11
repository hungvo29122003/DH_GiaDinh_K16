package nhom4.ui.findInvoice;

import nhom4.useCase.findInvoice.FindInvocieInputBoundary;
import nhom4.useCase.findInvoice.FindInvoiceInputDTO;

public class FindInvoiceController {
    private FindInvocieInputBoundary findInvoiceInputBoundary;

    public FindInvoiceController(FindInvocieInputBoundary findInvoiceInputBoundary) {
        this.findInvoiceInputBoundary = findInvoiceInputBoundary;
    }

    public void execute(FindInvoiceInputDTO findInvoiceInputDTO) {
        this.findInvoiceInputBoundary.execute(findInvoiceInputDTO);
    }
}
