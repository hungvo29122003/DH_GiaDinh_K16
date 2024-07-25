package buoi6.TemperatureConverter;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

class MenuController implements ActionListener {
    private TemperatureView temperatureViewRemote;
    private TemperatureModel temperatureModelRemote;
    public MenuController(TemperatureView temperatureViewRemote, TemperatureModel temperatureModelRemote){
        this.temperatureModelRemote = temperatureModelRemote;
        this.temperatureViewRemote = temperatureViewRemote;

    }
    @Override
    public void actionPerformed(ActionEvent e) {
        String command = e.getActionCommand();
        String lastCommand = command;
        if (command.equals("f2c")) {
            double Fahrenheit = Double.parseDouble(temperatureViewRemote.getjTextFieldInput1Remote().getText());
            temperatureModelRemote.f2c(Fahrenheit);
            
        } else if (command.equals("c2f")) {
           double Celsius = Double.parseDouble(temperatureViewRemote.getjTextFieldInput2Remote().getText());
           temperatureModelRemote.c2f(Celsius);
        } else if (command.equals("exit")){
            temperatureModelRemote.exit();
        }
    }
}
