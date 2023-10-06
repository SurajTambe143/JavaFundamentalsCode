package arrayandstring.arrayexample;
import java.util.*;

public class ArrayTest {

    public static void main(String[] args) {

//        int num[] = {5, 3, 5, 6, 8, 3, 4, 4, 6, 7};
//
//        //Using for loop
//        for(int i=0;i<=num.length-1;i++){
//            System.out.print(num[i]);
//
//        }
//        System.out.println();
//
//        //Using For each loop
//        for (int num1:num){
//            System.out.print(num1);
//        }
//        System.out.println();
//        Scanner sc=new Scanner(System.in);
//        int n[]=new int[5];
//        System.out.println("Enter 5 numbers");
//        for (int i=0;i<=n.length-1;i++){
//            n[i]=sc.nextInt();
//        }
//
//        for(int i=0;i<=n.length-1;i++){
//            System.out.print(n[i]);
//
//        }


        //String
        String str[]=new String[] {"Suraj","Anush","Deepak"};
//        String s="Suraj";
        //Using for loop
//        for (int i = 0; i < str.length; i++) {
//            System.out.println(str[i]);
//        }
//        //Using for each loop
//        for (String st:str
//             ) {
//            System.out.println(st);
//        }
//        Arrays.sort(str);
//        System.out.println("Sorted String");
//        for (int i = 0; i < str.length; i++) {
//            System.out.println(str[i]);
//        }


        //Searching a element in String array

//        String searchElement="Suraj";
//
//        for (int i = 0; i < str.length; i++) {
//            // .equals method is used not (==) because we have to compare value [location is compared with ==]
//            if(searchElement.equals(str[i])) System.out.println("Element is present");
//        }



//        s=s.concat("Tambe"); //(s.concat is not possible as String class is final)
//        System.out.println(s);


        //String sort
//        String s1= "suraj";
//        char arr[]=s1.toCharArray();
//        char test;

        //Sort logic one
//        for(int i=0;i<arr.length;i++){
//            for (int j = 0; j<arr.length; j++) {
//                if(arr[i]<arr[j]){
//                    test=arr[j];
//                    arr[j]=arr[i];
//                    arr[i]=test;
//                }
//            }
//        }

//        // Sort logic 2
//        for(int i=0;i<arr.length;i++){
//            for (int j = 0; j<arr.length-1; j++) {
//                if(arr[j]>arr[j+1]){
//                    test=arr[j];
//                    arr[j]=arr[j+1];
//                    arr[j+1]=test;
//                }
//            }
//        }
//        for (int i = 0; i < arr.length; i++) {
//            System.out.print(arr[i]);
//        }

        //String Methods
        String s="SurajTambe";
        s=s.toLowerCase();
        System.out.println("Lower Case: "+s);

        s=s.substring(5);
        System.out.println("Substring: "+s);


    }
}
