package com.nhom4.useCase.editInvoice;

import java.text.SimpleDateFormat;
import java.util.Date;

import com.nhom4.entity.Invoice;
import com.nhom4.entity.InvoiceGio;
import com.nhom4.entity.InvoiceNgay;

public class EditInvoiceUseCase implements EditInvoiceInputBoundary {
    private EditInvoiceDatabaseBoundary editInvoiceDatabaseBoundary;
    private EditInvoiceOutputBoundary editInvoiceOutputBoundary;

    public EditInvoiceUseCase(EditInvoiceOutputBoundary editInvoiceOutputBoundary,
                              EditInvoiceDatabaseBoundary editInvoiceDatabaseBoundary) {
        this.editInvoiceDatabaseBoundary = editInvoiceDatabaseBoundary;
        this.editInvoiceOutputBoundary = editInvoiceOutputBoundary;
    }

    @Override
    public void execute(EditInvoiceInputDTO editInvoiceInputDTO) {
        SimpleDateFormat formatter = new SimpleDateFormat("yyyy-MM-dd");
        EditInvoiceOutputDTO responseError = new EditInvoiceOutputDTO();
        responseError.setStatus("error");

        if (!this.verify(editInvoiceInputDTO)) {
            responseError.setMsg("Dữ liệu không hợp lệ!");
            editInvoiceOutputBoundary.exportError(responseError);
            return;
        }

        int maHD = Integer.parseInt(editInvoiceInputDTO.getMaHD());
        if (!this.isExist(maHD)) {
            responseError.setMsg("Mã HD không tồn tại!");
            editInvoiceOutputBoundary.exportError(responseError);
            return;
        }

        Invoice invoice;
        String tenKH = editInvoiceInputDTO.getTenKH();
        Date ngayHD = null;
        try {
            ngayHD = formatter.parse(editInvoiceInputDTO.getNgayHD());
        } catch (Exception e) {
            responseError.setMsg("Ngày hóa đơn không hợp lệ!");
            editInvoiceOutputBoundary.exportError(responseError);
            return;
        }

        String maPhong = editInvoiceInputDTO.getMaPhong();
        double donGia;
        int soNgay;
        int soGio;

        // Kiểm tra giá trị đơn giá
        try {
            donGia = Double.parseDouble(editInvoiceInputDTO.getDonGia());
        } catch (NumberFormatException e) {
            responseError.setMsg("Đơn giá không hợp lệ!");
            editInvoiceOutputBoundary.exportError(responseError);
            return;
        }

        String loaiHoaDon = editInvoiceInputDTO.getLoaiHoaDon();

        // Kiểm tra giá trị số ngày
        try {
            soNgay = Integer.parseInt(editInvoiceInputDTO.getSoNgay());
        } catch (NumberFormatException e) {
            responseError.setMsg("Số ngày không hợp lệ!");
            editInvoiceOutputBoundary.exportError(responseError);
            return;
        }

        // Kiểm tra giá trị số giờ
        try {
            soGio = Integer.parseInt(editInvoiceInputDTO.getSoGio());
        } catch (NumberFormatException e) {
            responseError.setMsg("Số giờ không hợp lệ!");
            editInvoiceOutputBoundary.exportError(responseError);
            return;
        }

        if (loaiHoaDon.equals("Theo ngày")) {
            invoice = new InvoiceNgay(maHD, tenKH, ngayHD, maPhong, donGia, loaiHoaDon, soNgay);
        } else {
            invoice = new InvoiceGio(maHD, tenKH, ngayHD, maPhong, donGia, loaiHoaDon, soGio);
        }

        editInvoiceDatabaseBoundary.updateInvoice(invoice);

        EditInvoiceOutputDTO editInvoiceOutputDTO = new EditInvoiceOutputDTO();
        editInvoiceOutputDTO.setStatus("success");
        editInvoiceOutputDTO.setMsg("Đã sửa thành công (KH: " + maHD + ")");
        editInvoiceOutputBoundary.present(editInvoiceOutputDTO);
    }

