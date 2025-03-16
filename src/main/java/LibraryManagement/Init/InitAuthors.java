package LibraryManagement.Init;

import LibraryManagement.Author;

public class InitAuthors {

    public static Author[] initAuthors() {
        Author author1 = new Author("George", "Orwell", "British", 'M', 1903);
        Author author2 = new Author("Jane", "Austen", "British", 'F', 1775);
        Author author3 = new Author("Gabriel", "Garcia Marquez", "Colombian", 'M', 1927);
        Author author4 = new Author("Mary", "Shelley", "British", 'F', 1797);
        Author author5 = new Author("Ernest", "Hemingway", "American", 'M', 1899);
        Author author6 = new Author("Virginia", "Woolf", "British", 'F', 1882);
        Author author7 = new Author("Franz", "Kafka", "Austrian", 'M', 1883);
        Author author8 = new Author("Leo", "Tolstoy", "Russian", 'M', 1828);
        Author author9 = new Author("Agatha", "Christie", "British", 'F', 1890);
        Author author10 = new Author("Haruki", "Murakami", "Japanese", 'M', 1949);

        return new Author[]{author1, author2, author3, author4, author5, author6, author7, author8, author9, author10};
    }
}
