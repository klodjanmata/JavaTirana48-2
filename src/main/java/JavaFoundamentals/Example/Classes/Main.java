package JavaFoundamentals.Example.Classes;

public class Main {
    public static void main(String[] args) {
        Book book1 = new Book();
        book1.setAuthor("Alber Kamy");
        book1.setTitle("I huaji");
        book1.setNumberOfPages(350);
        System.out.println( "Author: " + book1.getAuthor() +
                            "\nTitle: " + book1.getTitle() +
                            "\nPages: " + book1.getNumberOfPages());
    }
}
