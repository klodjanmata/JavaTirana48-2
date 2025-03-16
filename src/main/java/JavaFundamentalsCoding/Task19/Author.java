package JavaFundamentalsCoding.Task19;

public class Author {
    private String name;
    private String surname;
    private String nationality;

    public Author(String name, String surname, String nationality){
        this.name = name;
        this.surname = surname;
        this.nationality = nationality;
    }

    public void printAuthor(){
        System.out.println(this.name + " " + this.surname + " " + this.nationality);
    }

    public static void printAuthorStatic(){
        System.out.println("Test");
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurname(){
        return surname;
    }

    public void setSurname(String surname){
        this.surname = surname;
    }

    public String getNationality() {
        return nationality;
    }

    public void setNationality(String nationality) {
        this.nationality = nationality;
    }
}
