package inheritanceexample;

//Interfaces Only uses public Access modifier and Default methods (Default method contains body)

//Single Inheritance 1-1
public class Bmw extends Vehicle {
    public int seatingCapacity=4;
    public void specifications(){
        System.out.println("BMW has "+carWheel+" wheels and Seating Capacity for "+seatingCapacity);
    }
}

//For Multiple Inheritance 1,2 to 1
//interface ChildOne{
//    public void Comfort();
//    default void SportCars(){
//        System.out.println("This is a sport car");
//    }
//}