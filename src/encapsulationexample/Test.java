package encapsulationexample;

public class Test {

    public static void main(String[] args){

        Person p=new Person();

        //For Name
        p.setName("Suraj");
        System.out.println(p.getName());

        //For Number
        p.setPhoneNumber(9888758653l);
        System.out.println(p.getPhoneNumber());
    }

}
