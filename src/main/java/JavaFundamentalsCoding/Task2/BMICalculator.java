package JavaFundamentalsCoding.Task2;

import JavaFundamentalsCoding.Helper;

public class BMICalculator {
    public static void main(String[] args) {
        System.out.println("Put your weight in kg: ");
        float weight = Helper.getFloatFromUser();
        System.out.println("Put your height in cm: ");
        int height = Helper.getIntFromUser();
        float index = calculateBMI(weight, height);
        if (index >= 18.5 && index <= 24.9){
            System.out.println("BMI Optimal");
        }
        else {
            System.out.println("BMI NOT Optimal");
        }
    }

    private static float calculateBMI(float weight, int height){
        float heightM = (float) height / 100;
        return weight / (heightM * heightM);
    }
}
