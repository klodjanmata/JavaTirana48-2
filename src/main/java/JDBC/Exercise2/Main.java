package JDBC.Exercise2;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        Movie m = new Movie(1, "Inception", "Drama", 2018);
        Movie m2 = new Movie(2, "Paradise", "Adventure", 2010);
        Movie m3 = new Movie(3, "Interstellar", "Sci-Fi", 2012);
        Movie m4 = new Movie(4, "The Dark Knight", "Action", 2020);
        List<Movie> movies = new ArrayList<Movie>();
        movies.add(m2);
        movies.add(m3);
        movies.add(m4);
        MovieDAO movieDAO = new MovieDAO();
//        movieDAO.createTable();
        //movieDAO.deleteTable();
//        movieDAO.create(m);
//        for (Movie movie : movies) {
//            movieDAO.create(movie);
//        }
//        m2.setGenre("Drama");
//        movieDAO.update(m2);
//        movieDAO.delete(m2.getId());
//        List<Movie> databaseMovies = movieDAO.findAll();
//        for (Movie movie : databaseMovies) {
//            System.out.println(movie);
//        }
        Movie movie = movieDAO.findById(2);
        System.out.println(movie);

    }
}
