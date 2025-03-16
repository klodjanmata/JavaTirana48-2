package JavaAdvanced.Exercises.OOP.Task3;

public class Square extends Rectangle {
    public Square() {
        super();
    }

    public Square(String color, boolean isFilled, int x) {
        super(color, isFilled, x, x);
    }

    @Override
    public String toString() {
        return "Square with width = " + super.getWidth() +
                " which is a sublass off " + super.toString();
    }
}
