package Convert;

import Convert.CommandProcessor.Convert_CommandProcessor;
import Convert.Observer.Convert_Subcriber;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Convert_View extends JFrame implements Convert_Subcriber {
    // filed
    private JPanel jPanel;
    private JLabel jLabelCelsius, jLabelFahrenheit;
    private JTextField jTextFieldCelsius, jTextFieldFahrenheit;
    private JMenuBar jMenuBar;
    private Convert_Model convertModel;

    // methods
    Convert_View(Convert_Model convertModel) {
        this.convertModel = convertModel;
        this.convertModel.subcriber(this);

        init();
    }

    public void init() {
        builMenu();
        builPanel();

        add(jPanel);

        this.setTitle("Converter");
        this.setSize(400, 400);
        this.setVisible(true);
        this.setLocationRelativeTo(null);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }

    public void builPanel() {
        jPanel = new JPanel();

        jLabelCelsius = new JLabel("Celsius");
        jPanel.add(jLabelCelsius);
        jTextFieldCelsius = new JTextField(10);
        jPanel.add(jTextFieldCelsius);
        jLabelFahrenheit = new JLabel("Fahrenheit");
        jPanel.add(jLabelFahrenheit);
        jTextFieldFahrenheit = new JTextField(10);
        jPanel.add(jTextFieldFahrenheit);
    }

    public void builMenu() {
        jMenuBar = new JMenuBar();

        JMenu jMenu = new JMenu("Converter");
        JMenuItem jMenuItem_c2f = new JMenuItem("c2f");
        jMenu.add(jMenuItem_c2f);
        JMenuItem jMenuItem_f2c = new JMenuItem("f2c");
        jMenu.add(jMenuItem_f2c);
        JMenuItem jMenuItem_exit = new JMenuItem("Exit");
        jMenu.add(jMenuItem_exit);
        jMenuBar.add(jMenu);
        this.setJMenuBar(jMenuBar);
    }

    @Override
    public void update() {
        double result_F = convertModel.getResult_F();
        jTextFieldFahrenheit.setText("" + result_F);

        double result_C = convertModel.getResult_C();
        jTextFieldCelsius.setText("" +result_C);
    }

    public class enter_Controller implements ActionListener {
        private Convert_CommandProcessor CtoFcommandProcessor;
        private Convert_CommandProcessor FtoCcommandProcessor;

        enter_Controller(Convert_CommandProcessor CtoFcommandProcessor, Convert_CommandProcessor FtoCcommandProcessor) {
            this.CtoFcommandProcessor = CtoFcommandProcessor;
            this.FtoCcommandProcessor = FtoCcommandProcessor;
        }

        public void actionListener() {
            jTextFieldCelsius.addActionListener(this);
            jTextFieldFahrenheit.addActionListener(this);
        }

        @Override
        public void actionPerformed(ActionEvent e) {
            Object source = e.getSource();

            if (source == jTextFieldCelsius) {
                String celsiusText = jTextFieldCelsius.getText();
                if (!celsiusText.isEmpty()) {
                    double value1 = Double.parseDouble(celsiusText);

                    CtoFcommandProcessor.excute(value1);
                }
            } else {
                String fahrenheitText = jTextFieldFahrenheit.getText();
                if (!fahrenheitText.isEmpty()) {
                    double value2 = Double.parseDouble(fahrenheitText);

                    FtoCcommandProcessor.excute(value2);
                }
            }
        }
    }
    public class menu_Controller implements ActionListener {
        private Convert_CommandProcessor CtoFcommandProcessor;
        private Convert_CommandProcessor FtoCcommandProcessor;

        menu_Controller(Convert_CommandProcessor CtoFcommandProcessor, Convert_CommandProcessor FtoCcommandProcessor) {
            this.CtoFcommandProcessor = CtoFcommandProcessor;
            this.FtoCcommandProcessor = FtoCcommandProcessor;
        }

        public void actionListener() {
            for (int i = 0; i < jMenuBar.getMenu(0).getItemCount(); i++) {
                jMenuBar.getMenu(0).getItem(i).addActionListener(this);
            }
        }

        @Override
        public void actionPerformed(ActionEvent e) {
            Object source = e.getSource();

            if (source instanceof JMenuItem) {
                JMenuItem jMenuItem = (JMenuItem) source;

                if (jMenuItem.getText().equals("c2f")) {
                    String celsiusText = jTextFieldCelsius.getText();
                    if (!celsiusText.isEmpty()) {
                        double value1 = Double.parseDouble(celsiusText);

                        CtoFcommandProcessor.excute(value1);
                    }
                } else if (jMenuItem.getText().equals("f2c")) {
                    String fahrenheitText = jTextFieldFahrenheit.getText();
                    if (!fahrenheitText.isEmpty()) {
                        double value2 = Double.parseDouble(fahrenheitText);

                        FtoCcommandProcessor.excute(value2);
                    }
                } else {
                    System.exit(0);
                }
            }
        }
    }
}

