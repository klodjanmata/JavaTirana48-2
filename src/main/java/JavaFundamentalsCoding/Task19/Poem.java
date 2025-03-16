package JavaFundamentalsCoding.Task19;

public class Poem {
    private Author creator;
    private String title;
    private int stropheNumber;
    private String content;

    public Poem(Author author, String title, int stropheNumber, String content) {
        this.creator = author;
        this.title = title;
        this.stropheNumber = stropheNumber;
        this.content = content;
    }

    public void printPoem(){
        System.out.println(this.creator.getName() + " " + this.creator.getSurname());
        System.out.println(this.title);
        System.out.println(this.content);
    }

    public Author getCreator() {
        return creator;
    }

    public void setCreator(Author creator) {
        this.creator = creator;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public int getStropheNumber() {
        return stropheNumber;
    }

    public void setStropheNumber(int stropheNumber) {
        this.stropheNumber = stropheNumber;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }
}
