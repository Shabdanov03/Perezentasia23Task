package sortable.comporators;

import Classes.Movie;

import java.util.Comparator;

public class SortByDirector implements Comparator<Movie> {
    @Override
    public int compare(Movie o1, Movie o2) {
        return o1.getDirector().getName().compareTo(o2.getName());
    }
}
