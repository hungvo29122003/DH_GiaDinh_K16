package org.example.useCase.findInvoice;

import org.example.entity.Invoice;
import org.example.entity.InvoiceGio;
import org.example.entity.InvoiceNgay;

import java.util.ArrayList;
import java.util.List;

public class FindInvocieUseCase implements FindInvocieInputBoundary {
    private FindInvoiceDatabaseBoundary findInvoiceDatabaseBoundary;
    private FindInvoiceOutputBoundary findInvoiceOutputBoundary;

    public FindInvocieUseCase(FindInvoiceDatabaseBoundary findInvoiceDatabaseBoundary, FindInvoiceOutputBoundary findInvoiceOutputBoundary) {
        this.findInvoiceDatabaseBoundary = findInvoiceDatabaseBoundary;
        this.findInvoiceOutputBoundary = findInvoiceOutputBoundary;
    }

    @Override
    public void execute(FindInvoiceInputDTO requestData) {
        List<FindInvoiceOutputDTO> listInvoiceOutputDTO = new ArrayList<>();

        FindInvoiceOutputDTO responseError = new FindInvoiceOutputDTO();
        responseError.setStatus("error");

        if (!this.verify(requestData)){
            responseError.setMessage("Dữ liệu không hợp lệ");
            findInvoiceOutputBoundary.exportError(responseError);
            return;
        }

        String maHD = requestData.getMaHD();
        String tenKH = requestData.getTenKH();
        String ngayHD = requestData.getNgayHD();

        List<Invoice> listInvoice = findInvoiceDatabaseBoundary.findInvoice(maHD, tenKH, ngayHD);

        if (listInvoice == null){
            responseError.setMessage("Đã xảy ra lỗi tại Database");
            this.findInvoiceOutputBoundary.exportError(responseError);
            return;
        }

        if (listInvoice.isEmpty()){
            //thông báo lỗi cụ thể cho từng trường hợp
            if (maHD != null){
                responseError.setMessage("Không tìm thấy hoá đơn nào với mã hoá đơn :  " + maHD);
            } else if (tenKH != null && tenKH.isEmpty()) {
                responseError.setMessage("không tìm thấy hoá đơn nào với tên khách hàng : " + tenKH);
            } else if (ngayHD != null && ngayHD.isEmpty()) {
                responseError.setMessage("Không tìm thấy hoá đơn nào với ngày hoá đơn : " + ngayHD);
            } else {
                responseError.setMessage("không tìm thấy hoá đơn nào phù hợp với tiêu chuẩn tìm kiếm");
            }

            findInvoiceOutputBoundary.exportError(responseError);
            return;
        }

        for (Invoice invoice : listInvoice){
            if (invoice instanceof InvoiceGio){
                InvoiceGio invoiceGio = (InvoiceGio) invoice;
                listInvoiceOutputDTO.add(new FindInvoiceOutputDTO(
                        invoiceGio.getMaHD(),
                        invoiceGio.getTenKH(),
                        invoiceGio.getNgayHoaDon(),
                        invoiceGio.getMaPhong(),
                        invoiceGio.getDonGia(),
                        invoiceGio.getLoaiHoaDon(),
                        0,
                        invoiceGio.getSoGio(),
                        invoiceGio.tinhThanhTien()));
            } else if (invoice instanceof InvoiceNgay) {
                InvoiceNgay invoiceNgay = (InvoiceNgay) invoice;
                listInvoiceOutputDTO.add(new FindInvoiceOutputDTO(
                        invoiceNgay.getMaHD(),
                        invoiceNgay.getTenKH(),
                        invoiceNgay.getNgayHoaDon(),
                        invoiceNgay.getMaPhong(),
                        invoiceNgay.getDonGia(),
                        invoiceNgay.getLoaiHoaDon(),
                        invoiceNgay.getSoNgay(),
                        0,
                        invoiceNgay.tinhThanhTien()
                ));
            }
        }
        findInvoiceOutputBoundary.exportResult(listInvoiceOutputDTO);
    }

    private boolean verify(FindInvoiceInputDTO findInvoiceInputDTO){
        try {
            String maHD = findInvoiceInputDTO.getMaHD();
            String tenKH = findInvoiceInputDTO.getTenKH();
            if (tenKH == null || tenKH.isEmpty()){
                return false;
            }
            if (maHD == null || maHD.isEmpty()){
                return false;
            }
        } catch (Exception e){
            return false;
        }
        return true;
    }
}
