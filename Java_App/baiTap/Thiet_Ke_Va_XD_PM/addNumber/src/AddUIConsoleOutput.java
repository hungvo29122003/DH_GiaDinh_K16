import java.io.PrintWriter;

public class AddUIConsoleOutput {
    private PrintWriter stdOut;
    AddUIConsoleOutput(){

    }
    void outPut(ResponseData responseData){
        this.stdOut = new PrintWriter(System.out);
        String addResult = responseData.getSumResut();
        this.stdOut.print(addResult);
        this.stdOut.flush();
    }
}
