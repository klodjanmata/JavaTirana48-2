package JavaFoundamentals.HomeWork;

import java.util.Scanner;

public class Exercise6 {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        System.out.print("Vendosni nje numer: ");
        int n = input.nextInt();

        long faktorial = 1;
        for (int i = n; i > 0; i--){
            faktorial = faktorial * i;
        }
        System.out.println(n + "! = " + faktorial);
    }
}


//  7! = 7 * 6 * 5 *4 * 3 *2
