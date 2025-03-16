package JavaFundamentalsCoding.Task14;

import JavaFundamentalsCoding.Helper;

public class Main {
    public static void main(String[] args) {
        System.out.print("Enter the first lowercase letter: ");
        char firstLetter = Helper.getCharFromUser();

        System.out.print("Enter the second lowercase letter: ");
        char secondLetter = Helper.getCharFromUser();

        System.out.println("Number of characters between the letters: "
                + calculateDistanceBetweenChars(firstLetter, secondLetter));
    }

    public static int calculateDistanceBetweenChars(char first, char second) {
        return Math.abs(first - second) - 1;
    }
}
