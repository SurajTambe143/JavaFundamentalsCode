package collectionexample.hashmapexample;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Map;
import java.util.Scanner;

public class Test {

    public static void main(String[] args) {

        int n ,rollno ;
        String name;
        HashMap<Integer,String> list = new HashMap<>();
        Scanner sc = new Scanner(System.in);
        while(true) {
            System.out.println("1)Add 2)Delete 3)Find 4)Size 5)Exit");
            n = sc.nextInt();
            switch (n) {
                case 1:
                    //Add Element to string
                    System.out.println("Enter Student name:");
                    name = sc.next();
                    System.out.println("Enter Student rollno:");
                    rollno = sc.nextInt();
                    list.put(rollno,name);

                    //Display Elements of Arraylist
                    for(Map.Entry mEntry:list.entrySet()){
                        System.out.println("Name: "+mEntry.getValue()+" Rollno: "+mEntry.getKey());
                    }
                    break;

                case 2:
                    //Remove Element from String
                    System.out.println("Enter Student rollno:");
                    rollno = sc.nextInt();
                    list.remove(rollno);

                    //Display Elements of Arraylist
                    for(Map.Entry mEntry:list.entrySet()){
                        System.out.println("Name: "+mEntry.getValue()+" Rollno: "+mEntry.getKey());
                    }
                    break;

                case 3:
                    //Object present or not
                    System.out.println("Enter Student name:");
                    name = sc.next();
                    if(list.containsValue(name)) System.out.println(name+" is present in List");
                    else System.out.println(name+" is not present");

                    //Display Elements of Arraylist
                    for(Map.Entry mEntry:list.entrySet()){
                        System.out.println("Name: "+mEntry.getValue()+" Rollno: "+mEntry.getKey());
                    }
                    break;

                case 4:
                    //Display size of list
                    System.out.println("Size of list is "+list.size());
                    break;

                case 5:
                    System.exit(0);
                    break;
                default:
                    System.out.println("Enter correct input!!");
            }
        }

    }

}


