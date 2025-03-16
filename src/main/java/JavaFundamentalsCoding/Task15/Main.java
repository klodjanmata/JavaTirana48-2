package JavaFundamentalsCoding.Task15;

import JavaFundamentalsCoding.Helper;
import java.util.Arrays;

public class Main {
//    public static void main(String[] args) {
//        int[] numbers = Helper.generateRandomArray(10000, 9999999);
//        orderAscArray(numbers);
//        System.out.println(Arrays.toString(numbers));
//        for (int i = 0; i < numbers.length - 1; i++) {
//            if (numbers[i] == numbers[i + 1]){
//                System.out.println(numbers[i]);
//                i++;
//                int j = i + 1;
//                while (numbers[i] == numbers[j]){
//                    i++;
//                    j++;
//                }
//            }
//        }
//    }

    public static void main(String[] args) {
        int[] numbers = Helper.generateRandomArray(10, 20);
        System.out.println(Arrays.toString(numbers));
        orderArray(numbers, false);
        System.out.println(Arrays.toString(numbers));
    }

    public static void orderArray (int [] numbers, boolean ascending){
        for(int i = 0 ; i < numbers.length; i ++){
            for(int j = i + 1; j< numbers.length;j++){
                if ((ascending && numbers[j] < numbers[i]) ||
                    (!ascending && numbers[j] > numbers[i]) ){
                    int tmp = numbers[i];
                    numbers[i] = numbers[j];
                    numbers[j] = tmp;
                }
            }
        }
    }
}
/**
 [1, 2, 4, 5, 8]
 */
