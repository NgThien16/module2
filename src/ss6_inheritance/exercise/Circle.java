package ss6_inheritance.exercise;

public class Circle {
    private double radius;
    private String color;

    public Circle(){

    }

    public Circle(double radius, String color) {
        this.radius = radius;
        this.color = color;
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }
    public double getArea(){
        return radius *radius*3.14;
    }

    public static void main(String[] args) {
        Circle circle = new Circle(5,"Pink");
        System.out.println(circle.getArea());
    }
}
