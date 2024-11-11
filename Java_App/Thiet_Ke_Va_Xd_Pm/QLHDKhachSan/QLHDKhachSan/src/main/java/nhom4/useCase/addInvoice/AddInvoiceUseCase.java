package nhom4.useCase.addInvoice;

import nhom4.entity.Invoice;
import nhom4.entity.InvoiceGio;
import nhom4.entity.InvoiceNgay;

import java.text.SimpleDateFormat;
import java.util.Date;

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
            responseError.setMessage(verificationError);
            addInvoiceOutputBoundary.executeError(responseError);
            return;
        }

        String tenKH = requestData.getTenKH();
        Date ngayHD;
        String loaiHoaDon = requestData.getLoaiHoaDon();
        double donGia = Double.parseDouble(requestData.getDonGia());
        String maPhong = requestData.getMaPhong();

        try {
            ngayHD = formatDate.parse(requestData.getNgayHoaDon());
        } catch (Exception e) {
            responseError.setMessage("Ngày không hợp lệ");
            addInvoiceOutputBoundary.executeError(responseError);
            return;
        }

        //tạo hoá đơn và lưa hoá đơn vào database
        if (loaiHoaDon.equals("theo giờ")) {
            try {
                int soGio = Integer.parseInt(requestData.getSoGio());
                if (soGio <= 0) {
                    responseError.setMessage("Số ngày phải lớn hơn 0");
                    addInvoiceOutputBoundary.executeError(responseError);
                    return;
                }
                InvoiceGio invoiceGio = new InvoiceGio();
                invoiceGio.setTenKH(tenKH);
                invoiceGio.setNgayHoaDon(ngayHD);
                invoiceGio.setMaPhong(maPhong);
                invoiceGio.setDonGia(donGia);
                invoiceGio.setSoGio(soGio);
                invoiceGio.setLoaiHoaDon(loaiHoaDon);
                invoice = invoiceGio;
            } catch (NumberFormatException e) {
                responseError.setMessage("Số giờ không hợp lệ");
                addInvoiceOutputBoundary.executeError(responseError);
                return;
            }
        } else if (loaiHoaDon.equals("theo ngày")) {
            try {
                int soNgay = Integer.parseInt(requestData.getSoNgay());
                if (soNgay <= 0) {
                    responseError.setMessage("Số ngày phải lớn hơn 0");
                    addInvoiceOutputBoundary.executeError(responseError);
                    return;
                }
                InvoiceNgay invoiceNgay = new InvoiceNgay();
                invoiceNgay.setTenKH(tenKH);
                invoiceNgay.setNgayHoaDon(ngayHD);
                invoiceNgay.setMaPhong(maPhong);
                invoiceNgay.setDonGia(donGia);
                invoiceNgay.setLoaiHoaDon(loaiHoaDon);
                invoiceNgay.setSoNgay(soNgay);
                invoice = invoiceNgay;
            } catch (NumberFormatException e) {
                responseError.setMessage("Số ngày không hợp lệ");
                addInvoiceOutputBoundary.executeError(responseError);
                return;
            }

        } else {
            responseError.setMessage("Loại hoá đơn không hợp lệ");
            addInvoiceOutputBoundary.executeError(responseError);
            return;
        }

        // lưu hoá đơn vào database
        this.addInvoiceDatabaseBoundary.addInvoic(invoice);

        //trả về kết quả thành công
        AddInvoiceOutputDTO responseData = new AddInvoiceOutputDTO();
        responseData.setStatus("Success");
        responseData.setMessage("Đã thêm thành công! (TenKH : " + tenKH + ")");
        addInvoiceOutputBoundary.executeResult(responseData);

    }

    // hàm inputVerify kiểm tra dữ liệu đầu vào và trả về lỗi cụ thể
    private String inputVerify(AddInvoiceInputDTO requestData) {
        if (requestData.getTenKH() == null || requestData.getTenKH().trim().isEmpty()) {
            return "Tên khách hàng không được để trống";
        }
        if (requestData.getNgayHoaDon() == null || requestData.getNgayHoaDon().trim().isEmpty()) {
            return "Ngày hóa đơn không được để trống";
        }
        if (requestData.getMaPhong() == null || requestData.getMaPhong().trim().isEmpty()) {
            return "Mã phòng không được để trống";
        }
        if (requestData.getDonGia() == null || requestData.getDonGia().trim().isEmpty()) {
            return "Đơn giá không được để trống";
        }
        if (requestData.getLoaiHoaDon() == null || requestData.getLoaiHoaDon().trim().isEmpty()) {
            return "Loại hóa đơn không được để trống";
        }

        try {
            double donGia = Double.parseDouble(requestData.getDonGia());
            if (donGia <= 0) {
                return "Đơn giá phải lớn hơn 0";
            }
            SimpleDateFormat formatDate = new SimpleDateFormat("yyyy-MM-dd");
            Date ngayHD = formatDate.parse(requestData.getNgayHoaDon());
            Date currentDate = new Date();
            if (ngayHD.after(currentDate)) {
                return "Ngày hóa đơn không được lớn hơn ngày hiện tại";
            }
            String loaiHD = requestData.getLoaiHoaDon();
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
