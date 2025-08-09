package ss3_method;

import java.util.Scanner;

public class DeleteArray {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the number you want to delete");
        int n = scanner.nextInt();
        int[] array = new int[n];
        System.out.println("Enter the elements of the array");
        for (int i = 0; i < n; i++) {
            System.out.println("array[" + i + "] = ");
            array[i] = scanner.nextInt();
        }
        System.out.println("Enter the element you want to delete");
        int x = scanner.nextInt();
        int index_del = -1;
        for (int i = 0; i < array.length - 1; i++) {
            if (array[i] == x) {
                index_del = i;
                break;
            }

        }
        if (index_del == -1) {
            System.out.println("The element you want to delete is not in the array");
        } else {
            for (int i = index_del; i < n - 1; i++) {
                array[i] = array[i + 1];
            }
            n--;
            System.out.println("Mảng sau khi xoá phần tử " + x + ":");
            for (int i = 0; i < n; i++) {
                System.out.print(array[i] + " ");
            }
        }
        scanner.close();

    }
}

