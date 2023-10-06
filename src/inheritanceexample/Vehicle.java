package inheritanceexample;

public class Vehicle {

    int carWheel= 4;
    String carControl="Steering wheel";
    public int bikeWheel=2;
    public String bikeControl="Handle";
    public void car() {
        int wheels;
        System.out.println("This is parent Class of car having wheels "+carWheel+"and Control is "+carControl);
    }
    public void bike(){

        System.out.println("This is parent Class of bike having wheels "+bikeWheel+"and Control is "+bikeControl  );

    }
}

//For Multiple Inheritance

