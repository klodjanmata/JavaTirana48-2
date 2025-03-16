package JavaAdvanced.Exercises.Generics.Task1;

public class Main {
    public static void main(String[] args) {
        Pair<Integer, String> myPair = new Pair<>(2, "Legendary");
        myPair.print();
        Pair<String, Integer> mySecondPair = new Pair<>("Black", 7);
        mySecondPair.print();
    }
}
