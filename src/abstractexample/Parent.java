package abstractexample;

abstract class Parent{
    protected void shape(int x){
        System.out.println("This is Parent class"+x);
    };
    abstract void inputValue(int x);
}
