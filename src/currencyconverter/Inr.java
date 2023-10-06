package currencyconverter;

public class Inr implements Currency{
    private float cal;

    public float getCal() {
        return cal;
    }

    public void conversion(int from , float amount , int to){

        //Depending on user ,(to conversion type) switch is called

        switch(to){
            case 1:
                //INR to INR
                System.out.println("INR value is "+amount);
                break;

            case 2:
                //INR to USD
                cal=amount*0.012f;
                System.out.println("USD value is "+cal);
                break;

            case 3:
                //INR to EURO
                cal=amount*0.011f;
                System.out.println("EURO value is "+cal);
                break;

            case 4:
                //INR to Canadian Dollar
                cal=amount*0.016f;
                System.out.println("Canadian Dollar value is "+cal);
                break;

            case 5:
                //INR to Australian dollar
                cal=amount*0.018f;
                System.out.println("Australian value is "+cal);
                break;

        }

    }

}
