package JavaFundamentalsCoding.Task16;

import JavaFundamentalsCoding.Helper;
import java.util.Arrays;

public class IncreasingSequence {
    public static void main(String[] args){
        int[] numbers = Helper.generateRandomArray(50, 20);
        System.out.println(Arrays.toString(numbers));
        int maxSequence = 0;
        for (int i = 0; i < numbers.length - 1; i++){
            if (numbers[i] < numbers[i + 1]){
                int tempSequence = 2;
                for (int j = i + 1; j < numbers.length-1; j++){
                    if (numbers[j] <= numbers[j + 1]){
                        tempSequence++;
                    }else{
                        if(tempSequence > maxSequence){
                            maxSequence = tempSequence;

                        }
                        i=j;
                        break;
                    }
                }
            }
        }
        System.out.println("Max increasing Sequence = " + maxSequence);
    }
}
