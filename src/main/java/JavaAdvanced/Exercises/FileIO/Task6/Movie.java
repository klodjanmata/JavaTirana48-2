package JavaAdvanced.Exercises.FileIO.Task6;

public class Movie {
    private String title;
    private String genre;
    private String director;
    private int year;


    public Movie(String title, String genre, String director, int year) {
        this.title = title;
        this.genre = genre;
        this.director = director;
        this.year = year;
    }

    public Movie(){}

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getGenre() {
        return genre;
    }

    public void setGenre(String genre) {
        this.genre = genre;
    }

    public String getDirector() {
        return director;
    }

    public void setDirector(String director) {
        this.director = director;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    @Override
    public String toString() {
        return
                " " + title +
                " " + genre +
                " " + director +
                " " + year ;
    }
}
