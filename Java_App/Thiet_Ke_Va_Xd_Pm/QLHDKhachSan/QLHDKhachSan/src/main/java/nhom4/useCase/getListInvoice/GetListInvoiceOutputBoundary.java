package nhom4.useCase.getListInvoice;

import java.util.List;

public interface GetListInvoiceOutputBoundary {
    public void exportError(GetListInvoiceOutputDTO responsError);
    public void exportResult(List<GetListInvoiceOutputDTO> responseResult);
}
