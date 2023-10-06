package collectionexample.comparatableexample;

import java.util.Comparator;

public class MovieCompare implements Comparator<Movie> {

    @Override
    public int compare(Movie o1, Movie o2) {
        return o1.getActor().compareTo(o2.getActor());
    }
}
