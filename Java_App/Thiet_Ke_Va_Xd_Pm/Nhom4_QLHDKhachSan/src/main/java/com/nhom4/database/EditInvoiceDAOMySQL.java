package com.nhom4.database;

import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.text.SimpleDateFormat;

import com.nhom4.useCase.editInvoice.EditInvoiceDatabaseBoundary;
import com.nhom4.entity.Invoice;
import com.nhom4.entity.InvoiceGio;
import com.nhom4.entity.InvoiceNgay;

public class EditInvoiceDAOMySQL extends DAOMySQL implements EditInvoiceDatabaseBoundary {

    public EditInvoiceDAOMySQL(String ipAddress, int port, String database, String username, String password) throws Exception {
        super(ipAddress, port, database, username, password);
    }

    @Override
    public Invoice getInvoice(int maHD) {
        connect();
        Invoice invoice = null;
        String sql = "SELECT * FROM invoice WHERE (maHD = ?);";

        try {
            PreparedStatement preparedStatement = getPrepareStatement(sql);
            preparedStatement.setInt(1, maHD);

            ResultSet resultSet = preparedStatement.executeQuery();

            if (resultSet.next()) {
                String tenKH = resultSet.getString("tenKH");
                Date ngayHD = resultSet.getDate("ngayHD");
                String maPhong = resultSet.getString("maPhong");
                int donGia = resultSet.getInt("donGia");
                String loaiHoaDon = resultSet.getString("loaiHD");
                int soNgay = resultSet.getInt("soNgay");
                int soGio = resultSet.getInt("soGio");


                if (loaiHoaDon.equals("Theo ngày")) {
                    invoice = new InvoiceNgay(maHD, tenKH, ngayHD, maPhong, donGia, loaiHoaDon, soNgay);
                } else if (loaiHoaDon.equals("Theo giờ")) {
                    invoice = new InvoiceGio(maHD, tenKH, ngayHD, maPhong, donGia, loaiHoaDon, soGio);
                }
            }

        } catch (Exception e) {
            e.printStackTrace();
        }
        close();
        return invoice;
    }

    @Override
    public void updateInvoice(Invoice invoice) {
        connect();
        SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd");
        String sql = "UPDATE invoice SET tenKH = ?, ngayHD = ?, maPhong = ?, donGia = ?, loaiHD = ?, soNgay = ?, soGio = ?  WHERE (maHD = ?);";

        try {
            PreparedStatement preparedStatement = getPrepareStatement(sql);
            preparedStatement.setString(1, invoice.getTenKhachHang());

            preparedStatement.setString(2, dateFormat.format(invoice.getNgayHoaDon()));
            preparedStatement.setString(3, invoice.getMaPhong());
            preparedStatement.setDouble(4, invoice.getDonGia());
            if (invoice.getClass().equals(InvoiceGio.class)) {
                InvoiceGio invoiceGio = (InvoiceGio) invoice;

                preparedStatement.setString(5, invoice.getLoaiHoaDon());
                preparedStatement.setInt(6, 0);
                preparedStatement.setInt(7, invoiceGio.getSoGio());
            } else if (invoice.getClass().equals(InvoiceNgay.class)) {
                InvoiceNgay invoiceNgay = (InvoiceNgay) invoice;

                preparedStatement.setString(5, invoiceNgay.getLoaiHoaDon());
                preparedStatement.setInt(6, invoiceNgay.getSoNgay());
                preparedStatement.setInt(7, 0);
            }

            preparedStatement.setInt(8, invoice.getMaHD());
            preparedStatement.execute();
        } catch (Exception e) {
            e.printStackTrace();
        }
        close();
    }
}
