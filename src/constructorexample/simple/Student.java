package constructorexample.simple;

public class Student {

    int s;

    //No argument Constructor
    Student(){
        System.out.println("This is a constructor");
    }

    //parameterised Constructor
    Student(int x){
        s=x;
        System.out.println("This is a constructor with value "+x);
    }

    //Copy Constructor
    Student(Student t){
        s=t.s;
        System.out.println("This is a Copy Constructor "+s);
    }

}
