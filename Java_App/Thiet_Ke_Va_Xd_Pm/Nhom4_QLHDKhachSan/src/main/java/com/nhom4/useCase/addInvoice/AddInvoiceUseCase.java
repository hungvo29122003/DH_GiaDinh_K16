//package com.nhom4.useCase.addInvoice;
//
//import java.text.SimpleDateFormat;
//import java.util.Date;
//
//import com.nhom4.entity.Invoice;
//import com.nhom4.entity.InvoiceGio;
//import com.nhom4.entity.InvoiceNgay;
//
//public class AddInvoiceUseCase implements AddInvoiceInputBoundary {
//    private AddInvoiceOutputBoundary addInvoiceOutputBoundary;
//    private AddInvoiceDatabaseBoundary addInvoiceDatabaseBoundary;
//
//    public AddInvoiceUseCase(AddInvoiceOutputBoundary addInvoiceOutputBoundary, AddInvoiceDatabaseBoundary addInvoiceDatabaseBoundary) {
//        this.addInvoiceOutputBoundary = addInvoiceOutputBoundary;
//        this.addInvoiceDatabaseBoundary = addInvoiceDatabaseBoundary;
//    }
//
//    @Override
//    public void execute(AddInvoiceInputDTO addInvoiceInputDTO) {
//        SimpleDateFormat formatter = new SimpleDateFormat("yyyy-MM-dd");
//        AddInvoiceOutputDTO responseError = new AddInvoiceOutputDTO();
//        responseError.setStatus("error");
//        Invoice invoice;
//
//        if (!verify(addInvoiceInputDTO)) {
//            responseError.setMsg("Dữ liệu không hợp lệ!");
//            addInvoiceOutputBoundary.exportError(responseError);
//            return;
//        }
//
//        String tenKH = addInvoiceInputDTO.getTenKH();
//        Date ngayHD = null;
//
//        try {
//            ngayHD = formatter.parse(addInvoiceInputDTO.getNgayHD());
//        } catch (Exception e) {
//
//        }
//
//        String maPhong = addInvoiceInputDTO.getMaPhong();
//        double donGia = Double.parseDouble(addInvoiceInputDTO.getDonGia());
//
//        String loaiHoaDon = addInvoiceInputDTO.getLoaiHD();
//
//        if (loaiHoaDon.equals("Theo ngày")) {
//            int soNgay = Integer.parseInt(addInvoiceInputDTO.getSoNgay());
//
//            InvoiceNgay invoiceNgay = new InvoiceNgay();
//            invoiceNgay.setTenKhachHang(tenKH);
//            invoiceNgay.setNgayHoaDon(ngayHD);
//            invoiceNgay.setLoaiHoaDon(loaiHoaDon);
//            invoiceNgay.setMaPhong(maPhong);
//            invoiceNgay.setDonGia(donGia);
//            invoiceNgay.setSoNgay(soNgay);
//
//            invoice = (Invoice) invoiceNgay;
//        } else {
//            InvoiceGio invoiceGio = new InvoiceGio();
//            invoiceGio.setTenKhachHang(tenKH);
//            invoiceGio.setNgayHoaDon(ngayHD);
//            invoiceGio.setMaPhong(maPhong);
//            invoiceGio.setDonGia(donGia);
//            invoiceGio.setLoaiHoaDon(loaiHoaDon);
//
//            invoice = (Invoice) invoiceGio;
//        }
//
//        this.addInvoiceDatabaseBoundary.addInvoice(invoice);
//
//        AddInvoiceOutputDTO outputDTO = new AddInvoiceOutputDTO();
//        outputDTO.setStatus("success");
//        outputDTO.setMsg("Đã thêm thành công! (TenKH: " + tenKH + ")");
//
//        this.addInvoiceOutputBoundary.present(outputDTO);
//    }
//
//    private boolean verify(AddInvoiceInputDTO requestData) {
//        SimpleDateFormat formatter = new SimpleDateFormat("yyyy-MM-dd");
//
//        try {
//            String tenKH = requestData.getTenKH();
//            Date ngayHD = formatter.parse(requestData.getNgayHD());
//            String maPhong = requestData.getMaPhong();
//            double donGia = Double.parseDouble(requestData.getDonGia());
//
//            String loaiHoaDon = requestData.getLoaiHD();
//
//            if (loaiHoaDon.equals("Theo ngày")) {
//                int soNgay = Integer.parseInt(requestData.getSoNgay());
//            } else {
//                int soGio = Integer.parseInt(requestData.getSoGio());
//            }
//
//        } catch (Exception ex) {
//            ex.printStackTrace();
//            return false;
//        }
//
//        return true;
//    }
//}

package com.nhom4.useCase.addInvoice;

import java.text.SimpleDateFormat;
import java.util.Date;

import com.nhom4.entity.Invoice;
import com.nhom4.entity.InvoiceGio;
import com.nhom4.entity.InvoiceNgay;

public class AddInvoiceUseCase implements AddInvoiceInputBoundary {
    private AddInvoiceOutputBoundary addInvoiceOutputBoundary;
    private AddInvoiceDatabaseBoundary addInvoiceDatabaseBoundary;

    public AddInvoiceUseCase(AddInvoiceDatabaseBoundary addInvoiceDatabaseBoundary, AddInvoiceOutputBoundary addInvoiceOutputBoundary) {
        this.addInvoiceDatabaseBoundary = addInvoiceDatabaseBoundary;
        this.addInvoiceOutputBoundary = addInvoiceOutputBoundary;
    }

