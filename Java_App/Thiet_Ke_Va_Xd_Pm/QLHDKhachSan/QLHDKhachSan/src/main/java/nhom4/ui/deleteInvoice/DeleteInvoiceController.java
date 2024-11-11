package nhom4.ui.deleteInvoice;



public class DeleteInvoiceController {
    private DeleteInvoiceInputBoundary deleteInvoiceInputBoundary;

    public DeleteInvoiceController(DeleteInvoiceInputBoundary deleteInvoiceInputBoundary) {
        this.deleteInvoiceInputBoundary = deleteInvoiceInputBoundary;
    }

    public void execute(DeleteInvoiceInputDTO deleteInvoiceInputDTO) {
        this.deleteInvoiceInputBoundary.execute(deleteInvoiceInputDTO);
    }
}
