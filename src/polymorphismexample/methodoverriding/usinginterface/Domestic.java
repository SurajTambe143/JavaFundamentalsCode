package polymorphismexample.methodoverriding.usinginterface;

public class Domestic extends Animal implements Dog, Cat {

    //Instance methods are preferred over interface default methods.
    public static void main(String[] args) {
        Domestic myApp = new Domestic();
        System.out.println(myApp.identifyMyself());
    }
}
