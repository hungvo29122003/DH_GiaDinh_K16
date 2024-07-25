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
    private JMenuBar menuBarRemote = null;
    private String lastCommand;
    private MenuController MenuControllerRemote;
    private JMenuItem c2fRemote, f2cRemote, exitRemote; 
    private EnterController enterControllerRemote;
    
  

    //function, method
     public TemperatureView(){
        TemperatureModelRemote = new TemperatureModel();
        TemperatureModelRemote.subcriber(this);
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
    public JTextField getjTextFieldInput1Remote(){
        return jTextFieldInput1Remote;
    }
    public JTextField getjTextFieldInput2Remote(){
        return jTextFieldInput2Remote;
    }
    public void buildPanel(){
        jPanelRemote = new JPanel();
        jLabelInput1Remote = new JLabel("Celsius");
        jPanelRemote.add(jLabelInput1Remote);
        jTextFieldInput1Remote = new JTextField(10);
        jPanelRemote.add(jTextFieldInput1Remote);
        //jTextFieldInput1Remote.addActionListener(enterControllerRemote);
        jLableInput2Remote = new JLabel("Fahrenheit");
        jPanelRemote.add(jLableInput2Remote);
        jTextFieldInput2Remote = new JTextField(10);
        jPanelRemote.add(jTextFieldInput2Remote);
        //jTextFieldInput2Remote.addActionListener(enterControllerRemote);
        jlabelOutputRemote = new JLabel();
       jPanelRemote.add(jlabelOutputRemote);
    }
    public void buildMenu(){
        menuBarRemote = new JMenuBar();
        JMenu ConverterRemote = new JMenu("Commands");
        f2cRemote = new JMenuItem("f2c");
        c2fRemote = new JMenuItem("c2f");
        exitRemote = new JMenuItem("exit");
        ConverterRemote.add(f2cRemote);
        ConverterRemote.add(c2fRemote);
        ConverterRemote.add(exitRemote);
        menuBarRemote.add(ConverterRemote);

    }
    public void setMenuControll(MenuController menuControllerRemote){
        f2cRemote.addActionListener(menuControllerRemote);
        c2fRemote.addActionListener(menuControllerRemote);
        exitRemote.addActionListener(menuControllerRemote);
    }
    @Override
    public void update() {
        
        if(lastCommand.equals("f2c")){
            jTextFieldInput1Remote.setText(String.valueOf(TemperatureModelRemote.getResult()));
        } else if(lastCommand.equals("c2f")){
            jTextFieldInput2Remote.setText(String.valueOf(TemperatureModelRemote.getResult()));
        }
    }
    public void setlastCommand(String lastcommand){
        this.lastCommand = lastcommand;
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
