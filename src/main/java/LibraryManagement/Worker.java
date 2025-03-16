package LibraryManagement;

import java.time.LocalDate;

public class Worker {
    private String ID;
    private String Name;
    private String Surname;
    private char Gender;
    private String Address;
    private String Phone;
    private String Email;
    private boolean Active;
    private LocalDate startDate;
    private LocalDate endDate;

    public Worker(String ID, String name, String surname,
                  char gender, String address, String phone,
                  String email, boolean active, LocalDate startDate) {
        this.ID = ID;
        Name = name;
        Surname = surname;
        Gender = gender;
        Address = address;
        Phone = phone;
        Email = email;
        Active = active;
        this.startDate = startDate;
    }

    public String getID() {
        return ID;
    }

    public void setID(String ID) {
        this.ID = ID;
    }

    public String getName() {
        return Name;
    }

    public void setName(String name) {
        Name = name;
    }

    public String getSurname() {
        return Surname;
    }

    public void setSurname(String surname) {
        Surname = surname;
    }

    public char getGender() {
        return Gender;
    }

    public void setGender(char gender) {
        Gender = gender;
    }

    public String getAddress() {
        return Address;
    }

    public void setAddress(String address) {
        Address = address;
    }

    public String getPhone() {
        return Phone;
    }

    public void setPhone(String phone) {
        Phone = phone;
    }

    public String getEmail() {
        return Email;
    }

    public void setEmail(String email) {
        Email = email;
    }

    public boolean isActive() {
        return Active;
    }

    public void setActive(boolean active) {
        Active = active;
    }

    public LocalDate getStartDate() {
        return startDate;
    }

    public void setStartDate(LocalDate startDate) {
        this.startDate = startDate;
    }

    public LocalDate getEndDate() {
        return endDate;
    }

    public void setEndDate(LocalDate endDate) {
        this.endDate = endDate;
    }

    @Override
    public String toString() {
        return "Worker{" +
                "ID='" + ID + '\'' +
                ", Name='" + Name + '\'' +
                ", Surname='" + Surname + '\'' +
                ", Gender=" + Gender +
                ", Address='" + Address + '\'' +
                ", Phone='" + Phone + '\'' +
                ", Email='" + Email + '\'' +
                ", Active=" + Active +
                ", startDate=" + startDate +
                ", endDate=" + endDate +
                '}';
    }
}

