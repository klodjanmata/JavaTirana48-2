package JavaFoundamentals.Exercises;

import java.util.Scanner;

public class Exercise {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Vendosni nje numer: ");
        int number = scanner.nextInt();

        if (number % 7 == 0){
            System.out.println("Numri plotpjestohet me 7");
        }
        else{
            System.out.println("Numri NUK plotpjestohet me 7");
            System.out.println("Mbetja eshte: " + number % 7 );
        }
    }
}
