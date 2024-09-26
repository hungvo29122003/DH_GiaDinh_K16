public class App {
    public static void main(String[] args)  throws Exception{
        System.out.println("addtion Application");
        AddUIConsoleOutput addUIConsoleOutput = new AddUIConsoleOutput();
        AddEntity addEntity = new AddEntity();
        AddUseCaseControl addUseCaseControl = new AddUseCaseControl(addEntity, addUIConsoleOutput);
        AddUIConsoleInput addUIConsoleInput = new AddUIConsoleInput(addUseCaseControl);
    }
}
