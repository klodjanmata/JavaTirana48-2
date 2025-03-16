package JavaAdvanced.Exercises.Class.Task1;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("Enter your email address: ");
        Scanner scanner = new Scanner((System.in));
        String input = scanner.nextLine();
        UserValidator userValidator = new UserValidator();
        input = null;
        String email = userValidator.validateEmail(input);
        System.out.println("Email: " + email);
    }
}
