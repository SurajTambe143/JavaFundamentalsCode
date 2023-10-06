package polymorphismexample.methodoverloading;

public class Test {
    public static void main(String[] args){
        Shape s=new Shape();
        int c =s.area(2);
        System.out.println("Area of Square is "+c);

        s.area(2,3);

        s.area(2,3,4);
    }
}
