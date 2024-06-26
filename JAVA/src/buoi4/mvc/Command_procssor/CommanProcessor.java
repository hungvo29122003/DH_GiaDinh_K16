package buoi4.mvc.Command_procssor;

public class CommanProcessor {
    private static CommanProcessor commanProcessorRemote = null;
    private CommanProcessor(){

    }
    public static CommanProcessor makeCommandProcessor(){
        if (commanProcessorRemote == null) {
            commanProcessorRemote = new CommanProcessor();
        }
        return commanProcessorRemote;
    }
    //method
    public void execute(Command cmmd){
        cmmd.execute();
    }

}
