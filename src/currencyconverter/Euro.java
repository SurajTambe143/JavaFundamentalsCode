package currencyconverter;

public class Euro implements Currency{

    private float cal;

    public float getCal() {
        return cal;
    }

    public void conversion(int from , float amount , int to){

        switch(to){
            case 1:
                cal=amount*90.03f;
                System.out.println("INR value is "+cal);
                break;

            case 2:
                cal=amount*1.09f;
                System.out.println("USD value is "+cal);
                break;

            case 3:
                System.out.println("EURO value is "+amount);
                break;

            case 4:
                cal=amount*1.46f;
                System.out.println("Canadian Dollar value is "+cal);
                break;

            case 5:
                cal=amount*1.64f;
                System.out.println("Australian value is "+cal);
                break;

        }

    }


}
