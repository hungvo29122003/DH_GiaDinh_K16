package buoi3.swing;

import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class CalculatorWindow extends JFrame implements ActionListener {

    //field
    private String title;
    private JPanel jPanelRemote;
    private JLabel jLabelInput1Remote, jLabelInput2Remote, jLabelOutput1Remote;
    private JTextField jTextFieldInput1Remote, jTextFieldInput2Remote;
    private JButton addButtonRemote, subButtonRemote, mulButtonRemote, divButtonRemote;

    //function, method
    CalculatorWindow(){
        buildPanel();
        add(jPanelRemote);
        title = "FrameViewer";
        setTitle(title);
        setSize(400, 400);
        setVisible(true);
    }
    public void buildPanel(){
        jPanelRemote = new JPanel();
        jLabelInput1Remote = new JLabel("input1");
        jPanelRemote.add(jLabelInput1Remote);
        jTextFieldInput1Remote = new JTextField(10);
        jPanelRemote.add(jTextFieldInput1Remote);
        jLabelInput2Remote = new JLabel("input2");
        jPanelRemote.add(jLabelInput2Remote);
        jTextFieldInput2Remote = new JTextField(10);
        jPanelRemote.add(jTextFieldInput2Remote);
        jLabelOutput1Remote = new JLabel("output ");
        jPanelRemote.add(jLabelOutput1Remote);
        addButtonRemote = new JButton("ADD");
        addButtonRemote.addActionListener(this); // remote cua calculatoWindow
        jPanelRemote.add(addButtonRemote);
        mulButtonRemote = new JButton("MUL");
        mulButtonRemote.addActionListener(this);
        jPanelRemote.add(mulButtonRemote);
        subButtonRemote = new JButton("SUB");
        subButtonRemote.addActionListener(this);
        jPanelRemote.add(subButtonRemote);
        divButtonRemote = new JButton("DIV");
        divButtonRemote.addActionListener(this);
        jPanelRemote.add(divButtonRemote);
        



        


    }
    @Override
    public void actionPerformed(ActionEvent e) {
        String command = e.getActionCommand();
        if (command.equals("ADD")) {
            
            double num1 = Double.parseDouble(jTextFieldInput1Remote.getText());
            double num2 = Double.parseDouble(jTextFieldInput2Remote.getText());
            double result = num1 + num2;
    
            jLabelOutput1Remote.setText("" + result);
        } else if (command.equals("SUB")) {
            double num1 = Double.parseDouble(jTextFieldInput1Remote.getText());
            double num2 = Double.parseDouble(jTextFieldInput2Remote.getText());
            double result = num1 - num2;
            jLabelOutput1Remote.setText("" +result);
        } else if (command.equals("MUL")) {
            double num1 = Double.parseDouble(jTextFieldInput1Remote.getText());
            double num2 = Double.parseDouble(jTextFieldInput2Remote.getText());
            double result = num1 * num2;
            jLabelOutput1Remote.setText("" + result );
            
        } else{
            double num1 = Double.parseDouble(jTextFieldInput1Remote.getText());
            double num2 = Double.parseDouble(jTextFieldInput2Remote.getText());
            double result = num1 / num2;
            jLabelOutput1Remote.setText("" + result);
        }
    }
}
