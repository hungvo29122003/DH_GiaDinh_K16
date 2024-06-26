package buoi6.TemperatureConverter.Observer;

import java.util.LinkedList;
import java.util.List;

public class Publisher {
    private List<Subcriber> subcriber = new LinkedList<>();
    // method
    public void subcriber(Subcriber s){
        subcriber.add(s);
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
