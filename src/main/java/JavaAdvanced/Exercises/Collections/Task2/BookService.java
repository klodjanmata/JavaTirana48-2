package JavaAdvanced.Exercises.Collections.Task2;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.HashMap;
import java.util.List;
import java.util.stream.Collectors;

public class BookService {
    private List<Book> bookList;

    public BookService() {
        bookList = new ArrayList<>();
    }

    public BookService(List<Book> books){
        this.bookList = books;
    }

    public HashMap<Genre, String> getGenresMap(){
        HashMap<Genre, String> genresMap = new HashMap<>();
        genresMap.put(Genre.Drame, "The Great Gatsby");
        for(Book b : bookList){
            genresMap.put(b.getGenre(), b.getTitle());
        }
        return genresMap;
    }

    public void add(Book book){
        bookList.add(book);
    }

    public boolean remove(Book b){
        return bookList.remove(b);
    }

    public List<Book> getByGenre(Genre genre){
        List<Book> booksToReturn = new ArrayList<>();
        for (Book b : bookList){
            if (b.getGenre() == genre){
                booksToReturn.add(b);
            }
        }
        return booksToReturn;
    }

    public List<Book> getBooksByPriceRange(int priceMin, int priceMax){
        List<Book> booksToReturn = new ArrayList<>();
//        for(Book b : bookList){
//            if (b.getPrice() >= priceMin && b.getPrice() <= priceMax){
//                booksToReturn.add(b);
//            }
//        }
        // 4 lines below have the exact same result
//        bookList.forEach(book -> {
//            if (book.getPrice() >= priceMin && book.getPrice() <= priceMax){
//                booksToReturn.add(book);
//            }
//        });
//        booksToReturn.sort(Comparator.comparing(Book::getPrice));
//        return booksToReturn;

        booksToReturn = bookList.stream()
                .filter(book -> book.getPrice() >= priceMin &&
                        book.getPrice() <= priceMax)
                .collect(Collectors.toList());
        booksToReturn.sort(Comparator.comparing(Book::getPrice));
        return booksToReturn;
    }

    public List<Book> getByGenreStream(Genre genre){
        return bookList.stream().filter(b -> b.getGenre() == genre)
                                .collect(Collectors.toList());
    }

    public List<Book> getByRelease(int yearOfRelease){
        List<Book> booksToReturn = new ArrayList<>();
        for(Book b : bookList){
            if (b.getYearOfRelease() < yearOfRelease){
                booksToReturn.add(b);
            }
        }
        return booksToReturn;
    }

    public Book getTheCheapest(){
        if (bookList.isEmpty()){
            return null;
        }
        Book cheapest = bookList.get(0);
        for (Book b : bookList){
            if (b.getPrice() < cheapest.getPrice()){
                cheapest = b;
            }
        }
        return cheapest;
    }

    public Book getTheMostExpensive(){
        if (bookList.isEmpty()){
            return null;
        }
        Book expensive = bookList.get(0);
        for (Book b : bookList){
            if (b.getPrice() > expensive.getPrice()){
                expensive = b;
            }
        }
        return expensive;
    }

    public Book getBookBy3Authors(){
        if(bookList.isEmpty()){
            return null;
        }
        for (Book b : bookList){
            if (b.getAuthors().size() == 3){
                return b;
            }
        }
        return null;
    }

    public boolean isOnTheList(Book b){
        return bookList.contains(b);
    }

    public List<Book> getBooksByAuthor(Author author){
        List<Book> booksToReturn = new ArrayList<>();
        for(Book b : bookList){
            if(b.getAuthors().contains(author)){
                booksToReturn.add(b);
            }
        }
        return booksToReturn;
    }

    public Book getBookByTitle(String title){
        for (Book b : bookList){
            if(b.getTitle().equals(title)){
                return b;
            }
        }
        return null;
    }

    public void printAllBooks(){
        for (Book b : bookList){
            System.out.println(b);
        }
    }

    public void orderByTitle(){
//                List<String> titleList = new ArrayList<>();
//        for (Book b : bookList){
//            titleList.add(b.getTitle());
//        }
//        titleList.sort(String.CASE_INSENSITIVE_ORDER);
//        List<Book> orderedList = new ArrayList<>();
//        for (String title : titleList){
//            orderedList.add(getBookByTitle(title));
//        }
//        bookList = orderedList;
        bookList = bookList.stream().sorted(Comparator.comparing(Book::getTitle))
                                    .collect(Collectors.toList());

    }

    public List<Book> getBookList() {
        return bookList;
    }

    public void setBookList(List<Book> bookList) {
        this.bookList = bookList;
    }
}
