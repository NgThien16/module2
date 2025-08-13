package ss6_inheritance.exercise;
import java.util.Arrays;

public class Point2D {
    private float x= 0.0f;
    private float y= 0.0f;
    public Point2D(){

    }
    public Point2D(float x, float y){
        this.x = x;
        this.y = y;
    }

    public float getY() {
        return y;
    }

    public void setY(float y) {
        this.y = y;
    }

    public float getX() {
        return x;
    }

    public void setX(float x) {
        this.x = x;
    }
    public float[] getXY(){
        return new float[]{x,y};
    }
    public void setXY(float x, float y){
        this.x = x;
        this.y = y;
    }
    public String toString(){
        return "(" + x + ", " + y + ")";
    }
    public static void main(String[] args) {
        // Kiểm thử constructor mặc định + setter
        Point2D p1 = new Point2D();
        p1.setX(1.5f);
        p1.setY(2.5f);
        System.out.println("p1 X: " + p1.getX());
        System.out.println("p1 Y: " + p1.getY());
        System.out.println("p1 XY: " + Arrays.toString(p1.getXY()));
        System.out.println("p1 toString(): " + p1);

        System.out.println("--------------------");

        // Kiểm thử constructor có tham số
        Point2D p2 = new Point2D();
        System.out.println("p2 X: " + p2.getX());
        System.out.println("p2 Y: " + p2.getY());
        System.out.println("p2 XY: " + Arrays.toString(p2.getXY()));
        System.out.println("p2 toString(): " + p2);

        System.out.println("--------------------");

        // Kiểm thử setXY()
        p2.setXY(7.0f, 8.0f);
        System.out.println("p2 XY after setXY: " + Arrays.toString(p2.getXY()));
        System.out.println("p2 toString() after setXY: " + p2);
    }

}
