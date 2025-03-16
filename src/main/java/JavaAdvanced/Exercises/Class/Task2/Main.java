package JavaAdvanced.Exercises.Class.Task2;

public class Main {
    public static void main(String[] args) {
//        MovieCreator mc = new MovieCreator();
//        Movie movie = mc.createMovie("Titanic", "John Doe", 2000, "Drame", "WB");
//        System.out.println(movie);

        Movie.MovieCreator m = new Movie.MovieCreator();
        Movie movie1 = m.createMovie();
        System.out.println(movie1);
    }
}
