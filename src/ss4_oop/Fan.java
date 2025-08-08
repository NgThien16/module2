package ss4_oop;

import static java.awt.Color.blue;

public class Fan {
    final int SLOW = 1;
    final int MEDIUM = 1;
    final int FAST = 1;

    private int speed = SLOW;
    private boolean on = false;
    private double radius =5 ;
    private String color = blue;

    public int getSLOW() {
        return SLOW;
    }

    public int getMEDIUM() {
        return MEDIUM;
    }

    public int getFAST() {
        return FAST;
    }

    public int getSpeed() {
        return speed;
    }

    public void setSpeed(int speed) {
        this.speed = speed;
    }

    public boolean isOn() {
        return on;
    }

    public void setOn(boolean on) {
        this.on = on;
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
    public String toString(){
        if(on){
            return "Fan is on: Speed"+speed+"color:"+color+"radius:"+radius  ;
        }else{
            return "Fan is off: Speed"+speed+"color:"+color+"radius:"+radius  ;
        }
    }


}
