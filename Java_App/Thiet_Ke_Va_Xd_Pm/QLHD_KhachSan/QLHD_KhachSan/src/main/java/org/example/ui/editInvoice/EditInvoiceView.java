//package org.example.ui.editInvoice;
//
//import com.nhom4.useCase.editInvoice.EditInvoiceInputDTO;
//import org.jdesktop.swingx.JXDatePicker;
//
//import javax.swing.*;
//import java.awt.*;
//import java.awt.event.ActionEvent;
//import java.awt.event.ActionListener;
//import java.text.SimpleDateFormat;
//import java.util.Calendar;
//
//public class EditInvoiceView extends JFrame implements ActionListener {
//    private EditInvoiceController editInvoiceController;
//    private JTextField tf_MaHD, tf_TenKH, tf_MaPhong, tf_DonGia, tf_SoNgay, tf_SoGio;
//    private JLabel lb_MaHD, lb_TenKH, lb_NgayHD, lb_MaPhong, lb_DonGia, lb_LoaiHoaDon, lb_SoNgay, lb_SoGio;
//    private JComboBox<String> cb_LoaiHoaDon;
//    private JButton editInvoiceBtn, findInvoiceBtn;
//    private JXDatePicker dp_NgayHD;
//    private SimpleDateFormat formatter = new SimpleDateFormat("yyyy-MM-dd");
//
//    public EditInvoiceView() {
//
//    }
//
//    public void mainShow() {
//        buildFind();
//        setTitle("Sửa hóa đơn khách sạn");
//        setSize(400, 400);
//        setResizable(false);
//        setLayout(new GridLayout(6, 2));
//        setVisible(true);
//    }
//
//    private void mainShowEdit() {
//        setTitle("Sửa hóa đơn khách sạn");
//        setSize(400, 400);
//        setResizable(false);
//        setLayout(new GridLayout(9, 2));
//        setVisible(true);
//    }
//
//    private void build() {
//        getContentPane().removeAll();
//
//        // Initialize JLabels as instance variables
//        lb_MaHD = new JLabel("Mã hóa đơn:");
//        lb_TenKH = new JLabel("Tên khách hàng:");
//        lb_NgayHD = new JLabel("Ngày hóa đơn:");
//        lb_MaPhong = new JLabel("Mã phòng:");
//        lb_DonGia = new JLabel("Đơn giá:");
//        lb_LoaiHoaDon = new JLabel("Loại hóa đơn:");
//        lb_SoNgay = new JLabel("Số ngày:");
//        lb_SoGio = new JLabel("Số giờ:");
//
//        // Initialize JTextFields as instance variables
//        tf_MaHD = new JTextField(10);
//        tf_TenKH = new JTextField(10);
//        tf_MaPhong = new JTextField(10);
//        tf_DonGia = new JTextField(10);
//        tf_SoNgay = new JTextField(10);
//        tf_SoGio = new JTextField(10);
//
//        // Initialize JComboBox as instance variables
//        String[] options = {"", "Theo giờ", "Theo ngày"};
//        cb_LoaiHoaDon = new JComboBox<>(options);
//
//        // Initialize JXDatePicker
//        dp_NgayHD = new JXDatePicker();
//        dp_NgayHD.setDate(Calendar.getInstance().getTime());
//        dp_NgayHD.setFormats(formatter);
//
//        // Add JLabels and JTextFields to the frame
//        add(lb_MaHD);
//        add(tf_MaHD);
//        add(lb_TenKH);
//        add(tf_TenKH);
//        add(lb_NgayHD);
//        add(dp_NgayHD);
//        add(lb_MaPhong);
//        add(tf_MaPhong);
//        add(lb_DonGia);
//        add(tf_DonGia);
//        add(lb_LoaiHoaDon);
//        add(cb_LoaiHoaDon);
//        add(lb_SoNgay);
//        add(tf_SoNgay);
//        add(lb_SoGio);
//        add(tf_SoGio);
//
//        // Create and add submit button
//        editInvoiceBtn = new JButton("Update");
//        editInvoiceBtn.addActionListener(this);
//        add(new JLabel());
//        add(editInvoiceBtn);
//    }
//
//    private void buildFind() {
//        getContentPane().removeAll();
//
//        // Initialize JLabels as instance variables
//        lb_MaHD = new JLabel("Mã hóa đơn: ");
//
//        // Initialize JTextFields as instance variables
//        tf_MaHD = new JTextField();
//
//        // Add JLabels and JTextFields to the frame
//        add(lb_MaHD);
//        add(tf_MaHD);
//
//        // Create and add submit button
//        findInvoiceBtn = new JButton("Find");
//        findInvoiceBtn.addActionListener(this);
//        add(new JLabel()); // Empty cell in grid
//        add(findInvoiceBtn);
//    }
//
//    public void setEditInvoiceController(EditInvoiceController editInvoiceController) {
//        this.editInvoiceController = editInvoiceController;
//    }
//
//    public void showInvoice(EditInvoiceViewModel editInvoiceViewModel) {
//        String maHD = editInvoiceViewModel.maHD;
//        String tenKH = editInvoiceViewModel.tenKH;
//        String ngayHD = editInvoiceViewModel.ngayHD;
//        String maPhong = editInvoiceViewModel.maPhong;
//        String donGia = editInvoiceViewModel.donGia;
//        String loaiHoaDon = editInvoiceViewModel.loaiHoaDon;
//        String soNgay = editInvoiceViewModel.soNgay;
//        String soGio = editInvoiceViewModel.soGio;
//
//        build();
//
//        tf_MaHD.setText(maHD);
//        tf_TenKH.setText(tenKH);
//
//        try {
//            dp_NgayHD.setDate(formatter.parse(ngayHD));
//        } catch (Exception e) {
//            e.printStackTrace();
//        }
//
//        tf_MaPhong.setText(maPhong);
//        tf_DonGia.setText(donGia);
//        cb_LoaiHoaDon.setSelectedItem(loaiHoaDon);
//        tf_SoNgay.setText(soNgay);
//        tf_SoGio.setText(soGio);
//        mainShowEdit();
//    }
//
//    public void showMsgResult(EditInvoiceViewModel editInvoiceViewModel) {
//        // Show alert dialog
//        JOptionPane.showMessageDialog(null,
//                editInvoiceViewModel.msg,
//                editInvoiceViewModel.status,
//                JOptionPane.INFORMATION_MESSAGE);
//    }
//
//    public void showMsgError(EditInvoiceViewModel editInvoiceViewModel) {
//        // Show alert dialog
//        JOptionPane.showMessageDialog(null,
//                editInvoiceViewModel.msg,
//                editInvoiceViewModel.status,
//                JOptionPane.ERROR_MESSAGE);
//    }
//
//    @Override
//    public void actionPerformed(ActionEvent e) {
//        String cmd = e.getActionCommand();
//        EditInvoiceInputDTO editInvoiceInputDTO = new EditInvoiceInputDTO();
//
//        if (cmd.equals(findInvoiceBtn.getActionCommand())) {
//            editInvoiceInputDTO.setMaHD(tf_MaHD.getText());
//            editInvoiceController.executeFind(editInvoiceInputDTO);
//        }
//
//        if (cmd.equals(editInvoiceBtn.getActionCommand())) {
//            editInvoiceInputDTO.setMaHD(tf_MaHD.getText());
//            editInvoiceInputDTO.setTenKH(tf_TenKH.getText());
//            editInvoiceInputDTO.setNgayHD(formatter.format(dp_NgayHD.getDate()));
//            editInvoiceInputDTO.setMaPhong(tf_MaPhong.getText());
//            editInvoiceInputDTO.setDonGia(tf_DonGia.getText());
//            editInvoiceInputDTO.setLoaiHoaDon(cb_LoaiHoaDon.getSelectedItem().toString());
//            editInvoiceInputDTO.setSoNgay(tf_SoNgay.getText());
//            editInvoiceInputDTO.setSoGio(tf_SoGio.getText());
//            editInvoiceController.execute(editInvoiceInputDTO);
//        }
//    }
//}
