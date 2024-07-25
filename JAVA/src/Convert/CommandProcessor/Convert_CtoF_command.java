package Convert.CommandProcessor;

import Convert.Convert_Model;

public class Convert_CtoF_command implements Convert_CommandProcessor {
    private Convert_Model convertModel;

    public  Convert_CtoF_command(Convert_Model convertModel) {
        this.convertModel = convertModel;
    }


    @Override
    public void excute(double celsius) {
        convertModel.convert_F(celsius);
    }
}
