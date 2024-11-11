package com.nhom4.useCase.findInvoice;

import java.util.ArrayList;
import java.util.List;

import com.nhom4.entity.Invoice;
import com.nhom4.entity.InvoiceGio;
import com.nhom4.entity.InvoiceNgay;

public class FindInvoiceUseCase implements FindInvoiceInputBoundary {
    private FindInvoiceDatabaseBoundary findInvoiceDatabaseBoundary;
    private FindInvoiceOutputBoundary findInvoiceOutputBoundary;

    public FindInvoiceUseCase(FindInvoiceOutputBoundary findInvoiceOutputBoundary, FindInvoiceDatabaseBoundary findInvoiceDatabaseBoundary) {
        this.findInvoiceDatabaseBoundary = findInvoiceDatabaseBoundary;
        this.findInvoiceOutputBoundary = findInvoiceOutputBoundary;
    }

    @Override
    public void execute(FindInvoiceInputDTO findInvoiceInputDTO) {
        List<FindInvoiceOutputDTO> listOutputDTO = new ArrayList<>();

        FindInvoiceOutputDTO responseError = new FindInvoiceOutputDTO();
        responseError.setStatus("error");

        if (!this.verify(findInvoiceInputDTO)) {
            responseError.setMsg("Dữ liệu không hợp lệ!");
            findInvoiceOutputBoundary.exportError(responseError);
            return;
        }

        String tenKH = findInvoiceInputDTO.getTenKH();

        List<Invoice> listInvoice = findInvoiceDatabaseBoundary.findInvoice(tenKH);

        if (listInvoice == null) {
            responseError.setMsg("Đã xảy ra lỗi tại Database!");
            this.findInvoiceOutputBoundary.exportError(responseError);
        }

        if (listInvoice.size() == 0) {
            responseError.setMsg("Không có hóa đơn nào cho tên KH [" + tenKH + "]!");
            findInvoiceOutputBoundary.exportError(responseError);
            return;
        }

        for (Invoice invoice : listInvoice) {
            if (invoice.getClass().equals(InvoiceGio.class)) {
                InvoiceGio invoiceGio = (InvoiceGio) invoice;
                listOutputDTO.add(new FindInvoiceOutputDTO(invoiceGio.getMaHD(), invoiceGio.getTenKhachHang(), invoiceGio.getNgayHoaDon(), invoiceGio.getMaPhong(), invoiceGio.getDonGia(), invoiceGio.getLoaiHoaDon(), 0, invoiceGio.getSoGio(), invoiceGio.tinhThanhTien()));
            } else {
                InvoiceNgay invoiceNgay = (InvoiceNgay) invoice;
                listOutputDTO.add(new FindInvoiceOutputDTO(invoiceNgay.getMaHD(), invoiceNgay.getTenKhachHang(), invoiceNgay.getNgayHoaDon(), invoiceNgay.getMaPhong(), invoiceNgay.getDonGia(), invoiceNgay.getLoaiHoaDon(), invoiceNgay.getSoNgay(), 0, invoiceNgay.tinhThanhTien()));
            }
        }

        findInvoiceOutputBoundary.present(listOutputDTO);
    }

    private boolean verify(FindInvoiceInputDTO findInvoiceInputDTO) {
        try {
            String tenKH = String.valueOf(findInvoiceInputDTO.getTenKH());
            if (tenKH == null || tenKH.isEmpty()) {
                return false;
            }
        } catch (Exception ex) {
            return false;
        }

        return true;
    }
}
