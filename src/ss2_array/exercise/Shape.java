package ss2_array.exercise;

import java.util.Scanner;

public class Shape {
    public static void main(String[] args) {
        int choice =-1;
        Scanner input = new Scanner(System.in);
        while(choice!=0){
        System.out.println("Menu");
        System.out.println("1. Print the rectangle");
        System.out.println("2. Print the square triangle");
        System.out.println("3. print isosceles triangle");
        System.out.println("0. Exit");
        System.out.println("Enter your choice: ");
        choice = input.nextInt();
        switch(choice){
            case 1:
                System.out.println("Draw the rectangle");
                for (int i = 0; i <3; i++) {
                    for (int j = 0; j < 7; j++) {
                        System.out.print("* ");
                    }
                    System.out.println();
                }
                break;
            case 2:
                System.out.println("Draw the square triangle");
                for (int i = 1; i <=5-i; i++) {
                    for (int j = 1; j < i; j++) {
                        System.out.print("*");
                    }
                    System.out.println();
                }
                break;
            case 3:
                System.out.println("Draw the isosceles triangle");
                for (int i = 7; i >=1; i--) {
                    for (int j = 1; j <= 5 - i; j++) {
                        System.out.print("  "); // spacing
                    }
                    for (int j = 1; j <= 2 * i - 1; j++) {
                        System.out.print("* ");
                    }
                    System.out.println();
                }
                break;
            case 0:
                System.exit(0);
                break;
            default:
                System.out.println("Invalid choice");

        }
    }
    }
}
