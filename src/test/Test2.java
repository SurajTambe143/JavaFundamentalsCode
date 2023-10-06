package test;

public class Test2 extends Test1{

    @Override
    int doSomething(int a) {
        super.doSomething();
        return a;
    }
}