    @Override
    public void executeFind(EditInvoiceInputDTO editInvoiceInputDTO) {
        EditInvoiceOutputDTO responseError = new EditInvoiceOutputDTO();
        responseError.setStatus("error");

        if (!this.verifyFind(editInvoiceInputDTO)) {
            responseError.setMsg("Dữ liệu không hợp lệ!");
            editInvoiceOutputBoundary.exportError(responseError);
            return;
        }

        int maHD = Integer.parseInt(editInvoiceInputDTO.getMaHD());
        Boolean isE = this.isExist(maHD);
        if (isE == null) {
            responseError.setMsg("Đã xảy ra lỗi tại Database!");
            editInvoiceOutputBoundary.exportError(responseError);
            return;
        } else if (!isE) {
            responseError.setMsg("Không tồn tại! (KH: " + maHD + ")");
            editInvoiceOutputBoundary.exportError(responseError);
            return;
        }

        Invoice invoice = editInvoiceDatabaseBoundary.getInvoice(maHD);

        EditInvoiceOutputDTO editInvoiceOutputDTO = new EditInvoiceOutputDTO();
        editInvoiceOutputDTO.setMaHD(String.valueOf(invoice.getMaHD()));
        editInvoiceOutputDTO.setTenKH(String.valueOf(invoice.getTenKhachHang()));
        editInvoiceOutputDTO.setNgayHD(invoice.getNgayHoaDon().toString());
        editInvoiceOutputDTO.setMaPhong(String.valueOf(invoice.getMaPhong()));
        editInvoiceOutputDTO.setDonGia(String.valueOf(invoice.getDonGia()));
        String loaiHoaDon = "";
        int soNgay = 0, soGio = 0;

        if (invoice instanceof InvoiceNgay) {
            InvoiceNgay invoiceNgay = (InvoiceNgay) invoice;
            loaiHoaDon = invoiceNgay.getLoaiHoaDon();
            soNgay = invoiceNgay.getSoNgay();
        } else if (invoice instanceof InvoiceGio) {
            InvoiceGio invoiceGio = (InvoiceGio) invoice;
            loaiHoaDon = invoiceGio.getLoaiHoaDon();
            soGio = invoiceGio.getSoGio();
        }
        editInvoiceOutputDTO.setLoaiHoaDon(String.valueOf(loaiHoaDon));
        editInvoiceOutputDTO.setSoNgay(String.valueOf(soNgay));
        editInvoiceOutputDTO.setSogio(String.valueOf(soGio));

        editInvoiceOutputDTO.setStatus("success");
        editInvoiceOutputDTO.setMsg("Đã lấy thành công hóa đơn! (KH: " + maHD + ")");
        editInvoiceOutputBoundary.presentFind(editInvoiceOutputDTO);
    }

    private boolean verifyFind(EditInvoiceInputDTO editInvoiceInputDTO) {
        try {
            int maHD = Integer.parseInt(editInvoiceInputDTO.getMaHD());
        } catch (NumberFormatException ex) {
            return false;
        }

        return true;
    }

    private boolean verify(EditInvoiceInputDTO requestData) {
        SimpleDateFormat formatter = new SimpleDateFormat("yyyy-MM-dd");

        try {
            int maHD = Integer.parseInt(requestData.getMaHD());
            String tenKH = requestData.getTenKH();
            Date ngayHD = formatter.parse(requestData.getNgayHD());
            String maPhong = requestData.getMaPhong();
            double donGia = Double.parseDouble(requestData.getDonGia());
            String loaiHoaDon = requestData.getLoaiHoaDon();
            int soNgay = Integer.parseInt(requestData.getSoNgay());
            int soGio = Integer.parseInt(requestData.getSoGio());
        } catch (Exception ex) {
            ex.printStackTrace();
            return false;
        }

        return true;
    }

    private Boolean isExist(int maHD) {
        return editInvoiceDatabaseBoundary.isExist(maHD);
    }
}

