package polymorphismexample.methodoverloading;

public class Shape{
    // Return type does'nt affect method overloading (Same Name Different Parameters)
    public int area(int r){
        int sum=r*r;
        return sum;
    }
    protected void area(int l,int b){
        int sum=l*b;
        System.out.println("Area of Rectangle is "+sum);
    }
    public void area(int l,int b,int h){
        int sum=l*b*h;
        System.out.println("Area of Triangle is "+sum);
    }
}
