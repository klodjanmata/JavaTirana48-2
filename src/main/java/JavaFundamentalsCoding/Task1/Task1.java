package JavaFundamentalsCoding.Task1;

import JavaFundamentalsCoding.Helper;

public class Task1 {
    public static void main(String[] args) {
        System.out.println("Enter the radius of a circle: ");
        float radius = Helper.getFloatFromUser();
        double perimeter = Helper.calculateCirclePerimeter(radius);
        System.out.println("Perimeter is: " + perimeter);
    }


}
