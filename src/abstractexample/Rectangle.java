package abstractexample;

public class Rectangle extends Parent{
    public void shape(int x){
        super.shape(x);
        System.out.println("This is rectangle with length "+x);
    }
    void inputValue(int x){
        System.out.println("Input value of Rectangle is "+x);
    }
}

