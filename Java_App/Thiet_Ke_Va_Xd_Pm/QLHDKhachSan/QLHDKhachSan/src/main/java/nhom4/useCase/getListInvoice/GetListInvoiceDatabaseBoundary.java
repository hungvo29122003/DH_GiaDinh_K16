package nhom4.useCase.getListInvoice;

import nhom4.entity.Invoice;

import java.util.List;

public interface GetListInvoiceDatabaseBoundary {
    public List<Invoice> getAllInvoice();
}
