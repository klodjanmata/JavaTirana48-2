package JavaFoundamentals.Example;

public class VarargsExample {
    public static void main(String[] args) {
        printArguments( 2, 3, 4, 5, 6, 7);
        //printArguments(10);
    }

    static void printArguments(int fixed, int... numbers) {
        System.out.println("Fixed variable: " + fixed);
        for (int number : numbers) {
            System.out.print(number + ", ");
        }
    }
}
