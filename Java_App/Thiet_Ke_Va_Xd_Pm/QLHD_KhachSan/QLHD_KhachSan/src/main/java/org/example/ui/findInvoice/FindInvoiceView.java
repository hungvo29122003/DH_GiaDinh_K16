package org.example.ui.findInvoice;

import org.example.useCase.findInvoice.FindInvoiceInputDTO;

import javax.swing.*;
import javax.swing.table.DefaultTableModel;
import java.awt.*;
import java.util.List;

public class FindInvoiceView extends JFrame {
    private FindInvoiceController findInvoiceController;
    private JTextField tf_MaHD, tf_TenKH, tf_NgayHD;
    private JButton findInvoiceBtn, resetButton;
    private JPanel searchPanel, resultPanel;
    private JTable table;
    private DefaultTableModel tableModel;
    private List<FindInvoiceViewModel> listViewModel;

    public FindInvoiceView() {
        build();
    }

    private void build() {
        // Basic frame setup
        setTitle("Tìm kiếm hóa đơn khách sạn");
        setSize(800, 600);
        setResizable(false);
        setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        setLayout(new BorderLayout(10, 10));

        // Main content panel with padding
        JPanel mainPanel = new JPanel();
        mainPanel.setLayout(new BoxLayout(mainPanel, BoxLayout.Y_AXIS));
        mainPanel.setBorder(BorderFactory.createEmptyBorder(10, 10, 10, 10));

        // Search panel
        searchPanel = new JPanel(new GridLayout(3, 2, 5, 5));
        searchPanel.setBorder(BorderFactory.createTitledBorder("Thông tin tìm kiếm"));

        // Mã hóa đơn
        searchPanel.add(new JLabel("Mã hóa đơn:"));
        tf_MaHD = new JTextField();
        searchPanel.add(tf_MaHD);

        // Tên khách hàng
        searchPanel.add(new JLabel("Tên khách hàng:"));
        tf_TenKH = new JTextField();
        searchPanel.add(tf_TenKH);

//        // Ngày hóa đơn
//        searchPanel.add(new JLabel("Ngày hóa đơn:"));
//        tf_NgayHD = new JTextField();
//        searchPanel.add(tf_NgayHD);

        // Button panel
        JPanel buttonPanel = new JPanel();
        buttonPanel.setLayout(new FlowLayout(FlowLayout.CENTER, 50, 10));
        findInvoiceBtn = new JButton("Tìm kiếm");
        resetButton = new JButton("Làm mới");

        // Style buttons
        Dimension buttonSize = new Dimension(100, 30);
        findInvoiceBtn.setPreferredSize(buttonSize);
        resetButton.setPreferredSize(buttonSize);

        buttonPanel.add(findInvoiceBtn);
        buttonPanel.add(resetButton);

        // Result panel
        resultPanel = new JPanel(new BorderLayout());
        resultPanel.setBorder(BorderFactory.createTitledBorder("Kết quả tìm kiếm"));

        String[] columns = {
                "Mã HD", "Tên KH", "Ngày HD", "Mã phòng", "Đơn giá", "Loại hóa đơn", "Số ngày", "Số giờ", "Thành tiền"
        };
        tableModel = new DefaultTableModel(columns, 0);
        table = new JTable(tableModel);

        JScrollPane scrollPane = new JScrollPane(table);
        scrollPane.setPreferredSize(new Dimension(750, 400));
        resultPanel.add(scrollPane, BorderLayout.CENTER);

        // Add all panels to main panel
        mainPanel.add(searchPanel);
        mainPanel.add(Box.createRigidArea(new Dimension(0, 10)));
        mainPanel.add(buttonPanel);
        mainPanel.add(Box.createRigidArea(new Dimension(0, 10)));
        mainPanel.add(resultPanel);

        // Add main panel to frame
        add(mainPanel);

        // Button listeners
        findInvoiceBtn.addActionListener(e -> handleFindInvoice());
        resetButton.addActionListener(e -> resetForm());

        // Center the frame on screen
        setLocationRelativeTo(null);
    }

    private void handleFindInvoice() {
        FindInvoiceInputDTO findInvoiceInputDTO = new FindInvoiceInputDTO();
        findInvoiceInputDTO.setMaHD(tf_MaHD.getText().trim());
        findInvoiceInputDTO.setTenKH(tf_TenKH.getText().trim());
//        findInvoiceInputDTO.setNgayHD(tf_NgayHD.getText().trim());
        findInvoiceController.execute(findInvoiceInputDTO);
    }

    private void resetForm() {
        tf_MaHD.setText("");
        tf_TenKH.setText("");
//        tf_NgayHD.setText("");
        tableModel.setRowCount(0);
    }

    public void showResult(List<FindInvoiceViewModel> listViewModel) {
        this.listViewModel = listViewModel;
        tableModel.setRowCount(0);

        for (FindInvoiceViewModel viewModel : listViewModel) {
            Object[] row = {
                    viewModel.maHD,
                    viewModel.tenKH,
                    viewModel.ngayHD,
                    viewModel.maPhong,
                    viewModel.donGia,
                    viewModel.loaiHoaDon,
                    viewModel.soNgay,
                    viewModel.soGio,
                    viewModel.thanhTien
            };
            tableModel.addRow(row);
        }
    }

    public void showMsgError(FindInvoiceViewModel findInvoiceViewModel) {
        JOptionPane.showMessageDialog(this,
                findInvoiceViewModel.msg,
                findInvoiceViewModel.status,
                JOptionPane.ERROR_MESSAGE);
    }

    public void setFindInvoiceController(FindInvoiceController findInvoiceController) {
        this.findInvoiceController = findInvoiceController;
    }

    public void mainShow() {
        setVisible(true);
    }
}