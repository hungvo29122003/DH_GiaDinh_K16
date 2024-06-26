package buoi4.mvc.Command_procssor;

import buoi4.mvc.observer.Publisher;

public class CalculatorModel extends Publisher {
    // field
    private double result;
    //method
    public void add(double a, double b){
        this.result = a + b;
        changeState();
    }
    public void sub(double a, double b){
        this.result = a - b;
        changeState();
    }
    public void mul(double a, double b){
        this.result = a * b ;
        changeState();
    }
    public void div(double a, double b){
        this.result = a / b ;
        changeState();
    }
    public double getResult(){
        return result;
    }
    public void changeState(){
    notifySubcribers();      
    }
    public void subcriber(CalculatorView calculatorView) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'subcriber'");
    }

    
}

