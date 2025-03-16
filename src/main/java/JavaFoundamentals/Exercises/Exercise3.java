package JavaFoundamentals.Exercises;

import java.util.Scanner;

public class Exercise3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Vendos nje numer:");
        int number = scanner.nextInt();

        for (int i = 0; i < number; i++) {
            for(int j = 0; j < i + 1; j++) {
                System.out.print("*");
            }
            System.out.println();
        }


    }
}



/**

 *
 **
 ***
 ****
 *****

 */
