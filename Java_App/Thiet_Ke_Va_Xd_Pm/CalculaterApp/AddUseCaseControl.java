public class AddUseCaseControl {

    //fields
    private AddEntity addEntity = null;
    private AddUIConsoleOutput addUIConsoleOutput = null;
    //methods
    private ResponseData resError = null;


    public AddUseCaseControl(){
        addUIConsoleOutput = new AddUIConsoleOutput();
        resError = new ResponseData();
    }

    public void execute(RequestData requestData) {
        

        //nhan 2 so
        String strNumber1 = requestData.strNumber1;
        String strNumber2 = requestData.strNumber2;
        //tham dinh
        if(isThamDinh(strNumber1) && isThamDinh(strNumber2)){
            // hợp lệ
        } else{
            resError.content = "ERROR-INPUT";
            resError.strNumber1 = strNumber1;
            resError.strNumber2 = strNumber2;

            addUIConsoleOutput.outError(resError);
        }
        // true là số / false ! số
        //ok 
        addEntity = new AddEntity(2, 2);
        int result= addEntity.add();
        ResponseData responseData = new ResponseData();
    }
    private boolean isThamDinh(String str){
        if(str == null || str.isEmpty()){
            return  false;
        }
        try {
            Integer.parseInt(str); // cố gắng chuyển chuỗi sang số nguyên 
            return  true; 
        } catch (NumberFormatException e) {
            return false; // nêú có lỗi NumberFormatException thì ko phải số nguyên 
        }
    }

}
