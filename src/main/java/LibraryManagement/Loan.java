package LibraryManagement;

import java.time.LocalDate;

public class Loan {
    private Worker worker;
    private Person person;
    private Book book;
    private LocalDate takeDate;
    private LocalDate scheduledReturnDate;
    private LocalDate returnDate;
    private boolean returned;

    public Loan(Worker worker, Person person, Book book,
                LocalDate takeDate, LocalDate scheduledReturnDate,
                LocalDate returnDate, boolean returned) {
        this.worker = worker;
        this.person = person;
        this.book = book;
        this.takeDate = takeDate;
        this.scheduledReturnDate = scheduledReturnDate;
        this.returnDate = returnDate;
        this.returned = returned;
    }

    public Loan() {}

    public Worker getWorker() {
        return worker;
    }

    public void setWorker(Worker worker) {
        this.worker = worker;
    }

    public Person getPerson() {
        return person;
    }

    public void setPerson(Person person) {
        this.person = person;
    }

    public Book getBook() {
        return book;
    }

    public void setBook(Book book) {
        this.book = book;
    }

    public LocalDate getTakeDate() {
        return takeDate;
    }

    public void setTakeDate(LocalDate takeDate) {
        this.takeDate = takeDate;
    }

    public LocalDate getScheduledReturnDate() {
        return scheduledReturnDate;
    }

    public void setScheduledReturnDate(LocalDate scheduledReturnDate) {
        this.scheduledReturnDate = scheduledReturnDate;
    }

    public LocalDate getReturnDate() {
        return returnDate;
    }

    public void setReturnDate(LocalDate returnDate) {
        this.returnDate = returnDate;
    }

    public boolean isReturned() {
        return returned;
    }

    public void setReturned(boolean returned) {
        this.returned = returned;
    }

    @Override
    public String toString() {
        return "Loan{" +
                "worker=" + worker +
                ", person=" + person +
                ", book=" + book +
                ", takeDate=" + takeDate +
                ", scheduledReturnDate=" + scheduledReturnDate +
                ", returnDate=" + returnDate +
                ", returned=" + returned +
                '}';
    }
}
