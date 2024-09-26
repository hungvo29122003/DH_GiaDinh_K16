import java.io.*;

public class AddUIConsoleInput {
    // fields
    private AddUseCaseControl addUseCaseControl = null;
    private PrintWriter stdOut = null;
    private BufferedReader stdIn = null;
    // methods
    public AddUIConsoleInput(AddUseCaseControl addUseCaseControl){
//        stdOut = new PrintWriter(System.out);
        stdOut = new PrintWriter(new BufferedWriter(
                new OutputStreamWriter(System.out)),true);
        stdIn = new BufferedReader(new InputStreamReader(System.in));
    }
    public void input() throws IOException {
        String strNumber1, strNumber2;
        this.stdOut.print("Input number1: ");
        stdOut.flush();
        strNumber1 = this.stdIn.readLine();
        this.stdOut.print("Input number2: ");
        stdOut.flush();
        strNumber2 = this.stdIn.readLine();

         RequestData requestData = new RequestData();
         requestData.strNumber1 = strNumber1;
         requestData.strNumber2 = strNumber2;
        addUseCaseControl.execute(requestData);
    }

}
