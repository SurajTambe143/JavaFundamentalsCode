package collectionexample.arraylistexample;
import java.util.*;

public class Test {

    public static void main(String[] args) {

        int n;
        String val;
        ArrayList<String> list = new ArrayList<>();
        Scanner sc = new Scanner(System.in);
        while(true) {
        System.out.println("1)Add 2)Delete 3)Find 4)Size 5)Sort 6)Exit");
        System.out.println("Select one Option from above and enter its Number");
        n = sc.nextInt();
            switch (n) {
                case 1:
                    //Add Element to string
                    System.out.println("Enter Student name:");
                    val = sc.next();
                    list.add(val);

                    //Display Elements of Arraylist
                    Iterator it = list.iterator();
                    while (it.hasNext()) {
                        String s = (String) it.next();
                        System.out.println(s);
                    }
                    break;

                case 2:
                    //Remove Element from String
                    System.out.println("Enter Student name:");
                    val = sc.next();
                    list.remove(val);

                    //Display Elements of Arraylist
                    Iterator it2 = list.iterator();
                    while (it2.hasNext()) {
                        String s = (String) it2.next();
                        System.out.println(s);
                    }
                    break;

                case 3:
                    //Object present or not
                    System.out.println("Enter Student name:");
                    val = sc.next();
                    if(list.contains(val)) System.out.println(val+" is present in List");
                    else System.out.println(val+" is not present");

                    //Display Elements of Arraylist
                    Iterator it3 = list.iterator();
                    while (it3.hasNext()) {
                        String s = (String) it3.next();
                        System.out.println(s);
                    }
                    break;

                case 4:
                    //Display size of list
                    System.out.println("Size of list is "+list.size());
                    break;

                case 5:
                    //Sort list
                    Collections.sort(list);

                    //Display Elements of Arraylist
                    Iterator it5 = list.iterator();
                    while (it5.hasNext()) {
                        String s = (String) it5.next();
                        System.out.println(s);
                    }
                    break;

                case 6:
                    System.exit(0);
                    break;
                default:
                    System.out.println("Enter correct input!!");
            }
        }

    }

}
