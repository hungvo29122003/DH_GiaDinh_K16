package buoi4;

import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class CalculatorView extends JFrame implements ActionListener {

    // field
    private String title;
    private JPanel jPanelRemote;
    private JLabel jLabelInput1Remote, jLabelInput2Remote,
            jLabelOutputRemote;
    private JTextField jTextFieldInput1Remote, jTextFieldInput2Remote;
    private JButton addButtonRemote, subButtonRemote, mulButtonRemote, divButtonRemote;
    private CalculatorModel calculatorModelRemote;

    // function , method
    CalculatorView() {
        calculatorModelRemote = new CalculatorModel();
        buildPanel();
        add(jPanelRemote);
        title = "Frame Viewer";
        setTitle(title);
        setSize(400, 400);
        setVisible(true);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null);

    }

    public void buildPanel() {
        jPanelRemote = new JPanel();
        jLabelInput1Remote = new JLabel("input1");
        jPanelRemote.add(jLabelInput1Remote);
        jTextFieldInput1Remote = new JTextField(10);
        jPanelRemote.add(jTextFieldInput1Remote);
        jLabelInput2Remote = new JLabel("input2");
        jTextFieldInput2Remote = new JTextField(10);
        jLabelOutputRemote = new JLabel("Output");
        jPanelRemote.add(jLabelInput2Remote);
        jPanelRemote.add(jTextFieldInput2Remote);
        jPanelRemote.add(jLabelOutputRemote);
        addButtonRemote = new JButton("ADD");
        addButtonRemote.addActionListener(this);// Remote của CalculatorWindow
        jPanelRemote.add(addButtonRemote);
        subButtonRemote = new JButton("SUB");
        jPanelRemote.add(subButtonRemote);
        subButtonRemote.addActionListener(this);
        mulButtonRemote = new JButton("MUL");
        mulButtonRemote.addActionListener(this);
        jPanelRemote.add(mulButtonRemote);
        divButtonRemote = new JButton("DIV");
        divButtonRemote.addActionListener(this);
        jPanelRemote.add(divButtonRemote);

        // jPanelRemote.setBackground(Color.BLUE);

    }

    @Override
    public void actionPerformed(ActionEvent e) {

        String command = e.getActionCommand();
        double num1 = Double.parseDouble
        (jTextFieldInput1Remote.getText());
        double num2 = Double.parseDouble
        (jTextFieldInput2Remote.getText());
        
        if (command.equals("ADD")) {
            //message to Model
            calculatorModelRemote.add(num1, num2);
            double result = calculatorModelRemote.getResult();

            jLabelOutputRemote.setText("" + result);

        }else if(command.equals("SUB")){
            calculatorModelRemote.sub(num1, num2);
            double result = calculatorModelRemote.getResult();

            jLabelOutputRemote.setText("" + result);
        } else if (command.equals("MUL")) {
            calculatorModelRemote.mul(num1,num2);
            double result = calculatorModelRemote.getResult();
            jLabelOutputRemote.setText("" + result);
        } else{
            calculatorModelRemote.div(num1, num2);
            double result = calculatorModelRemote.getResult();
            jLabelOutputRemote.setText("" + result);
        }
    }

}