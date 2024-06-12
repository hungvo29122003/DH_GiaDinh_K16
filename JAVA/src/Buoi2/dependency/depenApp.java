package Buoi2.dependency;

public class depenApp {
    public static void main(String[] args) {
        B bRemote = new B();
        // A aRemote = new A(aRemote);
        A aRemote = new A();
        aRemote.setBRemote(bRemote);
        // aRemote.methodA();
    }
}
