package LibraryManagement.Init;

import LibraryManagement.Author;
import LibraryManagement.Book;

public class InitBooks {

    public static Book[] initBooks(Author[] authors) {
        Book book1 = new Book("9780451524935", "1984", authors[0], 1949, 328, "Dystopian", "Secker & Warburg");
        Book book2 = new Book("9780141439518", "Pride and Prejudice", authors[1], 1813, 279, "Romance", "T. Egerton");
        Book book3 = new Book("9780060883287", "One Hundred Years of Solitude", authors[2], 1967, 417, "Magical Realism", "Harper & Row");
        Book book4 = new Book("9780486282114", "Frankenstein", authors[3], 1818, 280, "Horror", "Lackington, Hughes, Harding, Mavor & Jones");
        Book book5 = new Book("9780684830490", "The Old Man and the Sea", authors[4], 1952, 127, "Fiction", "Charles Scribner's Sons");
        Book book6 = new Book("9780156949606", "To the Lighthouse", authors[5], 1927, 209, "Modernist", "Hogarth Press");
        Book book7 = new Book("9780805210408", "The Metamorphosis", authors[6], 1915, 201, "Absurdist", "Kurt Wolff Verlag");
        Book book8 = new Book("9781853260629", "War and Peace", authors[7], 1869, 1225, "Historical Fiction", "The Russian Messenger");
        Book book9 = new Book("9780062073488", "And Then There Were None", authors[8], 1939, 264, "Mystery", "Collins Crime Club");
        Book book10 = new Book("9780307476463", "Norwegian Wood", authors[9], 1987, 296, "Fiction", "Kodansha");

        // Add 20 more books using similar patterns with diverse authors, genres, and publication details
        Book[] books = new Book[30];
        Book[] predefinedBooks = new Book[]{
                book1, book2, book3, book4, book5, book6, book7, book8, book9, book10
        };
        System.arraycopy(predefinedBooks, 0, books, 0, predefinedBooks.length);

        for (int i = 10; i < books.length; i++) {
            books[i] = new Book(
                    "ISBN" + (i + 1),
                    "Book Title " + (i + 1),
                    authors[i % authors.length],
                    2000 + (i % 20),
                    100 + (i * 10),
                    "Genre " + (i % 5),
                    "Publisher " + (i % 3)
            );
        }

        return books;
    }
}
