package JavaAdvanced.Exercises.Class.Task2;

public class Movie {
    private String title;
    private String director;
    private int yearOfRelease;
    private String genre;
    private String distributor;

    public Movie(String title, String director, int yearOfRelease, String genre, String distributor) {
        this.title = title;
        this.director = director;
        this.yearOfRelease = yearOfRelease;
        this.genre = genre;
        this.distributor = distributor;
    }

    public Movie(){}

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getDirector() {
        return director;
    }

    public void setDirector(String director) {
        this.director = director;
    }

    public int getYearOfRelease() {
        return yearOfRelease;
    }

    public void setYearOfRelease(int yearOfRelease) {
        this.yearOfRelease = yearOfRelease;
    }

    public String getGenre() {
        return genre;
    }

    public void setGenre(String genre) {
        this.genre = genre;
    }

    public String getDistributor() {
        return distributor;
    }

    public void setDistributor(String distributor) {
        this.distributor = distributor;
    }

    @Override
    public String toString() {
        return "Movie{" +
                "title='" + title + '\'' +
                ", director='" + director + '\'' +
                ", yearOfRelease=" + yearOfRelease +
                ", genre='" + genre + '\'' +
                ", distributor='" + distributor + '\'' +
                '}';
    }

    public static class MovieCreator{
        private String title;
        private String director;
        private int yearOfRelease;
        private String genre;
        private String distributor;

        public MovieCreator(String title, String director, int yearOfRelease, String genre, String distributor) {
            this.title = "Default";
            this.director = director;
            this.yearOfRelease = yearOfRelease;
            this.genre = genre;
            this.distributor = distributor;
        }
        public MovieCreator(){}

        public Movie createMovie(){
            Movie movie = new Movie();
            movie.setTitle("Default");
            movie.setDirector(director);
            movie.setYearOfRelease(yearOfRelease);
            movie.setGenre(genre);
            movie.setDistributor(distributor);
            return movie;
        }


        public String getTitle() {
            return title;
        }

        public void setTitle(String title) {
            this.title = title;
        }

        public String getDirector() {
            return director;
        }

        public void setDirector(String director) {
            this.director = director;
        }

        public int getYearOfRelease() {
            return yearOfRelease;
        }

        public void setYearOfRelease(int yearOfRelease) {
            this.yearOfRelease = yearOfRelease;
        }

        public String getGenre() {
            return genre;
        }

        public void setGenre(String genre) {
            this.genre = genre;
        }

        public String getDistributor() {
            return distributor;
        }

        public void setDistributor(String distributor) {
            this.distributor = distributor;
        }
    }
}
