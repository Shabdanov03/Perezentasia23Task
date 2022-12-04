package sortable;

import Classes.Movie;
import sortable.comporators.*;

import java.util.List;

public class Sort implements Sortable {

    @Override
    public void sortByMovieNameAtoZ(List<Movie> movies) {
        MoveNameAtoZComporator moveNameComporator = new MoveNameAtoZComporator();
        movies.sort(moveNameComporator);
        for (Movie movie : movies) {
            System.out.println(movie);
        }
    }

    @Override
    public void sortByMovieNameZtoA(List<Movie> movies) {
        MoveNameZtoAComporator moveNameZtoAComporator = new MoveNameZtoAComporator();
        movies.sort(moveNameZtoAComporator);
        for (Movie movie : movies) {
            System.out.println(movie);
        }
    }

    @Override
    public void sortByYearAscending(List<Movie> movies) {
        SortByYearAscending sortByYearAscending = new SortByYearAscending();
        movies.sort(sortByYearAscending);
        for (Movie movie : movies) {
            System.out.println(movie);
        }
    }

    @Override
    public void sortByYearDescending(List<Movie> movies) {
        SortByYearDescending sortByYearDescending = new SortByYearDescending();
        movies.sort(sortByYearDescending);
        for (Movie movie : movies) {
            System.out.println(movie);
        }
    }

    @Override
    public void sortByDirector(List<Movie> movies) {
        SortByDirector sortByDirector = new SortByDirector();
        movies.sort(sortByDirector);
        for (Movie movie : movies) {
            System.out.println(movie);
        }
    }


}
