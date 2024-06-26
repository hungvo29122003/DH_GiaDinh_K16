package buoi4.mvc;

import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.concurrent.Flow.Subscriber;
import java.util.concurrent.Flow.Subscription;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

import buoi4.mvc.observer.Subcriber;

public class CalculatorView extends JFrame implements Subcriber{

    // field
    private String title;
    private JPanel jPanelRemote;
    private JLabel jLabelInput1Remote, jLabelInput2Remote, jLabelOutputRemote;
    private JTextField jTextFieldInput1Remote, jTextFieldInput2Remote;
    private JButton addButtonRemote, subButtonRemote, mulButtonRemote, divButtonRemote;
    // private CalculatorEntity calculatorEntityRemote;
    private CalculatorModel calculatorModelRemote;
    private CalculatorControl calculatorControlRemote = new CalculatorControl();
    public CalculatorControl getCalculatorControlRemote(){
        return calculatorControlRemote;
    }
    // function, method
    CalculatorView() {
        calculatorModelRemote = new CalculatorModel();
        calculatorModelRemote.subcriber(this);
        buildPanel();
        add(jPanelRemote);
        title = "Frame Viewer";
        setSize(400, 400);
        setVisible(true);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null);
        
    }
    public void buildPanel(){
        jPanelRemote = new JPanel();
        jLabelInput1Remote = new JLabel("Input1");
        jPanelRemote.add(jLabelInput1Remote);
        jTextFieldInput1Remote = new JTextField(10);
        jPanelRemote.add(jTextFieldInput1Remote);
        jLabelInput2Remote = new JLabel("Input2");
        // jPanelRemote.add(jLabelInput2Remote);
        jTextFieldInput2Remote = new JTextField(10);
        // jPanelRemote.add(jTextFieldInput2Remote);
        jLabelOutputRemote = new JLabel("Output");
        jPanelRemote.add(jLabelInput2Remote);
        jPanelRemote.add(jTextFieldInput2Remote);
        jPanelRemote.add(jLabelOutputRemote);
        addButtonRemote = new JButton("ADD");
        addButtonRemote.addActionListener(calculatorControlRemote); // Remote của CalculatorWindow
        jPanelRemote.add(addButtonRemote);
        subButtonRemote = new JButton("SUB");
        subButtonRemote.addActionListener(calculatorControlRemote);
        jPanelRemote.add(subButtonRemote);
        mulButtonRemote = new JButton("MUL");
        mulButtonRemote.addActionListener(calculatorControlRemote);
        jPanelRemote.add(mulButtonRemote);
        divButtonRemote = new JButton("DIV");
        divButtonRemote.addActionListener(calculatorControlRemote);
        jPanelRemote.add(divButtonRemote);

    }
    class CalculatorControl implements ActionListener{
        public CalculatorControl(){

        }

        @Override
        public void actionPerformed(ActionEvent e) {
            String command= e.getActionCommand();
            double num1 = Double.parseDouble(jTextFieldInput1Remote.getText());
            double num2 = Double.parseDouble(jTextFieldInput2Remote.getText());

            if (command.equals("ADD")) {
                calculatorModelRemote.add(num1, num2);
            } else if (command.equals("SUB")) {
                calculatorModelRemote.sub(num1, num2);
            } else if (command.equals("MUL")) {
                calculatorModelRemote.mul(num1, num2);
            } else{
                calculatorModelRemote.div(num1, num2);
            }
        }
    }
    public void update(){
        jLabelOutputRemote.setText("" + calculatorModelRemote.getResult());
    }
}
    
    

