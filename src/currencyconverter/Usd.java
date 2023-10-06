package currencyconverter;

public class Usd implements Currency{

    private float cal;

    public float getCal() {
        return cal;
    }

    public void conversion(int from , float amount , int to){

        switch(to){
            case 1:
                cal=amount*82.73f;
                System.out.println("INR value is "+cal);
                break;

            case 2:
                System.out.println("USD value is "+amount);
                break;

            case 3:
                cal=amount*0.92f;
                System.out.println("EURO value is "+cal);
                break;

            case 4:
                cal=amount*1.34f;
                System.out.println("Canadian Dollar value is "+cal);
                break;

            case 5:
                cal=amount*1.51f;
                System.out.println("Australian value is "+cal);
                break;

        }

    }

}
