package JavaAdvanced.Exercises.OOP.Task3;

public class Main {
    public static void main(String[] args) {
        Shape sh1 = new Circle("red", false, 5);
        System.out.println(sh1);
        System.out.println("Area: " + sh1.getArea());
        System.out.println("Perimeter: " + sh1.getPerimeter());
        sh1 = new Rectangle("green", false, 5, 8);
        System.out.println(sh1);
        System.out.println("Area: " + sh1.getArea());
        System.out.println("Perimeter: " + sh1.getPerimeter());
        sh1 = new Square("purple", true, 7);
        System.out.println(sh1);
        System.out.println("Area: " + sh1.getArea());
        System.out.println("Perimeter: " + sh1.getPerimeter());
    }
}
