package exceptionhandlingexample.userdefined;

import java.util.Scanner;

public class Test {

    public static void main(String[] args) {
        int age;
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter age of student");
        age=sc.nextInt();
        Student s=new Student();
        try {
            s.setAge(age);
        } catch (LegalAgeException e) {
            System.out.println("Enter correct age");
            age=sc.nextInt();
            try{
                s.setAge(age);
            }catch(LegalAgeException l){
                System.out.println("Please Enter age correctly");
            }
        }finally{
            if(s.getAge()>18) {
                System.out.println("Your age is " + s.getAge() + " And you are allowed to vote");
            }else{
                System.out.println("Your age is less than 18 and you are not allowed to vote");
            }
        }
    }


}
