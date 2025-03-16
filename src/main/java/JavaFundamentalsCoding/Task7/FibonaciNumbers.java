package JavaFundamentalsCoding.Task7;

import JavaFundamentalsCoding.Helper;

public class FibonaciNumbers {
    public static void main(String[] args) {
        System.out.print("Jepni nje numer natyror: ");
        int n = Helper.getIntFromUser();
        System.out.println("Kufiza e " + n + " ne vargun e Fibonacit: "
                            + findFibonaciN(n));
    }

    private static int findFibonaciN(int n) {
        if ( n < 3) {
            return 1;
        }
        int a = 1;
        int b = 1;
        int c = 2;
        for (int i = 3; i <= n; i++){
            c = a + b;
            a = b;
            b = c;
        }
        return c;
    }
}
