package nhom4.ui.editInvoice;


import nhom4.useCase.editInvoice.EditInvoiceInputBoundary;
import nhom4.useCase.editInvoice.EditInvoiceInputDTO;

public class EditInvoiceController {
    private EditInvoiceInputBoundary editInvoiceInputBoundary;

    public EditInvoiceController(EditInvoiceInputBoundary editInvoiceInputBoundary) {
        this.editInvoiceInputBoundary = editInvoiceInputBoundary;
    }

    public void execute(EditInvoiceInputDTO editInvoiceInputDTO) {
        this.editInvoiceInputBoundary.update(editInvoiceInputDTO);
    }

}
