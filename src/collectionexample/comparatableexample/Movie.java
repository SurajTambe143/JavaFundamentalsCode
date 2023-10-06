package collectionexample.comparatableexample;

import java.util.Comparator;

public class Movie{

    String title;
    String actor;
    int rating;

    Movie(String title, String actor, int rating) {
        this.title = title;
        this.actor = actor;
        this.rating = rating;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getActor() {
        return actor;
    }

    public void setActor(String actor) {
        this.actor = actor;
    }

    public int getRating() {
        return rating;
    }

    public void setRating(int rating) {
        this.rating = rating;
    }

    @Override
    public String toString() {
        return "Movie{" +
                "title='" + title + '\'' +
                ", actor='" + actor + '\'' +
                ", rating=" + rating +
                '}';
    }

}