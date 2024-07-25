package buoi6.TemperatureConverter;

public class ConverterApp {
    public static void main(String[] args) {
        TemperatureModel temperatureModelRemote = new TemperatureModel();
        TemperatureView temperatureViewRemote = new TemperatureView();
        MenuController menuControllerRemote = new MenuController(temperatureViewRemote, temperatureModelRemote);
        temperatureViewRemote.setMenuControll(menuControllerRemote);
    }
}
