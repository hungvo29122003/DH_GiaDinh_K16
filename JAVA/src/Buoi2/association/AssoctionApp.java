package Buoi2.association;

public class AssoctionApp {
    public static void main(String[] args) {
        B bRemote = new B() ;
        A aRemote = new A(bRemote);
        aRemote.methodA();
    }

}
