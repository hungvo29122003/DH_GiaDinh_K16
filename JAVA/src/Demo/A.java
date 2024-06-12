package Demo;

public class A {
    B bRemote;
    A(B bRemote){
        this.bRemote = bRemote;
    }
    public void methodA(){
        bRemote.methodB();
    }
}
