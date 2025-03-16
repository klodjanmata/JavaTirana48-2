package JavaAdvanced.Exercises.OOP.Task3;

import java.util.ArrayList;
import java.util.List;

public class GenericsExample implements OrderReverser {


    public static void main(String[] args) {
        Circle c1 = new Circle();
        Circle c2 = new Circle();
        Rectangle r1 = new Rectangle();
        Rectangle r2 = new Rectangle();
        Square s1 = new Square();
        Square s2 = new Square();
//        List<Shape> shapes = new ArrayList<>(List.of(c1, c2, r1, r2, s1, s2));
//        List<Circle> circles = new ArrayList<>(List.of(c1, c2));
//        List<Rectangle> rectangles = new ArrayList<>(List.of(r1, r2, s1, s2));
        List<Square> squares = new ArrayList<>();
        squares.add(s1);
        squares.add(s2);
//        reverseList(shapes);
//        reverseList(circles);
//        reverseList(rectangles);
        OrderReverser.reverseList(squares);
    }

}
