package JavaFoundamentals.HomeWork;
import JavaFundamentalsCoding.Helper;

public class Exersise12 {
    public static void main (String [] args) {
        System.out.println ("Vendosni piket e lendeve tuaja: ");
        int score = Helper.getIntFromUser();
        System.out.println("Nota juaj eshte: " + llogaritNoten(score));
    }
    public static char llogaritNoten (int score){
        if (score < 40) {
            System.out.println("You failed!");
            return 'F';
        } else if (score < 50) {
            return 'E';
        } else if (score < 60) {
            return 'D';
        } else if (score < 70) {
            return 'C';
        } else if (score < 80) {
            return 'B';
        } else {
            return 'A';
        }
    }
}

