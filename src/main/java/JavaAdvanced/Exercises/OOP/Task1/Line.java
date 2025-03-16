package JavaAdvanced.Exercises.OOP.Task1;

public class Line {
    private Point2D beginPoint;
    private Point2D endPoint;

    public Line(Point2D beginPoint, Point2D endPoint) {
        this.beginPoint = beginPoint;
        this.endPoint = endPoint;
    }

    public Line (float beginX, float beginY, float endX, float endY){
        this.beginPoint = new Point2D(beginX, beginY);
        this.endPoint = new Point2D(endX, endY);
    }

    public double calculateDistance(){
        return Math.sqrt(Math.pow(endPoint.getX() - beginPoint.getX(), 2) +
                         Math.pow(endPoint.getY() - beginPoint.getY(), 2));
    }

    public Point2D midPoint(){
        return new Point2D((beginPoint.getX() + endPoint.getX()) / 2,
                            (beginPoint.getY() + endPoint.getY()) / 2);
    }

    public Point2D getBeginPoint() {
        return beginPoint;
    }

    public void setBeginPoint(Point2D beginPoint) {
        this.beginPoint = beginPoint;
    }

    public Point2D getEndPoint() {
        return endPoint;
    }

    public void setEndPoint(Point2D endPoint) {
        this.endPoint = endPoint;
    }
}
