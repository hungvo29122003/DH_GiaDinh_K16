package buoi6.TemperatureConverter;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JPanel;
import javax.swing.JTextField;

import buoi6.TemperatureConverter.Observer.Subcriber;

public class TemperatureView  extends JFrame implements Subcriber{
     //field
    private String title;
    private JPanel jPanelRemote;
    private JLabel jLabelInput1Remote, jLableInput2Remote, jlabelOutputRemote;
    private JTextField jTextFieldInput1Remote,jTextFieldInput2Remote;
    private TemperatureModel TemperatureModelRemote;
    private temperatureController menuControlRemote;
    private JMenuBar menuBarRemote = null;
    private String lastCommand;
    
  

    //function, method
     public TemperatureView(){
        TemperatureModelRemote = new TemperatureModel();
        TemperatureModelRemote.subcriber(this);
        menuControlRemote = new temperatureController();
        buildMenu();
        buildPanel();
        add(jPanelRemote);
        setJMenuBar(menuBarRemote);
        setTitle(title);
        title = "Temperature Converter";
        setSize(400, 400);
        setVisible(true);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null);
    }
    public void buildPanel(){
        jPanelRemote = new JPanel();
        jLabelInput1Remote = new JLabel("Celsius");
        jPanelRemote.add(jLabelInput1Remote);
        jTextFieldInput1Remote = new JTextField(10);
        jPanelRemote.add(jTextFieldInput1Remote);
        jLableInput2Remote = new JLabel("Fahrenheit");
        jPanelRemote.add(jLableInput2Remote);
        jTextFieldInput2Remote = new JTextField(10);
        jPanelRemote.add(jTextFieldInput2Remote);
        jlabelOutputRemote = new JLabel();
       jPanelRemote.add(jlabelOutputRemote);
    }
    public void buildMenu(){
        menuBarRemote = new JMenuBar();
        JMenu ConverterRemote = new JMenu("Commands");
        JMenuItem f2cRemote = new JMenuItem("f2c");
        f2cRemote.addActionListener(menuControlRemote);
        JMenuItem c2fRemote = new JMenuItem("c2f");
        c2fRemote.addActionListener(menuControlRemote);
        JMenuItem exitRemote = new JMenuItem("exit");
        exitRemote.addActionListener(menuControlRemote);
        ConverterRemote.add(f2cRemote);
        ConverterRemote.add(c2fRemote);
        ConverterRemote.add(exitRemote);
        menuBarRemote.add(ConverterRemote);

    }
    @Override
    public void update() {
        
        if(lastCommand.equals("f2c")){
            jTextFieldInput1Remote.setText(String.valueOf(TemperatureModelRemote.getResult()));
        } else if(lastCommand.equals("c2f")){
            jTextFieldInput2Remote.setText(String.valueOf(TemperatureModelRemote.getResult()));
        }
    }
    class temperatureController implements ActionListener{
        public temperatureController(){

        }
        public void actionPerformed(ActionEvent e){
            String command = e.getActionCommand();
            lastCommand = command;
            
            if (command.equals("f2c")) {
                double Fahrenheit = Double.parseDouble(jTextFieldInput2Remote.getText());
                TemperatureModelRemote.f2c(Fahrenheit);
            } else if (command.equals("c2f")) {
               double Celsius = Double.parseDouble(jTextFieldInput1Remote.getText());
               TemperatureModelRemote.c2f(Celsius);
            } else if (command.equals("exit")){
                TemperatureModelRemote.exit();
            }
        }
    }

    // class TemperatureController implements ActionListener{

    //     @Override
    //     public void actionPerformed(ActionEvent e) {
    //         String command = e.getActionCommand();
    //         double num1 = Double.parseDouble(jTextFieldInput1Remote.getText());
    //         double num2 = Double.parseDouble(jTextFieldInput2Remote.getText());
    //         if (command.equals("f2c")) {
    //             TemperatureModelRemote.f2c(num1, num2);
    //         } else if (command.equals("c2f")) {
    //             TemperatureModelRemote.c2f(num1, num2);
    //         } else if (command.equals("exit")){
    //             TemperatureModelRemote.exit();
    //         }
    //     }
        
    // }
}
