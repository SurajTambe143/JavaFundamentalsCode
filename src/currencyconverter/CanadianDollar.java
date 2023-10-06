package currencyconverter;

public class CanadianDollar implements Currency{

    private float cal;

    public float getCal() {
        return cal;
    }

    public void conversion(int from , float amount , int to){

        switch(to){
            case 1:
                cal=amount*61.84f;
                System.out.println("INR value is "+cal);
                break;

            case 2:
                cal=amount*0.75f;
                System.out.println("USD value is "+cal);
                break;

            case 3:
                cal=amount*0.69f;
                System.out.println("EURO value is "+cal);
                break;

            case 4:

                System.out.println("Canadian Dollar value is "+amount);
                break;

            case 5:
                cal=amount*1.13f;
                System.out.println("Australian Dollar value is "+cal);
                break;

        }

    }


}
