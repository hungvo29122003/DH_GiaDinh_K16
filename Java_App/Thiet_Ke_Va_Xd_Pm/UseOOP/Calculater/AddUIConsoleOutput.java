
import java.io.OutputStreamWriter;
import java.io.PrintWriter;

public class AddUIConsoleOutput {
    // fields
    private PrintWriter stdOut = null;
    public AddUIConsoleOutput(){
        this.stdOut = new PrintWriter(
            new OutputStreamWriter(System.out));
    }


    // intertaces 
    // API - interface : chỉ chứa các methods - public
    public void outError(ResponseData responseData){
        error(responseData);
    }



    // implementation - support
    private void error(ResponseData responseData){
        stdOut.println(responseData.content);
        stdOut.println(responseData.strNumber1);
        stdOut.println(responseData.strNumber2);
        stdOut.flush();
    }
}
