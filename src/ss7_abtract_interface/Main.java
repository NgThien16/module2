package ss7_abtract_interface;


import java.util.Random;

public class Main {
    public static void main(String[] args) {
        Shape[] shapes = new Shape[3];
        shapes[0] = new Circle(5);
        shapes[1] = new Rectangle(4, 6);

        Random random = new Random();

        for (Shape shape : shapes) {
            double beforeArea = shape.getArea();
            double percent = 1 + random.nextInt(100); // 1-100%

            if (shape instanceof Resizeable) {
                ((Resizeable) shape).resize(percent);
            }

            double afterArea = shape.getArea();
            System.out.printf(
                    "%s: Tăng %.0f%% - Diện tích trước: %.2f, sau: %.2f%n",
                    shape.getClass().getSimpleName(), percent, beforeArea, afterArea
            );
        }
    }
}
