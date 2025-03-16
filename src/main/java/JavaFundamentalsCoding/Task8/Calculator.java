package JavaFundamentalsCoding.Task8;

import JavaFundamentalsCoding.Helper;

public class Calculator {
    public static void main(String[] args) {
        float a, b;
        System.out.print("Enter first number: ");
        a = Helper.getFloatFromUser();
        System.out.print("Enter operand: ");
        char c = Helper.getCharFromUser();
        System.out.print("Enter second number: ");
        b = Helper.getFloatFromUser();
        System.out.print("Total: " + calculator(a, c, b));
    }

    private static float calculator(float a, char c, float b){
        switch (c){
            case '+':
                return a + b;
            case '-':
                return a - b;
            case '*':
                return a * b;
            case '/':
                if (b == 0){
                    System.out.println("Cannot calculate");
                    return 0;
                }
                return a / b;
            default:
                System.out.println("Invalid input");
                return 0;
        }
//        if (c == '+') {
//            return a + b;
//        }
//        if (c == '-') {
//            return a - b;
//        }
//        if (c == '*') {
//            return a * b;
//        }
//        if (c == '/') {
//            return a / b;
//        }
    }

}
