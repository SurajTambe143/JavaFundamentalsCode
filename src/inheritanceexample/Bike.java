package inheritanceexample;

//This is Hierarchical (1 to 1,1)
public class Bike extends Vehicle {
    public int seatingCapacity=2;
    public void specifications(){
        System.out.println("Bike has "+bikeWheel+" wheels and Seating Capacity for "+seatingCapacity);
    }
}
