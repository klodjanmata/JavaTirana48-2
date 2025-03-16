package LibraryManagement;


public class Main {

    public static void main(String[] args) {
        Manager libraryManager = new Manager();
        libraryManager.initRegister();
        Loan l = libraryManager.createLoan();
        libraryManager.saveLoan(l);
        for (int i = 0; i < libraryManager.getLastLoanIndex(); i++){
            System.out.println(libraryManager.getLoans()[i].toString());
        }
    }

}
