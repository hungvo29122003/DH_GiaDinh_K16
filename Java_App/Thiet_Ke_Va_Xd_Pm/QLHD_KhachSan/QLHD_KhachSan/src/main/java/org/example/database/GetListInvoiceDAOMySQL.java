package org.example.database;

import org.example.entity.Invoice;
import org.example.entity.InvoiceGio;
import org.example.entity.InvoiceNgay;
import org.example.useCase.getListInvoice.GetListInvoiceDatabaseBoundary;

import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

public class GetListInvoiceDAOMySQL extends DAOMySQL implements GetListInvoiceDatabaseBoundary {

    public GetListInvoiceDAOMySQL(String ipAddress, int port, String database, String username, String password) throws Exception {
        super(ipAddress, port, database, username, password);
    }

    @Override
    public List<Invoice> getAllInvoice() {
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
