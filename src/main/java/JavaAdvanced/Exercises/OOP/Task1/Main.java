package JavaAdvanced.Exercises.OOP.Task1;

public class Main {
    public static void main(String[] args) {
//        Point2D d1 = new Point2D((float) 2.5, (float) 7.6);
//        System.out.println("Point2D: " + d1);
//        Point3D d2 = new Point3D((float) 2.6, (float) -3.5, (float) 8.2);
//        System.out.println("Point3D: " + d2);

        Line l1 = new Line(-2, 0, 2, 0);
        System.out.println("midPoint: " + l1.midPoint());
        System.out.println("length: " + l1.calculateDistance());

        Line l2 = new Line(new Point2D(5, 8), new Point2D(8, 5));
        System.out.println("midPoint: " + l2.midPoint());
        System.out.println("length: " + l2.calculateDistance());
    }
}
