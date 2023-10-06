package currencyconverter;

public class AustralianDollar implements Currency{

    private float cal;

    public float getCal() {
        return cal;
    }

    public void conversion(int from , float amount , int to){

        switch(to){
            case 1:
                cal=amount*54.86f;
                System.out.println(" INR value is "+cal);
                break;

            case 2:
                cal=amount*0.66f;
                System.out.println("USD value is "+cal);
                break;

            case 3:
                cal=amount*0.61f;
                System.out.println("EURO value is "+cal);
                break;

            case 4:
                cal=amount*0.89f;
                System.out.println("Canadian Dollar value is "+cal);
                break;

            case 5:

                System.out.println("Australian Dollar value is "+amount);
                break;

        }

    }

}
