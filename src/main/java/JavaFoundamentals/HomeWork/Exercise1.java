package JavaFoundamentals.HomeWork;

import java.util.Scanner;

public class Exercise1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Vendos nje numer:");
        int n = scanner.nextInt();
        //boolean check = (n % 2 == 0) ? true : false;
        if((n % 2 == 0)){
            System.out.println("Numri eshte cift!");
        }
        else{
            System.out.println("Numri eshte tek!");
        }
    }
}
