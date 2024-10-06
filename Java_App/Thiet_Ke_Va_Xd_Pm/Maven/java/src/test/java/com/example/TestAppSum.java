    package com.example;

    import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertNull;
    import org.junit.Test;

    public class TestAppSum {

        @Test
        public void testError(){
            RequestData requestData = new RequestData();
            requestData.strNumber1 = "2";
            requestData.strNumber2 = "a";

            InputBoundary inputBoundary = new AddUseCaseControl();
            AddUIConsoleOutput addUIConsoleOutput = new  AddUIConsoleOutput();
            AddUseCaseControl addUseCaseControl = (AddUseCaseControl) inputBoundary;
            addUseCaseControl.setAddUIConsoleOutput(addUIConsoleOutput);

            inputBoundary.execute(requestData);
            assertEquals("ERROR_INPUT", addUIConsoleOutput.getError().content);
        }
        @Test
        public  void testSuccess(){
             RequestData requestData = new RequestData();
            requestData.strNumber1 = "2";
            requestData.strNumber2 = "2";
            InputBoundary inputBoundary = new AddUseCaseControl();
            AddUIConsoleOutput addUIConsoleOutput = new AddUIConsoleOutput();
            AddUseCaseControl addUseCaseControl = (AddUseCaseControl) inputBoundary;
            addUseCaseControl.setAddUIConsoleOutput(addUIConsoleOutput);

            inputBoundary.execute(requestData);

            assertNull(addUIConsoleOutput.getError());

            ResponseResult result = addUIConsoleOutput.getResult();
            assertNotNull("Result should not be null", result);
            assertEquals(4, result.sumResult);
            assertEquals("2", result.strNumber1);
            assertEquals("2", result.strNumber2);

            
        }
    }
