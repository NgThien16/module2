package ss3_method;

import java.util.Scanner;

public class Min {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the elements of the array");
        int SIZE = Integer.parseInt(scanner.nextLine());
        int[] array = new int[SIZE];

        for (int i = 0; i < SIZE; i++) {
            System.out.println("array[" + i + "] = " );
            array[i]= Integer.parseInt(scanner.nextLine());
        }

        int min = array[0];

        for (int i = 1; i < SIZE; i++) {
            if (array[i] < min) {
                min = array[i];
            }
        }
        System.out.println("Minimum number is " + min);
        scanner.close();

    }
}
