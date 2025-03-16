package JavaAdvanced.Exercises.FileIO.Task6;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.util.ArrayList;
import java.util.List;

public class FileUtil {
    private static final String FILENAME = "Files\\Movie.csv";
    private static final String DELIMITER = ",";

    public void writeToFile(List<Movie> movies) {
        try(BufferedWriter writer = new BufferedWriter(new FileWriter(FILENAME))) {
            for (Movie movie : movies) {
                writer.write(movie.getTitle() + DELIMITER);
                writer.write(movie.getGenre() + DELIMITER);
                writer.write(movie.getDirector() + DELIMITER);
                writer.write(movie.getYear() + DELIMITER);
                writer.newLine();
            }
            writer.close();
        }catch (Exception e) {
            e.printStackTrace();
        }
    }

    public List<Movie> readFromFile() {
        List<Movie> movies = new ArrayList<>();
        try(BufferedReader reader = new BufferedReader(new FileReader(FILENAME))) {
            String line;
            while ((line = reader.readLine()) != null) {
                String[] info = line.split(DELIMITER);
                Movie movie = new Movie();
                movie.setTitle(info[0]);
                movie.setGenre(info[1]);
                movie.setDirector(info[2]);
                movie.setYear(Integer.parseInt(info[3]));
                movies.add(movie);
            }
            reader.close();
        }catch (Exception e) {
            e.printStackTrace();
        }
        return movies;
    }
}
