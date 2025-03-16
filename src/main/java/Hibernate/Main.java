package Hibernate;

import java.util.List;

public class Main {

    public static void main(String[] args) {
        MovieRepository mr = new MovieRepository();
        Movie movie = new Movie();
        List<Movie> moviesList = mr.findAll();
        for (Movie m : moviesList) {
            System.out.println(m);
        }
    }
}
