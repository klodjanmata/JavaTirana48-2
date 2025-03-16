package JavaAdvanced.Examples.Generics;

import java.util.ArrayList;
import java.util.List;

public class ReverseListOrder {

    public static <E> List<E> reverseList(List<E> inputList){
        List<E> outputList = new ArrayList<E>();
        for(int i = inputList.size() - 1; i >= 0; i--){
            outputList.add(inputList.get(i));
        }
        return outputList;
    }

    public static void main(String[] args) {
//        List<Integer> numbers = new ArrayList<>(1);
//        System.out.println(numbers);
//        System.out.println(reverseList(numbers));
//        List<String> names = new ArrayList<>(List.of("Mali", "Renato", "Redion", "Endi", "Orgen"));
//        System.out.println(names);
//        System.out.println(reverseList(names));
//        List<Double> doubles = new ArrayList<>(List.of(1.1, 2.2, 3.3, 4.4, 5.5, 6.6));
//        System.out.println(doubles);
//        System.out.println(reverseList(doubles));
    }
}
