package JavaFoundamentals.HomeWork;

import java.util.Scanner;

public class Exercise3 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Vendos nje numer: ");
        int n = input.nextInt();
        int sum = 0;
        for(int i = 1; i <= n; i++){
            sum += i;
        }
        System.out.println("Shuma eshte: " + sum);
    }
}
