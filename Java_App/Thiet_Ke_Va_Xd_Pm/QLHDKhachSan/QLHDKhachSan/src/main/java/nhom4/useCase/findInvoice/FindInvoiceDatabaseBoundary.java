package nhom4.useCase.findInvoice;

import nhom4.entity.Invoice;

import java.util.List;

public interface FindInvoiceDatabaseBoundary {
    public List<Invoice> findInvoice(String maHD, String tenKH, String ngayHD);
}
