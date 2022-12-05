import Classes.Cast;
import Classes.Director;
import Classes.Movie;
import findable.Find;
import sortable.Sort;

import java.io.IOException;
import java.util.*;

public class Main {
    public static void main(String[] args) {

        /**Практикалык тапшырма:
         Classes.Movie:
         private String name;
         private int year;
         private String description;
         private Classes.Director ;
         private List<Classes.Cast> cast;
         Classes.Cast:
         private String actorFullName;
         private String role;
         Classes.Director:
         private String name;
         private String lastName;
         Findable:
         List<Classes.Movie>getAllMovies(List<Classes.Movie>movies);
         void findMovieByName(List<Classes.Movie>movies);
         void findMovieByActorName(List<Classes.Movie>movies);
         void findMovieByYear(List<Classes.Movie>movies);
         void findMovieByDirector(List<Classes.Movie>movies);
         void findMovieByDescription(List<Classes.Movie>movies);
         void findMovieByRole(List<Classes.Movie>movies);
         Sortable:
         void sortByMovieName(List<Classes.Movie>movies);
         -from A to Z
         -from Z to A
         void sortByYear(List<Classes.Movie>movies);
         -Ascending
         -Descending
         void sortByDirector(List<Classes.Movie>movies);
         ****** Main де кайсыл иш аракетти аткаргыбыз келсе ошол метод switch case аркылуу чакырылып иштесин.
         Бардык маалыматтар туура жана так болуп консольго чыксын.**/

        Director director = new Director("Jon", " Favreau");// iron man
        Director director1 = new Director("Joseph", "Kosinski");// tom cruise
        Director director2 = new Director("Christopher", "Nolan");// batman and interstellar
        Director director3 = new Director("Ruben", "Fleischer");// venom
        Director director4 = new Director("Edward", "Miller");// thor
        Director director5 = new Director("Sam", "Raimi");// Spider Man
        Director director6 = new Director("David", "Fincher");// social network

        List<Movie> movies = new ArrayList<>();
        movies.add(new Movie("Iron man", 2011, "fantastic", director, new ArrayList<>(List.of(new Cast("Robert Downey", "Tony Stark")))));
        movies.add(new Movie("Maverick", 2022, "War", director1, new ArrayList<>(List.of(new Cast("Tom Cruise", "Jesus")))));
        movies.add(new Movie("Batman", 2008, "fantastic", director2, new ArrayList<>(List.of(new Cast("Matthew McMcNaught", "Cooper")))));
        movies.add(new Movie("Interstellar", 2014, "spice", director2, new ArrayList<>(List.of(new Cast("Christian Bale", "Batman")))));
        movies.add(new Movie("Venom", 2018, "fantastic", director3, new ArrayList<>(List.of(new Cast("Tom Hardy", "Venom")))));
        movies.add(new Movie("Thor", 2012, "fantastic", director4, new ArrayList<>(List.of(new Cast("Chris Hemsworth", "Thor")))));
        movies.add(new Movie("Spider man", 2019, "fantastic", director5, new ArrayList<>(List.of(new Cast("Tom Holland", "Spider man")))));
        movies.add(new Movie("Social Network", 2013, "Business", director6, new ArrayList<>(List.of(new Cast("Jesse Eisenberg", "Mark Zuckerberg")))));

        Sort sort = new Sort();
        Find find = new Find();

        while (true) {
            System.out.println("===============COMMANDS===============\n" +
                    "1.to print catalog : \n" +
                    "2.to find a movie by  name :\n" +
                    "3.to sort by year : \n" +
                    "4.to sort by name : \n" +
                    "5.to sort by director : \n" +
                    "6.to find movies by actor's name :\n" +
                    "7.to find movies by director's name :\n" +
                    "8.to find movies by year : \n" +
                    "9.to list all movies and roles by actor's name : \n" +
                    "10.to find a movie by description : :\n");
            System.out.println("ENTER THE COMMAND:");
            int number = new Scanner(System.in).nextInt();
            switch (number) {
                case 1 -> {
                    System.out.println(find.getAllMovies(movies));
                    break;
                }
                case 2 -> {
                    System.out.println(" Enter movie name :");
                    String movieName = new Scanner(System.in).nextLine();
                    find.findMovieByName(movies, movieName);
                    break;
                }
                case 3 -> {
                    System.out.println("1.Sort by year ascending:\n" +
                            "2.Sort by year descending:");
                    int num = new Scanner(System.in).nextInt();
                    if (num == 1) {
                        sort.sortByYearAscending(movies);
                    }
                    if (num == 2) {
                        sort.sortByYearDescending(movies);
                    } else {
                        System.out.println("There is no such movie on our site !");
                    }
                    break;
                }
                case 4 -> {
                    System.out.println("1.Sort by name A to Z:\n" +
                            "2.Sort by name Z to A:");
                    int num = new Scanner(System.in).nextInt();
                    if (num == 1) {
                        sort.sortByMovieNameAtoZ(movies);
                    }
                    if (num == 2) {
                        sort.sortByMovieNameZtoA(movies);
                    } else {
                        System.out.println(" There is no such movie on our site !");
                    }
                    break;
                }
                case 5 -> {
                    sort.sortByDirector(movies);
                    break;
                }
                case 6 -> {
                    System.out.println(" Enter actor name :");
                    String actorName = new Scanner(System.in).nextLine();
                    find.findMovieByActorName(movies, actorName);
                    break;
                }
                case 7 -> {
                    System.out.println(" Enter director name :");
                    String directorName = new Scanner(System.in).nextLine();
                    find.findMovieByDirector(movies, directorName);
                    break;
                }
                case 8 -> {
                    System.out.println("Enter the year : ");
                    int year = new Scanner(System.in).nextInt();
                    find.findMovieByYear(movies, year);
                    break;
                }
                case 9 -> {
                    System.out.println(" Enter the role :");
                    String role = new Scanner(System.in).nextLine();
                    find.findMovieByRole(movies, role);
                    break;
                }
                case 10 -> {
                    System.out.println(" Enter by description : ");
                    String description = new Scanner(System.in).nextLine();
                    find.findMovieByDescription(movies, description);
                    break;
                }
                default -> {
                    System.out.println(" No such command !");
                    break;
                }
            }
        }


    }
}