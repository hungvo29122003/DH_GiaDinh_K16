package Demo;

public class AssApp {
    public static void main(String[] args) {
        B bRemote = new B();
        A aRemote = new A(bRemote);
        aRemote.methodA();
    }
}
