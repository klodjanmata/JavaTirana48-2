package JavaFoundamentals.Exercises;


import java.util.Scanner;

public class Exercise1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int number;
        int gameCount = 0;
        int score = 0;

        do {
            System.out.println("Vendosni nje numer ose 0 per te ndaluar: ");
            number = scanner.nextInt();
            if (number == 0) {
                break;
            }
            if(number == 7 || number == 14 || number == 21){
                System.out.println("Mos bej me hile!!");
                continue;
            }
            gameCount++;
            if (number % 7 == 0) {
                System.out.println("Numri plotepjestohet me 7!");
                score++;
            } else {
                System.out.println("Numri nuk plotepjestohet me 7!\nMbetja eshte:" + number % 7);
            }
        }while(true);
        System.out.println("Piket tuaja: " + score + "/" + gameCount);
//        while(number != 0){
//            gameCount++;
//            if (number % 7 == 0) {
//                System.out.println("Numri plotepjestohet me 7!");
//                score++;
//            } else {
//                System.out.println("Numri nuk plotepjestohet me 7!\nMbetja eshte:" + number % 7);
//            }
//            System.out.println("\nVendos nje numer ose vendos 0 per te ndaluar:");
//            number = scanner.nextInt();
//        }

    }
}