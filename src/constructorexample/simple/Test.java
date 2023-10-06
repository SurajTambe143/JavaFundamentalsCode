package constructorexample.simple;


public class Test {

    public static void main(String[] args){

        Student s=new Student();

        Student student =new Student(4);

        Student s1=new Student(student);
    }

}
