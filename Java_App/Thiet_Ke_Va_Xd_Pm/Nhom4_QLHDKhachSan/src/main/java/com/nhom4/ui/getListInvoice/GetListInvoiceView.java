package com.nhom4.ui.getListInvoice;

import java.awt.BorderLayout;
import java.awt.Component;
import java.awt.Font;
import java.util.List;

import javax.swing.BorderFactory;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.SwingConstants;
import javax.swing.table.DefaultTableCellRenderer;
import javax.swing.table.DefaultTableModel;

public class GetListInvoiceView extends JFrame {
    private GetListInvoiceController getListInvoiceController;
    private List<GetListInvoiceViewModel> listInvoice;

    public GetListInvoiceView() {

    }

    public void mainShow() {
        getContentPane().removeAll();
        getListInvoiceController.execute();
    }

    public void showResult(List<GetListInvoiceViewModel> listInvoice) {
        this.listInvoice = listInvoice;
        setTitle("Xuất hóa đơn khách sạn");
        setResizable(false);
        setSize(900, 500);

        // Create title label
        JLabel titleLabel = new JLabel("DANH SÁCH HÓA ĐƠN KHÁCH SẠN", SwingConstants.CENTER);
        titleLabel.setFont(new Font("Arial", Font.BOLD, 24));
        titleLabel.setBorder(BorderFactory.createEmptyBorder(10, 0, 10, 0)); // Padding around the title

        // Column headers for the JTable
        String[] columns = {
                "Mã HD", "Tên KH", "Ngày HD", "Mã phòng", "Đơn giá", "Loại HD", "Số ngày", "Số giờ", "Thành tiền"
        };

        // Create table model
        DefaultTableModel tableModel = new DefaultTableModel(columns, 0);
        JTable table = new JTable(tableModel);

        //custom
        table.setDefaultRenderer(Object.class, new InvoiceCellRenderer());

        // Add student data to the table
        for (GetListInvoiceViewModel invoice : listInvoice) {
            Object[] row = {
                    invoice.maHD,
                    invoice.tenKH,
                    invoice.ngayHD,
                    invoice.maPhong,
                    invoice.donGia,
                    invoice.loaiHoaDon,
                    invoice.soNgay,
                    invoice.soGio,
                    invoice.thanhTien
            };
            tableModel.addRow(row);
        }

        // Add the table to a scroll pane
        JScrollPane scrollPane = new JScrollPane(table);

        // Set up layout for the frame
        this.setLayout(new BorderLayout());
        this.add(titleLabel, BorderLayout.NORTH); // Add title label at the top
        this.add(scrollPane, BorderLayout.CENTER); // Add the table in the center

        // Make the frame visible
        this.setLocationRelativeTo(null);
        this.setVisible(true);
    }

    class InvoiceCellRenderer extends DefaultTableCellRenderer {
        @Override
        public Component getTableCellRendererComponent(JTable table, Object value, boolean isSelected, boolean hasFocus, int row, int column) {
            Component c = super.getTableCellRendererComponent(table, value, isSelected, hasFocus, row, column);

            GetListInvoiceViewModel vm = listInvoice.get(row);

            return c;
        }
    }

    public void setGetListInvoiceController(GetListInvoiceController getListInvoiceController) {
        this.getListInvoiceController = getListInvoiceController;
    }

    public void showMsgError(GetListInvoiceViewModel responseData) {
        // Show alert dialog
        JOptionPane.showMessageDialog(null,
                responseData.msg,
                responseData.status,
                JOptionPane.ERROR_MESSAGE);
    }
}
