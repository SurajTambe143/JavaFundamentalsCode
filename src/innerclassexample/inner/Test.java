package innerclassexample.inner;

public class Test {

    private int n=10;
     class InnerClass{
        public void display(int n){
            //Outer class variables can be used by inner class
            System.out.println("This is Inner class "+n);
            //Outer methods can be used by inner class
            innerInstances();
        }
        InnerClass(){
            System.out.println("This is Contructor of inner class");
        }

    }
    public void innerInstances(){
        System.out.println("Outer class method ");
//        InnerClass ic=new InnerClass();
//        ic.display(n);
    }
}
