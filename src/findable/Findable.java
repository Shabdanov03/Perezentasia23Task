package findable;

import Classes.Cast;
import Classes.Movie;

import java.util.List;

public interface Findable {
    List<Movie> getAllMovies(List<Classes.Movie> movies);

    void findMovieByName(List<Classes.Movie> movies, String movieName);

    void findMovieByActorName(List<Classes.Movie> movies, String actorName);

    void findMovieByYear(List<Classes.Movie> movies, int year);

    void findMovieByDirector(List<Classes.Movie> movies, String name);

    void findMovieByDescription(List<Classes.Movie> movies, String description) throws Exception;

    void findMovieByRole(List<Classes.Movie> movies, String role);
}
