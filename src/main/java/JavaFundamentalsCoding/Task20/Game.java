package JavaFundamentalsCoding.Task20;

import JavaFundamentalsCoding.Helper;
import java.util.Random;

public class Game {
    public static void main(String[] args) {
        Random random = new Random();
        int secret = random.nextInt(10);
        System.out.print("Jepni nje numer: ");
        int guess;
        int count = 0;
        do{
           guess = Helper.getIntFromUser();
           count++;
           if (guess == secret){
                System.out.print("Congratulations! You found it with " + count + " guesses.");
                break;
            }
            if (guess > secret){
                System.out.println("Too much!");
            }
            else if (guess < secret) {
                System.out.println("Too little!");
            }
        }while(true);
    }
}
