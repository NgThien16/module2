package ss5_access_modifier;

public class Circle {
    private double radius = 1.0;
    private String color = "red";

    public Circle(){

    }
    public Circle(double radius){
        this.radius = radius;
    }
    public double getRadius(){
       return  this.radius;
    }
    public double getArea(){
        return radius *radius*3.14;
    }
    public static void main(String[] args) {
        Circle c1 = new Circle();
        System.out.println("Radius: " + c1.getRadius());
        System.out.println("Area: " + c1.getArea());

        // Tạo đối tượng với constructor có tham số
        Circle c2 = new Circle(2.5);
        System.out.println("Radius: " + c2.getRadius());
        System.out.println("Area: " + c2.getArea());
    }
}

