package JavaAdvanced.Exercises.Collections.Task3;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.stream.Collectors;

public class RandomArray {
    private List<Integer> numbers;
    private List<Integer> uniques;
    private List<Integer> dublicates;

    private void initNumbers(){
        numbers = new ArrayList<>();
        for(int i = 0; i < 100; i++){
             numbers.add(generateRandomNumberWithBounds(0, 50));
        }
        numbers = numbers.stream().sorted().collect(Collectors.toList());
    }

    private int generateRandomNumberWithBounds(int min, int max){
        Random random = new Random();
        return random.nextInt(max - min) + min;
    }

    public void findUniques() {
        uniques = new ArrayList<>();
        for (int i = 0; i < numbers.size() - 1; i++) {
            if (numbers.get(i) != numbers.get(i+1)){
                uniques.add(numbers.get(i));
            }
            else{
                for (int j = i + 1; j < numbers.size() - 1; j++) {
                    if(numbers.get(i) == numbers.get(j)){
                        i++;
                    }
                }
            }
        }
        if (numbers.get(numbers.size() - 1) != numbers.get(numbers.size() - 2)){
            uniques.add(numbers.get(numbers.size() - 1));
        }
    }

    public void findDublicates(){
        dublicates = numbers.stream().distinct().collect(Collectors.toList());
        dublicates.removeAll(uniques);
    }

    public void printArrayList(List<Integer> array){
        for(Integer i : array){
            System.out.print(i + ", ");
        }
    }

    public static void main(String[] args){
        RandomArray randomArray = new RandomArray();
        randomArray.initNumbers();
        System.out.println("Numbers: ");
        randomArray.printArrayList(randomArray.numbers);
        randomArray.findUniques();
        System.out.println("\nUniques: ");
        randomArray.printArrayList(randomArray.uniques);
        randomArray.findDublicates();
        System.out.println("\nDublicates: ");
        randomArray.printArrayList(randomArray.dublicates);
    }
}
