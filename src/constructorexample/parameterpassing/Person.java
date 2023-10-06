package constructorexample.parameterpassing;

public class Person {
    private String name;
    private int age;

    /* When we create a constructor default constructor is overrite
    so we need to create constructor whenever a new class is extend as default constructor is called
     everytime child class is called
     So if there is no default constructor then it gives error as constructor is not present in parent class*/

    Person(){
        System.out.println("Enter name and age while entering");
    }

    Person(String name,int age){
        this.name=name;
        this.age=age;
    }

    public String getName(){
        return name;
    }
    public int getAge(){
        return age;
    }

}
