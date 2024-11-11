package nhom4.useCase.editInvoice;

import nhom4.entity.Invoice;
import nhom4.entity.InvoiceGio;
import nhom4.entity.InvoiceNgay;
import nhom4.useCase.findInvoice.FindInvocieUseCase;
import nhom4.useCase.findInvoice.FindInvoiceDatabaseBoundary;
import nhom4.useCase.findInvoice.FindInvoiceOutputBoundary;
import nhom4.useCase.findInvoice.FindInvoiceOutputDTO;

import java.text.SimpleDateFormat;
import java.util.Date;

public class EditInvoiceUseCase implements EditInvoiceInputBoundary {
    private EditInvocieOutputBoundary editInvocieOutputBoundary;
    private EditInvoiceDatabaseBoundary editInvoiceDatabaseBoundary;

    public EditInvoiceUseCase( EditInvocieOutputBoundary  editInvocieOutputBoundary, EditInvoiceDatabaseBoundary editInvoiceDatabaseBoundary) {
        this.editInvocieOutputBoundary = editInvocieOutputBoundary;
        this.editInvoiceDatabaseBoundary = editInvoiceDatabaseBoundary;
    }

    @Override
    public void update(EditInvoiceInputDTO requestData) {
        SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd");
        EditInvoiceOutputDTO responseError = new EditInvoiceOutputDTO();
        responseError.setStatus("error");
        Invoice invoice;
        // Kiểm tra dữ liệu hợp lệ trước khi cập nhật
        if (!verifyUpdateData(requestData)) {
            responseError.setMessage("Dữ liệu không hợp lệ!");
            editInvocieOutputBoundary.executeError(responseError);
            return;
        }
        //kiểm tra tên KH
        Date ngayHD = null;
        try {
            ngayHD = dateFormat.parse(requestData.getNgayHD());
        } catch (Exception e) {
            responseError.setMessage("Ngày hoá đơn không hợp lệ!");
            editInvocieOutputBoundary.executeError(responseError);
            return;
        }

        double donGia = 0;
        int soNgay;
        int soGio;

        try {

            donGia = Double.parseDouble(requestData.getDonGia());
        } catch (NumberFormatException e) {
            responseError.setMessage("Đơn giá không hợp lệ!");
            editInvocieOutputBoundary.executeError(responseError);
        }

        String loaiHoaDon = requestData.getLoaiHoaDon();

        try {
            soNgay = Integer.getInteger(requestData.getSoNgay());
        } catch (NumberFormatException e) {
            responseError.setMessage("Số ngày không hợp lệ!");
            editInvocieOutputBoundary.executeError(responseError);
            return;
        }

        try {
            soGio = Integer.parseInt(requestData.getSoGio());
        } catch (NumberFormatException e) {
            responseError.setMessage("Số giờ không hợp lệ!");
            editInvocieOutputBoundary.executeError(responseError);
            return;
        }

        int maHD = Integer.parseInt(requestData.getMaHD());
        String tenKH = requestData.getTenKH();
        String maPhong = requestData.getMaPhong();
        //loaiHD
        if (loaiHoaDon.equals("Theo ngày")) {
            invoice = new InvoiceNgay(maHD, tenKH, ngayHD, maPhong, donGia, loaiHoaDon, soNgay);
        } else {
            invoice = new InvoiceGio(maHD, tenKH, ngayHD, maPhong, donGia, loaiHoaDon, soGio);
        }

        editInvoiceDatabaseBoundary.updateInvoice(invoice);

        EditInvoiceOutputDTO responseData = new EditInvoiceOutputDTO();
        responseData.setStatus("success");
        responseData.setMessage("Đã sửa thành công " + " " + "Hoá đơn : " + maHD);
        editInvocieOutputBoundary.executeResult(responseData);
    }
//
    private boolean verifyUpdateData(EditInvoiceInputDTO requestData) {
        SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd");
        try {
            int maHD = Integer.parseInt(requestData.getMaHD());
            String tenKH = requestData.getTenKH();
            Date ngayHd = dateFormat.parse(requestData.getNgayHD());
            String maPhong = requestData.getMaPhong();
            String loaiHoaDon = requestData.getLoaiHoaDon();
            double donGia = Double.parseDouble(requestData.getDonGia());
            int soNgay = Integer.parseInt(requestData.getSoNgay());
            int soGio = Integer.parseInt(requestData.getSoGio());
        } catch (Exception ex) {
            ex.printStackTrace();
            return false;
        }
        return true;
    }
}
