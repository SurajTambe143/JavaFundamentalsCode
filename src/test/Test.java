package test;

import java.util.ArrayList;
import java.util.HashSet;

public class Test {

    public static void main(String[] args) {

        ArrayList<Integer> list =new ArrayList<>();

        list.add(1);
        list.add(2);
        list.add(9);
        list.add(4);
        list.add(2);
        list.add(9);
        list.add(7);

        for (int i=0;i<list.size();i++) {
            System.out.print(list.get(i));
        }

        HashSet<String> st=new HashSet<>();
        System.out.println();

        for (int i=0;i<list.size();i++) {
            st.add(String.valueOf(list.get(i)));
        }

        System.out.println(st);

    }

}
