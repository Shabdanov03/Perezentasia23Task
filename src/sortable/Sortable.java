package sortable;

import Classes.Movie;

import java.util.List;

public interface Sortable {
    void sortByMovieNameAtoZ(List<Classes.Movie>movies);
    void sortByMovieNameZtoA(List<Classes.Movie>movies);

    void sortByYearAscending(List<Classes.Movie>movies);
    void sortByYearDescending(List<Movie> movies);
    void sortByDirector(List<Classes.Movie>movies);

}
