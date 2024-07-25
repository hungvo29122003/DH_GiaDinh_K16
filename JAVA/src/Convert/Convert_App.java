package Convert;

import Convert.CommandProcessor.Convert_CommandProcessor;
import Convert.CommandProcessor.Convert_CtoF_command;
import Convert.CommandProcessor.Convert_FtoC_Command;

public class Convert_App {
    public static void main(String[] args) {
        Convert_Model convertModel = new Convert_Model();

        Convert_View convertView = new Convert_View(convertModel);

        Convert_CommandProcessor CtoFcommandProcessor = new Convert_CtoF_command(convertModel);
        Convert_CommandProcessor FtoCcommandProcessor = new Convert_FtoC_Command(convertModel);

        Convert_View.enter_Controller enterController = convertView.new enter_Controller(CtoFcommandProcessor, FtoCcommandProcessor);
        enterController.actionListener();

        Convert_View.menu_Controller menuController = convertView.new menu_Controller(CtoFcommandProcessor, FtoCcommandProcessor);
        menuController.actionListener();
    }
}
