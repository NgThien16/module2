package ss6_inheritance.exercise;

public class Cylinder extends Circle {
    private int height;

    public Cylinder(){

    }
    public Cylinder(int height, String color, double radius){
        super(radius, color);
        this.height = height;
    }

    public int getHeight() {
        return height;
    }

    public void setHeight(int height) {
        this.height = height;
    }

    @Override
    public double getArea(){
        return getRadius() *getRadius()*3.14*height;
    }

    public static void main(String[] args) {
        Cylinder cylinder = new Cylinder(10, "Green", 5);
        System.out.println(cylinder.getArea());
        System.out.println(cylinder.getColor());
    }

}
