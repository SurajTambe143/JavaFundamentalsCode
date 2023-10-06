package exceptionhandlingexample.userdefined;

public class Student {

    private int age;

    public int getAge() {
        return age;
    }

    public void setAge(int age) throws LegalAgeException {
        if(age<18){
            throw new LegalAgeException("Please Enter a Valid Age");
        }else {
            this.age = age;
        }
    }
}
