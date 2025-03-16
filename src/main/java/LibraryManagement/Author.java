package LibraryManagement;

public class Author {
    private String name;
    private String surname;
    private String nationality;
    private char gender;
    private int yearOfBirth;

    public Author(String name, String surname, String nationality, char gender, int yearOfBirth) {
        this.name = name;
        this.surname = surname;
        this.nationality = nationality;
        this.gender = gender;
        this.yearOfBirth = yearOfBirth;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public String getNationality() {
        return nationality;
    }

    public void setNationality(String nationality) {
        this.nationality = nationality;
    }

    public char getGender() {
        return gender;
    }

    public void setGender(char gender) {
        this.gender = gender;
    }

    public int getYearOfBirth() {
        return yearOfBirth;
    }

    public void setYearOfBirth(int yearOfBirth) {
        this.yearOfBirth = yearOfBirth;
    }

    @Override
    public String toString() {
        return "Author{" +
                "name='" + name + '\'' +
                ", surname='" + surname + '\'' +
                ", nationality='" + nationality + '\'' +
                ", gender=" + gender +
                ", yearOfBirth=" + yearOfBirth +
                '}';
    }
}
