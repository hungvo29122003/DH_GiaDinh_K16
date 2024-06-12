package Buoi2.association;

public class A {
    //field
    B bRemote;
    //function, method
    A(){ // function ko là hành vi đối tượng tại vì nó không được gửi thông điệp bằng remote của đối tượng 
        // method là hành vi của đối tượng 

    }
    A(B bRemote){
        /*  instance variable*/ this.bRemote = bRemote; /*locacl */
    }
    public void methodA(){
        // question 
        /*
        phân biệt giữa biến đối tượng và ko phải biến đối tượng 
         */
        bRemote.methodB();
    }
}
