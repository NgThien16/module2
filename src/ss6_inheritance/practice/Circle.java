package ss6_inheritance.practice;

import java.awt.*;

public class Circle extends Shape {
    private double radius;

    public Circle(){
        this.radius = 0;
    }
    public Circle(double radius, String color, boolean filled) {
        this.radius = radius;
        setColor(color);
        setFilled(filled);
    }
    public void getArea(double r) {

    }

}
