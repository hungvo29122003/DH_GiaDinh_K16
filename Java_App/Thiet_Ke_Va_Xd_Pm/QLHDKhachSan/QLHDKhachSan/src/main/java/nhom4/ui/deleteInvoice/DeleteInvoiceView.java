package nhom4.ui.deleteInvoice;

import com.nhom4.useCase.deleteInvoice.DeleteInvoiceInputDTO;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class DeleteInvoiceView extends JFrame implements ActionListener {
    private DeleteInvoiceController deleteInvoiceController;
    private JLabel lb_maHD;
    private JTextField tf_maHD;

    public DeleteInvoiceView() {

    }

    public void mainShow() {
        build();
        setTitle("Xóa hóa đơn khách sạn");
        setSize(400, 300);
        setResizable(false);
        setLayout(new GridLayout(4, 2));
        setVisible(true);
        setVisible(true);
    }

    private void build() {
        getContentPane().removeAll();

        // Initialize JLabels as instance variables
        lb_maHD = new JLabel("Mã hóa đơn:");

        // Initialize JTextFields as instance variables
        tf_maHD = new JTextField();

        // Add JLabels and JTextFields to the frame
        add(lb_maHD);
        add(tf_maHD);

        // Create and add submit button
        JButton btnSubmit = new JButton("Delete");
        btnSubmit.addActionListener(this);
        add(new JLabel()); // Empty cell in grid
        add(btnSubmit);
    }

    public void showMsgResult(DeleteInvoiceViewModel deleteInvoiceViewModel) {
        // Show alert dialog
        JOptionPane.showMessageDialog(null,
                deleteInvoiceViewModel.msg,
                deleteInvoiceViewModel.status,
                JOptionPane.INFORMATION_MESSAGE);
    }

    public void showMsgError(DeleteInvoiceViewModel deleteInvoiceViewModel) {
        // Show alert dialog
        JOptionPane.showMessageDialog(null,
                deleteInvoiceViewModel.msg,
                deleteInvoiceViewModel.status,
                JOptionPane.ERROR_MESSAGE);
    }

    public void setDeleteInvoiceController(DeleteInvoiceController deleteInvoiceController) {
        this.deleteInvoiceController = deleteInvoiceController;
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        String cmd = e.getActionCommand();
        if (cmd.equals("Delete")) {
            DeleteInvoiceInputDTO deleteInvoiceInputDTO = new DeleteInvoiceInputDTO();
            deleteInvoiceInputDTO.setMaHD(tf_maHD.getText());

            deleteInvoiceController.execute(deleteInvoiceInputDTO);
        }
    }
}
