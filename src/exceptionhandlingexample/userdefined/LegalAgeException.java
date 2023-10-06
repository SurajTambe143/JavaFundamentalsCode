package exceptionhandlingexample.userdefined;

public class LegalAgeException extends Exception{

    LegalAgeException(String s){
        System.out.println(s);
    }

}
