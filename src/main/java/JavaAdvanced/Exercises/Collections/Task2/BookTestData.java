package JavaAdvanced.Exercises.Collections.Task2;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class BookTestData {
    public static List<Book> createBooks() {
        List<Author> authorsList = Arrays.asList(
                new Author("John", "Smith", 'M'),
                new Author("Emily", "Johnson", 'F'),
                new Author("Michael", "Williams", 'M'),
                new Author("Sarah", "Jones", 'F'),
                new Author("David", "Brown", 'M'),
                new Author("Emma", "Davis", 'F'),
                new Author("Daniel", "Miller", 'M'),
                new Author("Sophia", "Wilson", 'F'),
                new Author("James", "Taylor", 'M'),
                new Author("Olivia", "Anderson", 'F')
        );

        List<String> bookTitles = Arrays.asList(
                "To Kill a Mockingbird",
                "1984",
                "The Great Gatsby",
                "Pride and Prejudice",
                "The Catcher in the Rye",
                "The Lord of the Rings",
                "Harry Potter and the Sorcerer's Stone",
                "The Hobbit",
                "Moby Dick",
                "War and Peace",
                "Jane Eyre",
                "Wuthering Heights",
                "The Adventures of Huckleberry Finn",
                "Anna Karenina",
                "The Grapes of Wrath",
                "Crime and Punishment",
                "Brave New World",
                "Great Expectations",
                "Little Women",
                "Catch-22",
                "The Brothers Karamazov",
                "Les Misérables",
                "The Scarlet Letter",
                "A Tale of Two Cities",
                "The Alchemist",
                "The Kite Runner",
                "The Book Thief",
                "Memoirs of a Geisha",
                "Life of Pi",
                "The Road",
                "Slaughterhouse-Five",
                "Gone with the Wind",
                "The Da Vinci Code",
                "The Girl with the Dragon Tattoo",
                "The Help",
                "The Hunger Games",
                "Twilight",
                "Dune",
                "The Shining",
                "It",
                "The Outsiders",
                "Percy Jackson & The Olympians: The Lightning Thief",
                "The Maze Runner",
                "Ender's Game",
                "A Song of Ice and Fire: A Game of Thrones",
                "The Chronicles of Narnia: The Lion, the Witch and the Wardrobe",
                "The Fault in Our Stars",
                "Fahrenheit 451",
                "Of Mice and Men",
                "The Picture of Dorian Gray"
        );

        Genre[] genres = Genre.values();

        List<Book> books = new ArrayList<>();

        for (int i = 0; i < 50; i++) {
            String title = bookTitles.get(i);
//            String title = "Title " + i;
            int price = (int) (Math.random() * 96) + 5; // Random price between 5 and 100
            int yearOfRelease = (int) (Math.random() * (2023 - 1900 + 1)) + 1900; // Random year between 1900 and 2023
            int authorsCount = (int) (Math.random() * 3) + 1; // 1 to 3 authors
            List<Author> authors = new ArrayList<>();
            for (int j = 0; j < authorsCount; j++) {
                authors.add(authorsList.get((int) (Math.random() * authorsList.size())));
            }
            Genre genre = genres[(int) (Math.random() * genres.length)];
            if (title.equals("The Great Gatsby")){
                genre = Genre.Drame;
            }
            books.add(new Book(title, price, yearOfRelease, authors, genre));
        }

        return books;
    }

    public static void main(String[] args) {
        List<Book> books = createBooks();

        books.forEach(System.out::println);
    }
}
