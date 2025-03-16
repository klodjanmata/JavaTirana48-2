package JavaFoundamentals.Exercises;

import java.util.Scanner;

public class Exercise4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Vendos nje numer:");
        int n = scanner.nextInt();

        for (int i = 0; i < n; i++) {
            for(int j = 0; j < n - i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }


    }
}

/**

 *****
 ****
 ***
 **
 *

 */