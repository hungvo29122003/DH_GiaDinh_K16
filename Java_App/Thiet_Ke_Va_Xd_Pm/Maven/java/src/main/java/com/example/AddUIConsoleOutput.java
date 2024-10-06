package com.example;

public class AddUIConsoleOutput  implements OutputBoundary{
    private ResponseError error = null;
    private ResponseResult result = null;
    // fields
    // private PrintWriter stdOut = null;
    // public AddUIConsoleOutput(){
    //     this.stdOut = new PrintWriter(
    //         new OutputStreamWriter(System.out));
    // }


    // intertaces 
    // API - interface : chỉ chứa các methods - public
    // public void outError(ResponseData responseData){
    //     error(responseData);
    // }



    // // implementation - support
    // private void error(ResponseData responseData){
    //     stdOut.println(responseData.content);
    //     stdOut.println(responseData.strNumber1);
    //     stdOut.println(responseData.strNumber2);
    //     stdOut.flush();
    // }

    @Override
    public void outError(ResponseError error) {
        this.error = error;
    }

    @Override
    public void outResult(ResponseResult result) {
        this.result = result;
    }
    public ResponseError getError(){
        return error;
    }

    public ResponseResult getResult() {
        return result;
    }
    
}
