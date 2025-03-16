package JavaFundamentalsCoding.Task6;

import JavaFundamentalsCoding.Helper;

public class HarmonicSeries {
    public static void main(String[] args) {
        System.out.print("Jepni nje numer natyror: ");
        int n = Helper.getIntFromUser();
        System.out.println("Shuma = " + sumOfHarmonicSeries(n));
    }

    public static double sumOfHarmonicSeries(int n){
        double sum=0;
        for(int i=1; i<=n; i++){
            sum+=(double) 1/i;
        }
        return sum;
    }
}
