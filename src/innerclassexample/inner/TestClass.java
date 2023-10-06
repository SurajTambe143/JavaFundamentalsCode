package innerclassexample.inner;

public class TestClass {
    //Accessing inner class form differnet method
    public static void main(String[] args) {
        Test t=new Test();
        t.innerInstances();
        Test.InnerClass i= t.new InnerClass();
        i.display(5);

        //Methods cannot be accessed
//        i.InnerInstances();
    }
}
