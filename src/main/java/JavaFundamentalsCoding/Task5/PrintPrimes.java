package JavaFundamentalsCoding.Task5;

import JavaFundamentalsCoding.Helper;

public class PrintPrimes {
    public static void main(String[] args) {
        System.out.println("Jepni nje numer natyror: ");
        int n = Helper.getIntFromUser();
        Helper.printPrimeNumbers(n);
    }
}
