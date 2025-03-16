package JavaFoundamentals.HomeWork;

import java.util.Scanner;

public class Exercise4 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Vendos nje numer: ");
        int n = input.nextInt();
        for(int i = 1; i <= 10; i++){
            System.out.print(n + " x ");
            System.out.printf("%2d", i);
            System.out.print(" = ");
            System.out.printf("%3d", n*i);
            System.out.println();
        }
    }
}
