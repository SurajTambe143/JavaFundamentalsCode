package inheritanceexample;

public class TestInheritance {
    public static void main(String args[]){
        //Single Inheritance
//        Bmw c1=new Bmw(); // (Bmw c1) means yoy can only use bmw methods
//        c1.specifications();
//        Vehicle v=new Vehicle(); // (Vehicle v) means yoy can only use vehicle methods
//        v.car();
//        v.bike();
//        System.out.println();

        //Multilevel Inheritance
//        Bmw b=new Bmw();
//        b.specifications();
//        Bmw7Series x=new Bmw7Series();
//        x.details();

        //Hierarchical Inheritance
         Bike b=new Bike();
         b.specifications();

         Bmw m=new Bmw();
         m.specifications();

        //Multiple Inheritance
//        ChildThree c3=new ChildThree();
//        c3.Comfort();
//        c3.Mileage();
//        //Default Access modifier is used
//        c3.SportCars();
    }
}
