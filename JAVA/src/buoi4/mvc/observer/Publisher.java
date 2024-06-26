package buoi4.mvc.observer;

import java.util.LinkedList;
import java.util.List;

import buoi4.mvc.CalculatorView;
import buoi6.TemperatureConverter.TemperatureView;


public class Publisher {
    //field
    private List<Subcriber> subcriber = new LinkedList<>();
    //method
    public void subcriber(buoi5.mvc.CalculatorView calculatorView){
        subcriber.add(calculatorView);
    }
    public void unsubcriber(Subcriber s){
        subcriber.remove(s);
    }
    public void notifySubcribers(){
        for(Subcriber subcriber : subcriber){
            subcriber.update();
        }
    }

}
