package JavaFoundamentals.HomeWork.Arrays;

import java.util.Random;
import java.util.Scanner;

public class Arrays {
    public static void main(String[] args) {
//        int[] table = new int[5];
//        for(int i = 0; i < table.length; i++){
//            table[i] = i + 1;
//        }
//        for (int i = 0; i < table.length; i++){
//            System.out.println(table[i]);
//        }
//        System.out.println("Enter the size of the array: ");
//        int n = getNumberFromUser();
//        int[] numbers = fillArrayFromUser(n);
//        printArray(numbers);
//        printStringNumber("Sum of elements is: ", calculateArraysSum(numbers));
//        int[] numbers = {
//                135, 87, 999, -42, 521, 43, 765, -320, 870, 56,
//                234, 764, -199, 35, 412, 879, 123, 678, -88, 444,
//                321, 6789, 122, 567, 810, -543, 909, 1023, -321, 111,
//                222, 345, 876, -678, 999, 4444, 777, 66, 901, -87
//        };
//        printArray(numbers);
//        System.out.println("Max: " + findTheGreatest(numbers));
//        int[] numbers = new int[]{1, 2, 3, 4, 5, 6, 7, 8, 9};
//        int[] reversed = reverseOrder(numbers);
//        printArray(reversed);


//        System.out.print("Put a number from 1 - 50: ");
//        int m = getNumberFromUser();
//        int occurences = findOcurences(numbers, m);
//        System.out.println(occurences);
//        printArray(numbers);
        int[] numbers = generateRandomArray(200, 50);
        System.out.println(calculateAverage(numbers));
        printArray(numbers);
    }

    static int[] generateRandomArray(int size, int bound) {
        Random random = new Random();
        int[] numbers = new int[size];
        for (int i = 0; i < size; i++) {
            numbers[i] = random.nextInt(bound) + 1;
        }
        return numbers;
    }

    static float calculateAverage(int[] numbers){
        int sum = calculateArraysSum(numbers);
        return (float) sum / numbers.length;

    }

    static int calculateArraysSum(int[] array){
        int sum = 0;
        for(int i = 0; i < array.length; i++){
            sum += array[i];
        }
        return sum;
    }

    static int findOcurences(int[] numbers, int m) {
        int occurences = 0;
        for(int i = 0; i < numbers.length; i++){
            if (numbers[i] == m){
                occurences++;
            }
        }
        return occurences;
    }

    static int[] reverseOrder(int[] numbers) {
        int[] reversed = new int[numbers.length];
        for(int i = 0; i < reversed.length; i++){
            reversed[i] = numbers[numbers.length - 1 - i];
        }
        return reversed;
    }

    public static void reversed(int[] array) {
        System.out.println("Reversed array:");
        for (int i = array.length - 1; i >= 0; i--) {
            System.out.print(array[i] + ", ");
        }
    }

    static int findTheGreatest(int[] array) {
        int max = array[0];
        for(int i = 1; i < array.length; i++){
            if(max < array[i]){
                max = array[i];
            }
        }
        return max;
    }

    static void printArray(int[] array){
        for(int i = 0; i < array.length; i++){
            System.out.print(array[i] + ", ");
        }
        System.out.println();
    }

    static int[] fillArrayFromUser(int n){
        int[] array = new int[n];
        for (int i = 0; i < array.length; i++) {
            System.out.println("Enter element: ");
            array[i] = getNumberFromUser();
        }
        return array;
    }

    static int getNumberFromUser(){
        Scanner input = new Scanner(System.in);
        int number = input.nextInt();
        return number;
    }

    static void printStringNumber(String s, long n){
        System.out.println(s + n);
    }

}

