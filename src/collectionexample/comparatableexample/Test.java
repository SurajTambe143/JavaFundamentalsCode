package collectionexample.comparatableexample;

import java.util.ArrayList;
import java.util.Collections;

public class Test {
    public static void main(String[] args) {
        ArrayList<Movie> list=new ArrayList<>();

        list.add(new Movie("Krissh", "Hritik",4));
        list.add(new Movie("Interstellar", "Christopher",5));
        list.add(new Movie("RRR", "jr",5));
        list.add(new Movie("Adhipurish", "Prabhas",1));
        list.add(new Movie("Barbie", "Girl",3));

        Collections.sort(list,new MovieCompare());

        System.out.println(list);

    }
}
