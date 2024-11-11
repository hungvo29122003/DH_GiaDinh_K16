package org.example.ui.getListInvoice;

import javax.swing.*;
import javax.swing.table.DefaultTableCellRenderer;
import javax.swing.table.DefaultTableModel;
import java.awt.*;
import java.util.ArrayList;
import java.util.List;

public class GetListInvoiceView extends JFrame {
    private GetListInvoiceController getListInvoiceController;
    private List<GetListInvoiceViewModel> listInvoice = new ArrayList<>();

    public GetListInvoiceView() {
        build();
    }

    private void build() {
        // Basic frame setup
        setTitle("Xuất hóa đơn khách sạn");
        setSize(900, 500);
        setResizable(false);
        setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        setLayout(new BorderLayout(10, 10));

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

        // Custom renderer
        table.setDefaultRenderer(Object.class, new InvoiceCellRenderer());

        // Lay data


        // Add invoice data to the table
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
        this.add(titleLabel, BorderLayout.NORTH); // Add title label at the top
        this.add(scrollPane, BorderLayout.CENTER); // Add the table in the center

        // Make the frame visible
        this.setLocationRelativeTo(null);
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

    public void showResult(List<GetListInvoiceViewModel> listInvoice) {
        this.listInvoice = listInvoice;
        build(); // Call build to refresh the view with new data
    }

    public void showMsgError(GetListInvoiceViewModel responseData) {
        // Show alert dialog
        JOptionPane.showMessageDialog(null,
                responseData.msg,
                responseData.status,
                JOptionPane.ERROR_MESSAGE);
    }

    public void mainShow() {
        setVisible(true);
    }
}