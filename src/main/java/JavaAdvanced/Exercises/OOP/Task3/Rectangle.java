package JavaAdvanced.Exercises.OOP.Task3;

public class Rectangle extends Shape{
    private double width;
    private double length;

    public Rectangle(){
        super();
        this.length=1;
        this.width=1;

    }
    public Rectangle(String color, boolean isFielled, double length, double width){
        super(color, isFielled);
        this.length = length;
        this.width = width;
    }

    public double getWidth() {
        return width;
    }

    public void setWidth(double width) {
        this.width = width;
    }

    public double getLength() {
        return length;
    }

    public void setLength(double length) {
        this.length = length;
    }

    @Override
    public double getArea(){
        return width*length;
    }

    @Override
    public double getPerimeter(){
        return 2*width+2*length;
    }

    @Override
    public String toString() {
        return "Rectangle with width = " + width +
                " and length = " + length +
                " which is a sublass off " + super.toString();
    }
}
