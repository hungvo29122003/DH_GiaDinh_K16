package buoi6.TemperatureConverter;

import javax.annotation.processing.Messager;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

import buoi6.TemperatureConverter.Observer.Publisher;



public class TemperatureModel extends Publisher {
    // filed
    private double result;
    // method
    public void f2c (double a){
        result = (a - 32 ) / 1.8;
        changeState();
    }
    public void c2f (double a){
        result = (a * 1.8) + 32;
        changeState();
    }
    public void exit(){
        System.exit(0);
        changeState();
    }
    
    public void changeState(){
        notifySubcribers();
    }
    public double getResult() {
        return result;
    }
}