    @Override
    public void execute(AddInvoiceInputDTO requestData) {
        SimpleDateFormat formatDate = new SimpleDateFormat("yyyy-MM-dd");
        AddInvoiceOutputDTO responseError = new AddInvoiceOutputDTO();
        responseError.setStatus("error");
        Invoice invoice;
        // kiểm tra dữ liệu đầu vào và trả về lỗi cụ thể
        String verificationError = inputVerify(requestData);
        if (verificationError != null) {
            responseError.setMsg(verificationError);
            addInvoiceOutputBoundary.exportError(responseError);
            return;
        }

        String tenKH = requestData.getTenKH();
        Date ngayHD;
        String loaiHoaDon = requestData.getLoaiHD();
        double donGia = Double.parseDouble(requestData.getDonGia());
        String maPhong = requestData.getMaPhong();

        try {
            ngayHD = formatDate.parse(requestData.getNgayHD());
        } catch (Exception e) {
            responseError.setMsg("Ngày không hợp lệ");
            addInvoiceOutputBoundary.exportError(responseError);
            return;
        }

        //tạo hoá đơn và lưa hoá đơn vào database
        if (loaiHoaDon.equals("theo giờ")) {
            try {
                int soGio = Integer.parseInt(requestData.getSoGio());
                if (soGio <= 0) {
                    responseError.setMsg("Số ngày phải lớn hơn 0");
                    addInvoiceOutputBoundary.exportError(responseError);
                    return;
                }
                InvoiceGio invoiceGio = new InvoiceGio();
                invoiceGio.setTenKhachHang(tenKH);
                invoiceGio.setNgayHoaDon(ngayHD);
                invoiceGio.setMaPhong(maPhong);
                invoiceGio.setDonGia(donGia);
                invoiceGio.setSoGio(soGio);
                invoiceGio.setLoaiHoaDon(loaiHoaDon);
                invoice = invoiceGio;
            } catch (NumberFormatException e) {
                responseError.setMsg("Số giờ không hợp lệ");
                addInvoiceOutputBoundary.exportError(responseError);
                return;
            }
        } else if (loaiHoaDon.equals("theo ngày")) {
            try {
                int soNgay = Integer.parseInt(requestData.getSoNgay());
                if (soNgay <= 0) {
                    responseError.setMsg("Số ngày phải lớn hơn 0");
                    addInvoiceOutputBoundary.exportError(responseError);
                    return;
                }
                InvoiceNgay invoiceNgay = new InvoiceNgay();
                invoiceNgay.setTenKhachHang(tenKH);
                invoiceNgay.setNgayHoaDon(ngayHD);
                invoiceNgay.setMaPhong(maPhong);
                invoiceNgay.setDonGia(donGia);
                invoiceNgay.setLoaiHoaDon(loaiHoaDon);
                invoiceNgay.setSoNgay(soNgay);
                invoice = invoiceNgay;
            } catch (NumberFormatException e) {
                responseError.setMsg("Số ngày không hợp lệ");
                addInvoiceOutputBoundary.exportError(responseError);
                return;
            }

        } else {
            responseError.setMsg("Loại hoá đơn không hợp lệ");
            addInvoiceOutputBoundary.exportError(responseError);
            return;
        }

        // lưu hoá đơn vào database
        this.addInvoiceDatabaseBoundary.addInvoice(invoice);

        //trả về kết quả thành công
        AddInvoiceOutputDTO responseData = new AddInvoiceOutputDTO();
        responseData.setStatus("Success");
        responseData.setMsg("Đã thêm thành công! (TenKH : " + tenKH + ")");
        addInvoiceOutputBoundary.present(responseData);

    }

    // hàm inputVerify kiểm tra dữ liệu đầu vào và trả về lỗi cụ thể
    private String inputVerify(AddInvoiceInputDTO requestData) {
        if (requestData.getTenKH() == null || requestData.getTenKH().trim().isEmpty()) {
            return "Tên khách hàng không được để trống";
        }
        if (requestData.getNgayHD() == null || requestData.getNgayHD().trim().isEmpty()) {
            return "Ngày hóa đơn không được để trống";
        }
        if (requestData.getMaPhong() == null || requestData.getMaPhong().trim().isEmpty()) {
            return "Mã phòng không được để trống";
        }
        if (requestData.getDonGia() == null || requestData.getDonGia().trim().isEmpty()) {
            return "Đơn giá không được để trống";
        }
        if (requestData.getLoaiHD() == null || requestData.getLoaiHD().trim().isEmpty()) {
            return "Loại hóa đơn không được để trống";
        }

        try {
            double donGia = Double.parseDouble(requestData.getDonGia());
            if (donGia <= 0) {
                return "Đơn giá phải lớn hơn 0";
            }
            SimpleDateFormat formatDate = new SimpleDateFormat("yyyy-MM-dd");
            Date ngayHD = formatDate.parse(requestData.getNgayHD());
            Date currentDate = new Date();
            if (ngayHD.after(currentDate)) {
                return "Ngày hóa đơn không được lớn hơn ngày hiện tại";
            }
            String loaiHD = requestData.getLoaiHD();
            if (loaiHD.equals("theo giờ")) {
                if (requestData.getSoGio() == null || requestData.getSoGio().trim().isEmpty()) {
                    return "Số giờ không được để trống cho hóa đơn theo giờ";
                }
            } else if (loaiHD.equals("theo ngày")) {
                if (requestData.getSoNgay() == null || requestData.getSoNgay().trim().isEmpty()) {
                    return "Số ngày không được để trống ";
                }
            } else {
                return "Vui lòng chọn hóa đơn";
            }
        } catch (NumberFormatException e) {
            return "Đơn giá không hợp lệ";
        } catch (Exception e) {
            return "Ngày không hợp lệ";
        }
        return null;
    }
}

