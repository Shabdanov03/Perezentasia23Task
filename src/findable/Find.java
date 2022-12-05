package findable;

import Classes.Cast;
import Classes.Director;
import Classes.Movie;

import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;

public class Find implements Findable {

    @Override
    public List<Movie> getAllMovies(List<Movie> movies) {
        System.out.println("----------------------------------");
        return movies;
    }

    @Override
    public void findMovieByName(List<Movie> movies, String movieName) {

        try {
            LinkedList<Movie> list = new LinkedList<>();
            for (Movie movie : movies) {
                if (movie.getName().contains(movieName)) {
                    list.add(movie);
                }
            }
            System.out.println(list);
            if (list.isEmpty()) throw new Exception();

        } catch (Exception e) {
            System.out.println("There is no such movie on our site !");
        }
    }

    @Override
    public void findMovieByActorName(List<Movie> movies, String actorName) {
        try {
            LinkedList<Movie> list = new LinkedList<>();
            int i = 0;
            for (Movie movie : movies) {
                if (movie.getCast().get(i).getActorFullName().contains(actorName)) {
                    list.add(movie);
                }
            }
            System.out.println(list);
            if (list.isEmpty()) throw new Exception();
        } catch (Exception e) {
            System.out.println(" There is no such movie on our site !");
        }
    }

    @Override
    public void findMovieByYear(List<Movie> movies, int year) {
        try {
            LinkedList<Movie> list = new LinkedList<>();
            for (Movie movie : movies) {
                if (movie.getYear() == year) {
                    list.add(movie);
                }
            }
            System.out.println(list);
            if (list.isEmpty()) throw new Exception();
        } catch (Exception e) {
            System.out.println("There is no such movie on our site!");
        }
    }

    @Override
    public void findMovieByDirector(List<Movie> movies, String name) {
        try {
            LinkedList<Movie> list = new LinkedList<>();
            for (Movie movie : movies) {
                if (movie.getDirector().getName().equals(name)) {
                    list.add(movie);
                }
            }
            System.out.println(list);
        } catch (Exception e) {
            System.out.println("There is no such movie on our site!");
        }
    }

    @Override
    public void findMovieByDescription(List<Movie> movies, String description) {
        try{
            LinkedList<Movie> list = new LinkedList<>();
        for (Movie movie : movies) {
            if (movie.getDescription().equals(description)) {
                list.add(movie);
            }
            }
            System.out.println(list);
        if (list.isEmpty()) throw new Exception();
        } catch (Exception e){
            System.out.println(" There is no such movie on our site !");
        }

    }

    @Override
    public void findMovieByRole(List<Movie> movies, String role) {
        try{
            LinkedList<Movie> list = new LinkedList<>();
        int i = 0;
        for (Movie movie : movies) {
            if (movie.getCast().get(i).getRole().equals(role)) {
                list.add(movie);
            }
        }
            System.out.println(list);
        if (list.isEmpty()) throw new Exception();
    }catch (Exception e){
            System.out.println("There is no such movie on our site !");}
    }
}
