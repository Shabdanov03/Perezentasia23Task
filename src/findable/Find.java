package findable;

import Classes.Cast;
import Classes.Director;
import Classes.Movie;

import java.util.Arrays;
import java.util.List;

public class Find implements Findable {

    @Override
    public List<Movie> getAllMovies(List<Movie> movies) {
        System.out.println("----------------------------------");
        return movies;
    }

    @Override
    public void findMovieByName(List<Movie> movies, String movieName) {

        for (Movie movie : movies) {
            if (movie.getName().equals(movieName)) {
                System.out.println(movie);
            }
        }
    }

    @Override
    public void findMovieByActorName(List<Movie> movies, String actorName) {
        int i = 0;
        for (Movie movie : movies) {
            if (movie.getCast().get(i).getActorFullName().equals(actorName)) {
                System.out.println(movie);
            }
         }
    }

    @Override
    public void findMovieByYear(List<Movie> movies, int year) {

        for (Movie movie : movies) {
            if (movie.getYear() == year) {
                System.out.println(movie);
            }
        }
    }

    @Override
    public void findMovieByDirector(List<Movie> movies, String name) {

        for (Movie movie : movies) {
            if (movie.getDirector().getName().equals(name)) {
                System.out.println(movie);
            }
        }
    }

    @Override
    public void findMovieByDescription(List<Movie> movies, String description) {
        for (Movie movie : movies) {
            if (movie.getDescription().equals(description)) {
                System.out.println(movie);
            }
        }

    }

    @Override
    public void findMovieByRole(List<Movie> movies, String role) {

        int i = 0;
        for (Movie movie : movies) {
            if (movie.getCast().get(i).getRole().equals(role)) {
                System.out.println(movie);
            }
        }

    }
}
