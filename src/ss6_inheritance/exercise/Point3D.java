package ss6_inheritance.exercise;
import java.util.Arrays;

public class Point3D extends Point2D {
    private float z = 0.0f;
    public Point3D(){

    }
    public Point3D(float z, float x, float y){
        super(x,y);
        this.z = z;
    }

    public float getZ() {
        return z;
    }

    public void setZ(float z) {
        this.z = z;
    }
    public float[] getXYZ(){
        return new float[]{getX(),getY(),z};
    }
    public void setXYZ(float x, float y, float z) {
        setX(x);
        setY(y);
        this.z = z;
    }
    @Override
    public String toString() {
        return "(" + getX() + ", " + getY() + ", " + z + ")";
    }
    public static void main(String[] args) {
        // Kiểm thử constructor mặc định + setter
        Point3D p1 = new Point3D();
        p1.setX(1.0f);
        p1.setY(2.0f);
        p1.setZ(3.0f);
        System.out.println("p1 X: " + p1.getX());
        System.out.println("p1 Y: " + p1.getY());
        System.out.println("p1 Z: " + p1.getZ());
        System.out.println("p1 XYZ: " + Arrays.toString(p1.getXYZ()));
        System.out.println("p1 toString(): " + p1);

        System.out.println("--------------------");

        // Kiểm thử constructor có tham số
        Point3D p2 = new Point3D(4.0f, 5.0f, 6.0f);
        System.out.println("p2 X: " + p2.getX());
        System.out.println("p2 Y: " + p2.getY());
        System.out.println("p2 Z: " + p2.getZ());
        System.out.println("p2 XYZ: " + Arrays.toString(p2.getXYZ()));
        System.out.println("p2 toString(): " + p2);

        System.out.println("--------------------");

        // Kiểm thử setXYZ()
        p2.setXYZ(7.0f, 8.0f, 9.0f);
        System.out.println("p2 XYZ after setXYZ: " + Arrays.toString(p2.getXYZ()));
        System.out.println("p2 toString() after setXYZ: " + p2);
    }
}
