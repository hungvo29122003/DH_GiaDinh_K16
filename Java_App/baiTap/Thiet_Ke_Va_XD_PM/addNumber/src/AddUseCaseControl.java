public class AddUseCaseControl {
    private AddEntity addEntity = null;
    private AddUIConsoleOutput addUIConsoleOutput = null;

    public void execute(RequestData requestData){
        // nhận 2 số
        // thẩm định phải số ko
        int result =  addEntity.Add();
        ResponseData responseData = new ResponseData();
        responseData.sumResult= result;
        addUIConsoleOutput.outPut(responseData);
    }
}
