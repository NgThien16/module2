package ss7_abtract_interface;

public class Square extends Shape implements Resizeable, Colorable {
    @Override
    public boolean howToColor() {
        System.out.println("Color all four sides");
        return false;
    }

    private double width = 1.0;


    public Square() {
    }

    public Square(double width) {
        this.width = width;

    }

    public Square(double width, String color, boolean filled) {
        super(color, filled);
        this.width = width;
    }

    public double getWidth() {
        return width;
    }

    public void setWidth(double width) {
        this.width = width;
    }



    public double getArea() {
        return width * width;
    }

    public double getPerimeter() {
        return 4 * width ;
    }

    @Override
    public String toString() {
        return "A Square with width="
                + getWidth()
                + ", which is a subclass of "
                + super.toString();
    }

    @Override
    public void resize(double percent) {
        this.width += this.width*percent/100;

    }

    public static void main(String[] args) {
        Square square = new  Square();
        square.setWidth(15);
        System.out.println("Diện tích:"+ square.getArea() + "và chu vi:" + square.getPerimeter());
        square.howToColor();
    }

}