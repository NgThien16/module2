package ss15_exception;

import java.util.Scanner;

public class IllegalTriangleException extends Exception {
    public IllegalTriangleException(String message) {
        super(message);
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        try {
            System.out.println("Please enter the sides of a triangle");
            System.out.println("Please enter the 1 side of a triangle");
            int slide1 = Integer.parseInt(scanner.nextLine());
            System.out.println("Please enter the 2 side of a triangle");
            int slide2 = Integer.parseInt(scanner.nextLine());
            System.out.println("Please enter the 3 side of a triangle");
            int slide3 = Integer.parseInt(scanner.nextLine());
            if (slide1 <= 0 || slide2 <= 0 || slide3 <= 0) {
                throw new IllegalTriangleException("The length of the sides must be positive.");
            }
            if (slide1 + slide2 <= slide3 || slide2 + slide3 <= slide1 || slide3 + slide1 <= slide2) {
                throw new IllegalTriangleException("The sum of the lengths of two sides must be greater than the remaining side.");
            }
            System.out.println("The valid triangle");
        } catch (IllegalTriangleException i) {
            System.out.println("Error: " + i.getMessage());
        } catch (Exception e) {
            System.out.println("Error: " + e.getMessage());
        } finally {
            scanner.close();
        }
    }
}