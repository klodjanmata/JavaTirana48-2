package JDBC;

import java.util.Date;

public class Author {
    private int id;
    private String name;
    private String lastname;
    private Date dateOfBirth;

    public Author() {}

    public Author(int id, String name, String lastname, Date dateOfBirth) {
        this.id = id;
        this.name = name;
        this.lastname = lastname;
        this.dateOfBirth = dateOfBirth;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getLastname() {
        return lastname;
    }

    public void setLastname(String lastname) {
        this.lastname = lastname;
    }

    public Date getDateOfBirth() {
        return dateOfBirth;
    }

    public void setDateOfBirth(Date dateOfBirth) {
        this.dateOfBirth = dateOfBirth;
    }

    @Override
    public String toString() {
        return  id + "\t" + name + '\t' + lastname + '\t' + dateOfBirth;
    }
}
