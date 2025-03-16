package JavaFundamentalsCoding.Task10;

import JavaFundamentalsCoding.Helper;

public class SumOfDigits {
    public static void main(String[] args) {
        System.out.print("Enter a number: ");
        int n = Helper.getIntFromUser();
        System.out.println("Sum of digits: " + sumOfDigits(n));
    }

    public static int sumOfDigits(int n){
        int sum = 0;
        int temp = Math.abs(n);
        while (temp > 0) {
            sum += temp % 10;
            temp /= 10;
        }
        return sum;
    }
}
