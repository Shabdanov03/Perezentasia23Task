package sortable.comporators;

import Classes.Movie;

import java.util.Comparator;

public class SortByYearDescending implements Comparator<Movie> {
    @Override
    public int compare(Movie o1, Movie o2) {
        return o2.getYear()-o1.getYear();
    }
}
