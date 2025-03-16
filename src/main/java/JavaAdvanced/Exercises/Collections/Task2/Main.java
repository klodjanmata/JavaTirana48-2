package JavaAdvanced.Exercises.Collections.Task2;

import java.util.Map;

public class Main {
    public static void main(String[] args) {
        BookService bookService = new BookService(BookTestData.createBooks());
        bookService.printAllBooks();
//        bookService.orderByTitle();
//        System.out.println("\n\n\n\nOrdered Books by Title");
//        bookService.printAllBooks();
//
//        System.out.println("\n\n\n\nGet By Genre: ");
//        bookService.getByGenreStream(Genre.Comic).forEach(System.out::println);

        Map<Genre, String> titlesMap = bookService.getGenresMap();
        titlesMap.forEach((genre, title) ->
                            System.out.println("Genre: " + genre + " Title: " + title));
        System.out.println("\n\n\n\nFind by Key:  " + titlesMap.get(Genre.Comic));
        System.out.println("Find By Value: " + titlesMap.getOrDefault("Genre.Poesy", "Not Found"));
        System.out.println("Find By Value: " + titlesMap.values());
        System.out.println("Find Genre in List:  " + bookService.getBookList()
                                                                        .stream()
                                                                        .filter(book -> book.getGenre().equals(Genre.Comic))
                                                                        .findFirst());
//        bookService.getBooksByPriceRange(50, 100).forEach(System.out::println);
    }
}
