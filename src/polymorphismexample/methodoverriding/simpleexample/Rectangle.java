package polymorphismexample.methodoverriding.simpleexample;

public class Rectangle extends Shape{
    @Override
    public void cal(int l,int b) {

        if(l==b){
            int sum=l*b;
            System.out.println("Area of Square is "+sum+" (Child Class)");
        }else{
            super.cal(3,4);
        }
    }
}
