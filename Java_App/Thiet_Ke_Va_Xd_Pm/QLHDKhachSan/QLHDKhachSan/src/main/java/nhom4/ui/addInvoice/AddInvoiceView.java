package nhom4.ui.addInvoice;

import nhom4.useCase.addInvoice.AddInvoiceInputDTO;
import org.jdesktop.swingx.JXDatePicker;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.text.SimpleDateFormat;
import java.util.Calendar;

public class AddInvoiceView extends JFrame implements ActionListener {
    private AddInvoiceController addInvoiceController;
    private JTextField tf_TenKH, tf_MaPhong, tf_DonGia, tf_SoNgay, tf_SoGio;
    private JLabel lb_TenKH, lb_NgayHD, lb_MaPhong, lb_DonGia, lb_LoaiHoaDon, lb_SoNgay, lb_SoGio;
    private JComboBox<String> cb_LoaiHoaDon;
    private JButton addInvoiceBtn;
    private JXDatePicker dp_NgayHD;
    private SimpleDateFormat formatter = new SimpleDateFormat("yyyy-MM-dd");

    public AddInvoiceView() {

    }

    public void setAddInvoiceController(AddInvoiceController addInvoiceController) {
        this.addInvoiceController = addInvoiceController;
    }

    public void mainShow() {
        build();
        setTitle("Add Invoice Form");
        setSize(400, 400);
        setResizable(false);
        setLayout(new GridLayout(8, 2));
        setVisible(true);
    }

    private void build() {
        getContentPane().removeAll();

        // Initialize JLabels as instance variables
        lb_TenKH = new JLabel("Tên khách hàng:");
        lb_NgayHD = new JLabel("Ngày hóa đơn:");
        lb_MaPhong = new JLabel("Mã phòng:");
        lb_DonGia = new JLabel("Đơn giá:");
        lb_LoaiHoaDon = new JLabel("Loại hóa đơn:");
        lb_SoNgay = new JLabel("Số ngày:");
        lb_SoGio = new JLabel("Số giờ:");

        // Initialize JTextFields as instance variables
        tf_TenKH = new JTextField();
        tf_MaPhong = new JTextField();
        tf_DonGia = new JTextField();
        tf_SoNgay = new JTextField();
        tf_SoGio = new JTextField();

        // Initialize JComboBox as instance variables
        String[] options = {"", "Theo giờ", "Theo ngày"};
        cb_LoaiHoaDon = new JComboBox<>(options);

        // Initialize JXDatePicker
        dp_NgayHD = new JXDatePicker();
        dp_NgayHD.setDate(Calendar.getInstance().getTime());
        dp_NgayHD.setFormats(formatter);

        // Add JLabels and JTextFields to the frame
        add(lb_TenKH);
        add(tf_TenKH);
        add(lb_NgayHD);
        add(dp_NgayHD);
        add(lb_MaPhong);
        add(tf_MaPhong);
        add(lb_DonGia);
        add(tf_DonGia);
        add(lb_LoaiHoaDon);
        add(cb_LoaiHoaDon);
        add(lb_SoNgay);
        add(tf_SoNgay);
        add(lb_SoGio);
        add(tf_SoGio);

        // Create and add submit button
        addInvoiceBtn = new JButton("Add");
        addInvoiceBtn.addActionListener(this);
        add(new JLabel()); // Empty cell in grid
        add(addInvoiceBtn);
    }

    public void showMsgResult(AddInvoiceViewModel addInvoiceViewModel) {
        // Show alert dialog
        JOptionPane.showMessageDialog(null,
                addInvoiceViewModel.msg,
                addInvoiceViewModel.status,
                JOptionPane.INFORMATION_MESSAGE);
    }

    public void showMsgError(AddInvoiceViewModel addInvoiceViewModel) {
        // Show alert dialog
        JOptionPane.showMessageDialog(null,
                addInvoiceViewModel.msg,
                addInvoiceViewModel.status,
                JOptionPane.ERROR_MESSAGE);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        String cmd = e.getActionCommand();

        if (cmd.equals("Add")) {
            AddInvoiceInputDTO addInvoiceInputDTO = new AddInvoiceInputDTO();

            addInvoiceInputDTO.setTenKH(tf_TenKH.getText());
            addInvoiceInputDTO.setNgayHoaDon(formatter.format(dp_NgayHD.getDate()));
            addInvoiceInputDTO.setMaPhong(tf_MaPhong.getText());
            addInvoiceInputDTO.setDonGia(tf_DonGia.getText());
            addInvoiceInputDTO.setLoaiHoaDon(cb_LoaiHoaDon.getSelectedItem().toString());
            addInvoiceInputDTO.setSoNgay(tf_SoNgay.getText());
            addInvoiceInputDTO.setSoGio(tf_SoGio.getText());

            addInvoiceController.execute(addInvoiceInputDTO);
        }
    }
}
