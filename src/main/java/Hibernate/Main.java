package Hibernate;

import java.util.List;

public class Main {

    public static void main(String[] args) {
        MovieRepository mr = new MovieRepository();
        Movie movie = new Movie();
        List<Movie> moviesList;
        movie.setTitle("Perralle nga e kaluara");
        movie.setGenre("Comedy");
        movie.setYear(1980);
        movie.setRating(100);
        mr.save(movie);
        moviesList = mr.findAll();
        for (Movie m : moviesList) {
            System.out.println(m);
        }
    }
}
