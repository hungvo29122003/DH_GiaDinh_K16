package nhom4.ui.findInvoice;



import nhom4.useCase.findInvoice.FindInvoiceInputDTO;

import javax.swing.*;
import javax.swing.table.DefaultTableCellRenderer;
import javax.swing.table.DefaultTableModel;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.List;

public class FindInvoiceView extends JFrame implements ActionListener {
    private FindInvoiceController findInvoiceController;
    private JLabel lb_TenKH;
    private JTextField tf_TenKH;
    private JButton findInvoiceBtn;
    private List<FindInvoiceViewModel> listViewModel;

    public FindInvoiceView() {

    }

    public void mainShow() {
        buildFind();
        setTitle("Tìm kiếm hóa đơn khách sạn");
        setSize(400, 400);
        setResizable(false);
        setLayout(new GridLayout(6, 2));
        setVisible(true);
    }

    private void buildFind() {
        getContentPane().removeAll();

        // Initialize JLabels as instance variables
        lb_TenKH = new JLabel("Tên khách hàng: ");

        // Initialize JTextFields as instance variables
        tf_TenKH = new JTextField();

        // Add JLabels and JTextFields to the frame
        add(lb_TenKH);
        add(tf_TenKH);

        // Create and add submit button
        findInvoiceBtn = new JButton("Find");
        findInvoiceBtn.addActionListener(this);
        add(new JLabel()); // Empty cell in grid
        add(findInvoiceBtn);
    }

    public void showMsgError(FindInvoiceViewModel findInvoiceViewModel) {
        JOptionPane.showMessageDialog(null,
                findInvoiceViewModel.msg,
                findInvoiceViewModel.status,
                JOptionPane.ERROR_MESSAGE);
    }


    public void setFindInvoiceController(FindInvoiceController findInvoiceController) {
        this.findInvoiceController = findInvoiceController;
    }


    @Override
    public void actionPerformed(ActionEvent e) {
        String cmd = e.getActionCommand();

        if (cmd.equals(findInvoiceBtn.getActionCommand())) {
            FindInvoiceInputDTO findInvoiceInputDTO = new FindInvoiceInputDTO();
            findInvoiceInputDTO.setTenKH(tf_TenKH.getText());
            findInvoiceController.execute(findInvoiceInputDTO);
        }
    }

    public void showResult(List<FindInvoiceViewModel> listViewModel) {
        this.listViewModel = listViewModel;
        getContentPane().removeAll();
        setTitle("Tìm kiếm hóa đơn khách sạn");
        setResizable(false);
        setSize(900, 500);

        // Create title label
        JLabel titleLabel = new JLabel("DANH SÁCH HÓA ĐƠN KHÁCH SẠN", SwingConstants.CENTER);
        titleLabel.setFont(new Font("Arial", Font.BOLD, 24));
        titleLabel.setBorder(BorderFactory.createEmptyBorder(10, 0, 10, 0)); // Padding around the title

        // Column headers for the JTable
        String[] columns = {
                "Mã HD", "Tên KH", "Ngày HD", "Mã phòng", "Đơn giá", "Loại hóa đơn", "Số ngày", "Số giờ", "Thành tiền"
        };

        // Create table model
        DefaultTableModel tableModel = new DefaultTableModel(columns, 0);
        JTable table = new JTable(tableModel);

        //custom
        table.setDefaultRenderer(Object.class, new InvoiceCellRenderer());

        // Add student data to the table
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

            FindInvoiceViewModel vm = listViewModel.get(row);

            // if(column == 5){
            //     c.setForeground(vm.textColor);
            //         if(vm.bold){
            //             c.setFont(c.getFont().deriveFont(Font.BOLD));
            //         }

            //         if (vm.bold && vm.italic) {
            //             c.setFont(c.getFont().deriveFont(Font.BOLD | Font.ITALIC));
            //         }

            // } else {
            //     c.setForeground(Color.BLACK);
            // }

            return c;
        }
    }

}
