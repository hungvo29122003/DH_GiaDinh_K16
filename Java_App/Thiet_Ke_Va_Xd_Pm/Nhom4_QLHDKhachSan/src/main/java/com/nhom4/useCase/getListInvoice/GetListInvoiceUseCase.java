package com.nhom4.useCase.getListInvoice;

import java.util.ArrayList;
import java.util.List;

import com.nhom4.entity.Invoice;
import com.nhom4.entity.InvoiceGio;
import com.nhom4.entity.InvoiceNgay;

public class GetListInvoiceUseCase implements GetListInvoiceInputBoundary {
    private GetListInvoiceOutputBoundary getListInvoiceOutputBoundary;
    private GetListInvoiceDatabaseBoundary getListInvoiceDatabaseBoundary;

    public GetListInvoiceUseCase(GetListInvoiceOutputBoundary getListInvoiceOutputBoundary, GetListInvoiceDatabaseBoundary getListInvoiceDatabaseBoundary) {
        this.getListInvoiceOutputBoundary = getListInvoiceOutputBoundary;
        this.getListInvoiceDatabaseBoundary = getListInvoiceDatabaseBoundary;
    }

    @Override
    public void execute() {
        GetListInvoiceOutputDTO responseError = new GetListInvoiceOutputDTO();
        responseError.setStatus("error");

        List<GetListInvoiceOutputDTO> listOutputDTO = new ArrayList<>();

        List<Invoice> listInvoice = this.getListInvoiceDatabaseBoundary.getAllInvoices();

        if (listInvoice == null) {
            responseError.setMsg("Đã xảy ra lỗi tại Database!");
            this.getListInvoiceOutputBoundary.exportError(responseError);
            return;
        }

        for (Invoice invoice : listInvoice) {
            if (invoice.getClass().equals(InvoiceGio.class)) {
                InvoiceGio invoiceGio = (InvoiceGio) invoice;
                listOutputDTO.add(new GetListInvoiceOutputDTO(invoiceGio.getMaHD(), invoiceGio.getTenKhachHang(), invoiceGio.getNgayHoaDon(), invoiceGio.getMaPhong(), invoiceGio.getDonGia(), invoiceGio.getLoaiHoaDon(), 0, invoiceGio.getSoGio(), invoiceGio.tinhThanhTien()));
            } else {
                InvoiceNgay invoiceNgay = (InvoiceNgay) invoice;
                listOutputDTO.add(new GetListInvoiceOutputDTO(invoiceNgay.getMaHD(), invoiceNgay.getTenKhachHang(), invoiceNgay.getNgayHoaDon(), invoiceNgay.getMaPhong(), invoiceNgay.getDonGia(), invoiceNgay.getLoaiHoaDon(), invoiceNgay.getSoNgay(), 0, invoiceNgay.tinhThanhTien()));
            }
        }

        this.getListInvoiceOutputBoundary.present(listOutputDTO);
    }

}
