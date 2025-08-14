package ss7_abtract_interface;

public class ShapeTest {

    public static void main(String[] args) {
        Shape shape = new Shape() {
            @Override
            public double getArea() {
                return 0;
            }
        };
        System.out.println(shape);
    }
}
