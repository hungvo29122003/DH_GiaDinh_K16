package buoi4.ecb;

public class WindowApp {
    public static void main(String[] args) {
        CalculatorEntity calculatorEntityRemote = new CalculatorEntity();
        CalculatorBoundary calculatorBoundaryRemote = new CalculatorBoundary();
        
        CalculatorControl calculatorControlRemote = new CalculatorControl(calculatorBoundaryRemote, calculatorEntityRemote);
        
        calculatorBoundaryRemote.setCalculatorControlRemote(calculatorControlRemote);
    }
}






