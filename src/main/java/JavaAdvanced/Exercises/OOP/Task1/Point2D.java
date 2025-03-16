package JavaAdvanced.Exercises.OOP.Task1;

public class Point2D {

    protected float x;
    protected float y;

    public Point2D(){
        this.x = 0;
        this.y = 0;
    }

    public Point2D(float x, float y){
        this.x = x;
        this.y = y;
    }

    @Override
    public String toString(){
        return "(" + x + ", " + y + ")";
    }

    public float[] getXY(){
//        float[]xy = new float[]{x, y};
//        return xy;
        return new float[]{x, y};
    }

    public void setXY(float x, float y){
        this.x = x;
        this.y = y;
    }

    public float getX() {
        return x;
    }

    public void setX(float x) {
        this.x = x;
    }

    public float getY() {
        return y;
    }

    public void setY(float y) {
        this.y = y;
    }
}
