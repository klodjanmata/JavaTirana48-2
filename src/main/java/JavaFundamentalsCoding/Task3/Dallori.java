package JavaFundamentalsCoding.Task3;

import JavaFundamentalsCoding.Helper;

public class Dallori {
    public static void main(String[] args) {
        int a, b, c;
        System.out.println("Jepni 3 koeficentet a, b dhe c");
        System.out.print("a = ");
        a = Helper.getIntFromUser();
        System.out.print("b = ");
        b = Helper.getIntFromUser();
        System.out.print("c = ");
        c = Helper.getIntFromUser();
        System.out.println("Solving: " + a + "*x^2 + " + b + "*x +" + c + " = 0");
        int dallori = calculateDallori(a, b, c);
        if (dallori < 0){
            System.out.println("Delta negative!");
        }
        else{
            double x1 = (-b - Math.sqrt(dallori)) / (2*a);
            double x2 = (-b + Math.sqrt(dallori)) / (2*a);
            System.out.println("X1 = " + x1 + " \nX2 = " + x2);
        }
    }

    private static int calculateDallori(int a, int b, int c){
        return b*b - 4*a*c;
    }
}
