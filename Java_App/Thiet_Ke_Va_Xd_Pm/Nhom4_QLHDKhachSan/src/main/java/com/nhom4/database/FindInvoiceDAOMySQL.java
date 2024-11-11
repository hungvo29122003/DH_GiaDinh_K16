package com.nhom4.database;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import com.nhom4.entity.Invoice;
import com.nhom4.entity.InvoiceGio;
import com.nhom4.entity.InvoiceNgay;
import com.nhom4.useCase.findInvoice.FindInvoiceDatabaseBoundary;

public class FindInvoiceDAOMySQL extends DAOMySQL implements FindInvoiceDatabaseBoundary {
    public FindInvoiceDAOMySQL(String ipAddress, int port, String database, String username, String password) throws Exception {
        super(ipAddress, port, database, username, password);
    }

    @Override
    public List<Invoice> findInvoice(String tenKH) {
        List<Invoice> listInvoices = null;
        connect();

        String sql = "SELECT * FROM invoice WHERE (tenKH like ?);";
        try {
            PreparedStatement preparedStatement = getPrepareStatement(sql);
            preparedStatement.setString(1, "%" + tenKH + "%");

            ResultSet resultSet = preparedStatement.executeQuery();

            listInvoices = new ArrayList<>();
            Invoice invoice = null;

            while (resultSet.next()) {
                if (resultSet.getString("loaiHD").equals("Theo ngày")) {
                    invoice = new InvoiceNgay(
                            resultSet.getInt("maHD"),
                            resultSet.getString("tenKH"),
                            resultSet.getDate("ngayHD"),
                            resultSet.getString("maPhong"),
                            resultSet.getDouble("donGia"),
                            resultSet.getString("loaiHD"),
                            resultSet.getInt("soNgay")
                    );

                } else if (resultSet.getString("loaiHD").equals("Theo giờ")) {
                    invoice = new InvoiceGio(
                            resultSet.getInt("maHD"),
                            resultSet.getString("tenKH"),
                            resultSet.getDate("ngayHD"),
                            resultSet.getString("maPhong"),
                            resultSet.getDouble("donGia"),
                            resultSet.getString("loaiHD"),
                            resultSet.getInt("soGio")
                    );

                }

                listInvoices.add(invoice);
            }
        } catch (Exception ex) {
            ex.printStackTrace();
        }

        close();
        return listInvoices;
    }
}
