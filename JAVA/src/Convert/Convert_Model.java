package Convert;

import Convert.Observer.Convert_Publisher;

public class Convert_Model extends Convert_Publisher {
    // filed
    private double result_C;
    private double result_F;

    // methods
    public void convert_C(double f) {
        this.result_C = (f - 32) / 1.8;
        notifySubcriber();
    }

    public void convert_F(double c) {
        this.result_F = (c * 1.8) + 32;
        notifySubcriber();
    }

    // getter
    public double getResult_C() {
        return this.result_C;
    }

    public double getResult_F() {
        return this.result_F;
    }
}
