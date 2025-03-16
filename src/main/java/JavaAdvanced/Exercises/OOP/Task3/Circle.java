package JavaAdvanced.Exercises.OOP.Task3;

public class Circle extends Shape {
    private int radius;

    public Circle(){
        super();
        this.radius=1;
    }

    public Circle(String color, boolean isFilled, int radius){
        super(color, isFilled);
        this.radius=radius;
    }

    public int getRadius() {
        return radius;
    }

    public void setRadius(int radius) {
        this.radius = radius;
    }

    @Override
    public double getArea(){
        return Math.PI*radius*radius;
    }

    @Override
    public double getPerimeter(){
        return 2*Math.PI*radius;
    }

    @Override
    public String toString(){
        return "Circle with radius = "+ radius +
                " which is a subclass off " + super.toString();
    }
}
