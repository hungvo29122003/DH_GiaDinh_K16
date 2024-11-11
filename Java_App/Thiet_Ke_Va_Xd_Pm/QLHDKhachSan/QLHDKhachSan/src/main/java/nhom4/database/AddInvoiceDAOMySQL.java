package nhom4.database;

import java.sql.Date;
import java.sql.PreparedStatement;

import nhom4.database.DAOMySQL;
import nhom4.entity.Invoice;
import nhom4.entity.InvoiceGio;
import nhom4.entity.InvoiceNgay;
import nhom4.useCase.addInvoice.AddInvoiceDatabaseBoundary;

public class AddInvoiceDAOMySQL extends DAOMySQL implements AddInvoiceDatabaseBoundary {

    public AddInvoiceDAOMySQL(String ipAddress, int port, String database, String username, String password) throws Exception {
        super(ipAddress, port, database, username, password);
    }

    @Override
    public void addInvoic(Invoice invoice) {
        connect();
        String sql = "INSERT INTO invoice (tenKH, ngayHD, maPhong, donGia, loaiHD, soNgay, soGio) VALUES (?, ?, ?, ?, ?, ?, ?);";

        try {
            PreparedStatement preparedStatement = getPrepareStatement(sql);
            preparedStatement.setString(1, invoice.getTenKH());
            preparedStatement.setDate(2, new Date(invoice.getNgayHoaDon().getTime()));
            preparedStatement.setString(3, invoice.getMaPhong());
            preparedStatement.setDouble(4, invoice.getDonGia());

            if (invoice instanceof InvoiceGio) {
                InvoiceGio invoiceGio = (InvoiceGio) invoice;
                preparedStatement.setString(5, invoiceGio.getLoaiHoaDon());
                preparedStatement.setInt(6, 0);
                preparedStatement.setInt(7, invoiceGio.getSoGio());
            } else if (invoice instanceof InvoiceNgay) {
                InvoiceNgay invoiceNgay = (InvoiceNgay) invoice;
                preparedStatement.setString(5, invoiceNgay.getLoaiHoaDon());
                preparedStatement.setInt(6, invoiceNgay.getSoNgay());
                preparedStatement.setInt(7, 0);
            }

            preparedStatement.execute();
        } catch (Exception ex) {
            ex.printStackTrace();
        }
        close();
    }
}
