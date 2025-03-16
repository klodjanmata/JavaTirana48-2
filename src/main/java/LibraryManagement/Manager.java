package LibraryManagement;

import JavaFundamentalsCoding.Helper;
import LibraryManagement.Init.InitAuthors;
import LibraryManagement.Init.InitBooks;
import LibraryManagement.Init.InitPerson;
import LibraryManagement.Init.InitWorkers;
import java.time.LocalDate;

public class Manager {
    private Loan[] loans;
    private int lastLoanIndex;
    private Register register;

    public void initRegister(){
        loans = new Loan[1000];
        lastLoanIndex = 0;
        register = new Register();
        register.setWorkers(InitWorkers.initWorkers());
        register.setAuthors(InitAuthors.initAuthors());
        register.setBooks(InitBooks.initBooks(register.getAuthors()));
        register.setPersons(InitPerson.initPersons());
    }

    public Loan createLoan(){
        for (Worker w : register.getWorkers()){
            System.out.println(w.toString());
        }
        System.out.print("Which user are you: ");
        int workerIndex = Helper.getIntFromUser();
        for (Person p : register.getPersons()){
            System.out.println(p.toString());
        }
        System.out.print("Select who is borrowing: ");
        int borrowerIndex = Helper.getIntFromUser();
        for (Book b : register.getBooks()){
            System.out.println(b.toString());
        }
        System.out.print("Select Book: ");
        int bookIndex = Helper.getIntFromUser();
        if (workerIndex < 1 || workerIndex > register.getWorkers().length
            || bookIndex < 1 || bookIndex > register.getBooks().length
            || borrowerIndex < 1 || borrowerIndex > register.getBooks().length){
            System.out.println("Invalid inputs");
            return null;
        }
        Loan newLoan = new Loan();
        newLoan.setWorker(register.getWorkers()[workerIndex - 1]);
        newLoan.setPerson(register.getPersons()[borrowerIndex - 1]);
        newLoan.setBook(register.getBooks()[bookIndex - 1]);
        newLoan.setTakeDate(LocalDate.now());
        newLoan.setScheduledReturnDate(LocalDate.now().plusMonths(1));
        newLoan.setReturned(false);
        return newLoan;
    }

    public void saveLoan(Loan loan){
        this.loans[lastLoanIndex] = loan;
        this.lastLoanIndex++;
    }

    public Manager(Loan[] loans) {
        this.loans = loans;
    }

    public Manager() {}

    public Loan[] getLoans() {
        return loans;
    }

    public void setLoans(Loan[] loans) {
        this.loans = loans;
    }

    public Register getRegister() {
        return register;
    }

    public void setRegister(Register register) {
        this.register = register;
    }

    public int getLastLoanIndex() {
        return lastLoanIndex;
    }

    public void setLastLoanIndex(int lastLoanIndex) {
        this.lastLoanIndex = lastLoanIndex;
    }
}
