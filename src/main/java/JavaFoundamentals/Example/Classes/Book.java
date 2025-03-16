package JavaFoundamentals.Example.Classes;

public class Book {
    private String title;
    private String author;
    private int numberOfPages;

    public void setNumberOfPages(int pages){
        if(validateNumberOfPages(pages)){
            this.numberOfPages = pages;
        }else{
            System.out.println("Invalid number of pages");
        }
    }

    private boolean validateNumberOfPages(int pages){
        return pages > 0;
    }

    public int getNumberOfPages(){
        return numberOfPages;
    }

    public String getTitle(){
        return title;
    }

    public void setTitle(String title){
        this.title = title;
    }

    public String getAuthor(){
        return author;
    }

    public void setAuthor(String author){
        this.author = author;
    }
}
