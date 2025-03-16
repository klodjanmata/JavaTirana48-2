package JavaAdvanced.Exercises.FileIO.Task6;

import java.util.List;

public class Main {
    public static void main(String[] args) {
        FileUtil fileUtil = new FileUtil();
        List<Movie> movies = fileUtil.readFromFile();
        fileUtil.writeToFile(movies);
    }
}
