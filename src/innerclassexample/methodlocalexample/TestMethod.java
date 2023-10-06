package innerclassexample.methodlocalexample;

public class TestMethod {

    private int n=5;

    public void doSomething() {

        int x=11;

        class InnerClass {
            public void display() {
                System.out.println("This is Inner class "+x+" and Outer class variable "+n);
            }

            InnerClass() {
                System.out.println("This is Contructor of inner class");
            }
        }

        InnerClass ic=new InnerClass();
        ic.display();
    }


}
