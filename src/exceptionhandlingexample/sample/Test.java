package exceptionhandlingexample.sample;

import java.util.Scanner;

public class Test {

    public static void main(String[] args) {

        int name, age;
        Scanner sc = new Scanner(System.in);
        Person p = new Person();
        Person p2 = new Person("Suraj", 22);

        try {
            System.out.println(p2.name.length());
            try {
                System.out.println(p.name.length());
            } catch (Exception e) {
                System.out.println("Null point exception");
            }
        }catch(Exception e){
            System.out.println();
        }
    }
}
