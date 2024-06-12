package buoi4.ecb;

import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class CalculatorBoundary extends JFrame  {

    // field
    private String title;
    private JPanel jPanelRemote;
    private JLabel jLabelInput1Remote, jLabelInput2Remote, jLabelOutputRemote;
    private JTextField jTextFieldInput1Remote, jTextFieldInput2Remote;
    private JButton addButtonRemote, subButtonRemote, mulButtonRemote, divButtonRemote;
    // private CalculatorEntity calculatorEntityRemote;
    private CalculatorControl calculatorControlRemote = null;
    public  JTextField getjTextFieldInput1Remote(){
        return jTextFieldInput1Remote;
    }
    public JTextField getjJTextFieldInput2Remote(){
        return jTextFieldInput2Remote;
    }
    public JLabel getJLabelOutputRemote(){
        return jLabelOutputRemote;
    }

    // function, method
    CalculatorBoundary() {
        // calculatorEntityRemote = new CalculatorEntity();
        buildPanel();
        add(jPanelRemote);
        title = "FrameViewer";
        setTitle(title);
        setSize(400, 400);
        setVisible(true);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
    }
    public void setCalculatorControlRemote(CalculatorControl calculatorControlRemote){
        this.calculatorControlRemote = calculatorControlRemote;
        this.addButtonRemote.addActionListener(this.calculatorControlRemote);
        this.subButtonRemote.addActionListener(this.calculatorControlRemote);
        this.mulButtonRemote.addActionListener(this.calculatorControlRemote);
        this.divButtonRemote.addActionListener(this.calculatorControlRemote);
    }

    public void buildPanel() {
        // jPanelRemote = new JPanel();
        // jLabelInput1Remote = new JLabel("input1");
        // jPanelRemote.add(jLabelInput1Remote);
        // jTextFieldInput1Remote = new JTextField(10);
        // jPanelRemote.add(jTextFieldInput1Remote);
        // jLabelInput2Remote = new JLabel("input2");
        // jPanelRemote.add(jLabelInput2Remote);
        // jTextFieldInput2Remote = new JTextField(10);
        // jPanelRemote.add(jTextFieldInput2Remote);
        // jLabelOutputRemote = new JLabel("output ");
        // jPanelRemote.add(jLabelOutputRemote);
        // addButtonRemote = new JButton("ADD");
        // addButtonRemote.addActionListener(calculatorControlRemote); // remote cua calculatorControl
        // jPanelRemote.add(addButtonRemote);
        // mulButtonRemote = new JButton("MUL");
        // mulButtonRemote.addActionListener(this);
        // jPanelRemote.add(mulButtonRemote);
        // subButtonRemote = new JButton("SUB");
        // subButtonRemote.addActionListener(this);
        // jPanelRemote.add(subButtonRemote);
        // divButtonRemote = new JButton("DIV");
        // divButtonRemote.addActionListener(this);
        // jPanelRemote.add(divButtonRemote);
        jPanelRemote = new JPanel();
        jLabelInput1Remote = new JLabel("input1");
        jPanelRemote.add(jLabelInput1Remote);
        jTextFieldInput1Remote = new JTextField(10);
        jPanelRemote.add(jTextFieldInput1Remote);
        jLabelInput2Remote = new JLabel("input2");
        jPanelRemote.add(jLabelInput2Remote);
        jTextFieldInput2Remote = new JTextField(10);
        jPanelRemote.add(jTextFieldInput2Remote);
        jLabelOutputRemote = new JLabel("output");
        jPanelRemote.add(jLabelOutputRemote);
        addButtonRemote = new JButton("ADD");
        jPanelRemote.add(addButtonRemote);
        subButtonRemote = new JButton("SUB");
        jPanelRemote.add(subButtonRemote);
        mulButtonRemote = new JButton("MUL");
        jPanelRemote.add(mulButtonRemote);
        divButtonRemote = new JButton("DIV");
        jPanelRemote.add(divButtonRemote);


    }
}
