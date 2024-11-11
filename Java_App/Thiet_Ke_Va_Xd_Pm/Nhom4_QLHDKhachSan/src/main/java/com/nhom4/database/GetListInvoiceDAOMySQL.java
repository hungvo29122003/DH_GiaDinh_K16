package com.nhom4.database;

import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import com.nhom4.entity.Invoice;
import com.nhom4.entity.InvoiceGio;
import com.nhom4.entity.InvoiceNgay;
import com.nhom4.useCase.getListInvoice.GetListInvoiceDatabaseBoundary;

public class GetListInvoiceDAOMySQL extends DAOMySQL implements GetListInvoiceDatabaseBoundary {

    public GetListInvoiceDAOMySQL(String ipAddress, int port, String database, String username, String password) throws Exception {
        super(ipAddress, port, database, username, password);
    }

    @Override
    public List<Invoice> getAllInvoices() {
        List<Invoice> invoices = null;

        connect();

        String sql = "select * from invoice;";
        try {
            Statement statement = createStatement();
            ResultSet resultSet = statement.executeQuery(sql);
            invoices = new ArrayList<>();
            Invoice invoice;

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

                } else {
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

                invoices.add(invoice);
            }
        } catch (Exception ex) {
            ex.printStackTrace();
        }

        close();
        return invoices;
    }
}
