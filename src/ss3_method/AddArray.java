package ss3_method;

import java.util.Arrays;
import java.util.Scanner;

public class AddArray {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the elements of the array");
        int n = Integer.parseInt(scanner.nextLine());
        int[] array = new int[n];

        for (int i = 0; i < n; i++) {
            System.out.println("array[" + i + "] = ");
            array[i] = Integer.parseInt(scanner.nextLine());
        }
        System.out.println("Enter X:");
        int X = Integer.parseInt(scanner.nextLine());

        System.out.print("Input index: ");
        int index = Integer.parseInt(scanner.nextLine());

        if (index <= -1 || index >= array.length) {
            System.out.println("Can't insert index out of range");
        }else{
            int[] newArray = new int[array.length + 1];
            for(int i = 0; i < index; i++){
                newArray[i] = array[i];
            }
            newArray[index] = X;
            for(int i = index ; i < array.length; i++){
                newArray[i+1] = array[i];
            }
            System.out.println(Arrays.toString(newArray));
        }

    }
}
