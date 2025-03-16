package JavaFoundamentals.HomeWork;

import java.util.Scanner;

public class Exercises {
    public static void main(String[] args) {
//        Exercise 3
//        printSumOfNumbers(calculateSumOfNumbers(getNumberFromUser()));
//        Exercise 4
//        printMultiplicationTable(getNumberFromUser());
//        printFizzBuzz(getNumberFromUser());
//        printStringNumber("Factorial is: ", calculateFactorial(getNumberFromUser()));
//        printStringNumber("The Greatest is: ", findTheGreatest(getNumberFromUser(), getNumberFromUser(), getNumberFromUser()));
//        int number = getNumberFromUser();
//        count1ToN(number);
//        System.out.println();
//        countNTo1(number);
//        printStringNumber("Sum of Even numbers: ", sumOfEvenNumbers(getNumberFromUser()));
//        System.out.println(isPrime(getNumberFromUser()));
//        printPrimeNumbers(getNumberFromUser());
        printStringNumber("Reversed number: ", reverseNumber(getNumberFromUser()));

    }
    //Exercise 11
    static int reverseNumber(int number) {
        int reversedNumber = 0;
        do{
            reversedNumber = reversedNumber * 10 + number % 10;
            number /= 10;
        }while(number != 0);
        return reversedNumber;
    }

    //Exersise 10.1
    public static void printPrimeNumbers(int n) {
        if(n <= 1){
            return;
        }
        System.out.print("2, ");
        for (int i = 3; i <= n; i += 2){
            if (isPrime(i)){
                System.out.print(i + ", ");
            }
        }
    }

    // Exercise 10
    static boolean isPrime(int number) {
        if (number == 2){
            return true;
        }
        if (number <= 1 && isEven(number)) {
            return false;
        }
        for (int i = 3; i <= number / 2; i += 2) {
            if (number % i == 0) {
                return false;
            }
        }
        return true;
    }

    //Exercise 9
    static int sumOfEvenNumbers(int number){
        int sum = 0;
        for (int i = 2; i <= number; i += 2){
            sum += i;
        }
        return sum;
    }

    //Exercise 8.2
    static void countNTo1(int number) {
        for (int i = number; i >= 1; i--){
            System.out.print(i + ", ");
        }
    }

    //Exercise 8.1
    static void count1ToN(int n){
        for (int i = 1; i <= getNumberFromUser(); i++){
            System.out.print(i + ", ");
        }
    }

    //Exercise 7
    static int findTheGreatest(int a, int b, int c){
        if (a > b && a > c){
            return a;
        }
        else if (b > c){
            return b;
        }
        return c;
    }

    //Exercise 6
    static long calculateFactorial(int number) {
        long factorial = 1;
        for(int i = number; i > 1; i--){
            factorial *= i;
        }
        return factorial;
    }

    //Exercise 5
    static void printFizzBuzz(int number) {
        for (int i = 1; i <= number; i++) {
            if (isMultiple(i, 3) && isMultiple(i, 5)) {
                System.out.println("FizzBuzz");
            }
            else if(isMultiple(i, 3)){
                System.out.println("Fizz");
            }
            else if(isMultiple(i, 5)){
                System.out.println("Buzz");
            }
            else{
                System.out.println(i);
            }
        }
    }

    static boolean isMultiple(int number1, int number2){
        return number1 % number2 == 0;
    }

    //Exercise4
    static void printMultiplicationTable(int number){
        for (int i = 1; i <= 10; i++) {
            printFormated(number, i);
        }
    }

    static void printFormated(int first, int second){
        System.out.print(first + " x ");
        System.out.printf("%2d", second);
        System.out.print(" = ");
        System.out.printf("%3d", first*second);
        System.out.println();
    }

    //Exercise 3
    static void printStringNumber(String s, long n){
        System.out.println(s + n);
    }

    static int calculateSumOfNumbers(int number) {
        int sum = 0;
        for(int i = 1; i <= number; i++) {
            sum += i;
        }
        return sum;
    }

    static int calculateSumOfNumbers(float number) {
        return 0;
    }

    //Exerecise 1
    static void printEvenOrOdd() {
        if (isEven(getNumberFromUser())) {
            System.out.println("Even");
            return;
        }
        System.out.println("Odd");
    }

    static int getNumberFromUser(){
        Scanner input = new Scanner(System.in);
        System.out.print("Enter number: ");
        int number = input.nextInt();
        return number;
    }

    static boolean isEven(int number){
        return (number % 2 == 0) ? true : false;
//        if(number % 2 == 0){
//            return true;
//        }
//        return false;
    }
}
