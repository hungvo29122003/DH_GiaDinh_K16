package Convert.CommandProcessor;

import Convert.Convert_Model;

public class Convert_FtoC_Command implements Convert_CommandProcessor {
    private Convert_Model convertModel;

    public Convert_FtoC_Command(Convert_Model convertModel) {
        this.convertModel = convertModel;
    }

    @Override
    public void excute(double fahrenheit) {
        convertModel.convert_C(fahrenheit);
    }
}
