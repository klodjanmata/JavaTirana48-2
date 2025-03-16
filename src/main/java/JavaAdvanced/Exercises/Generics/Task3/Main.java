package JavaAdvanced.Exercises.Generics.Task3;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<String> students = new ArrayList<>();
        students.add("John");
        students.add("Jane");
        students.add("Bob");
        students.add("Mary");
        System.out.println(students);
        Swap<String> swap = new Swap<>(students);
        students = swap.swapElements(2, 3);
        System.out.println(students);

        List<Integer> numbers = new ArrayList<>();
        numbers.add(1);
        numbers.add(2);
        numbers.add(3);
        numbers.add(4);
        System.out.println(numbers);
        Swap<Integer> swap2 = new Swap<>(numbers);
        numbers = swap2.swapElements(2, 3);
        System.out.println(numbers);
    }
}
