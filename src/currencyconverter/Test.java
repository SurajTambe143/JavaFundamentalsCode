package currencyconverter;

import java.util.Scanner;

public class Test {
    public static void main(String[] args) {

        int f,t;
        float a;
        Scanner sc =new Scanner(System.in);
        try{
            do{
                System.out.println();
                System.out.println("Select currency type from below and enter its number");
                System.out.println("1)INR 2)USD 3)EURO 4)Canadian Dollar 5)Australian Dollar 6)Exit");
                f = sc.nextInt();
                if (f==6) break;
                System.out.println("Enter amount");
                a=sc.nextInt();
                System.out.println("1)INR 2)USD 3)EURO 4)Canadian Dollar 5)Australian Dollar");
                System.out.println("Select one Option from above to convert into");
                t=sc.nextInt();
                System.out.println();

                switch (f) {

                    case 1:
                        //converting from INR
                        Inr i=new Inr();
                        i.conversion(1,a,t);
                        break;

                    case 2:
                        //converting from usd
                        Usd u=new Usd();
                        u.conversion(2,a,t);
                        break;

                    case 3:
                        //converting from euro
                        Euro e=new Euro();
                        e.conversion(3,a,t);
                        break;

                    case 4:
                        //converting from canadian dollar
                        CanadianDollar cd=new CanadianDollar();
                        cd.conversion(4,a,t);
                        break;

                    case 5:
                        //converting from australian dollar
                        AustralianDollar ad=new AustralianDollar();
                        ad.conversion(5,a,t);
                        break;
                    case 6:
                        System.exit(0);
                        break;
                    default:
                        System.out.println("Enter correct input!!");
                }
            }while(true);
        }catch(Exception e){
            System.out.println("Please enter correct value");
        }

    }
}
