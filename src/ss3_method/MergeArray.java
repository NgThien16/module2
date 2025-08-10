package ss3_method;
import java.util.Scanner;
import java.util.Arrays;

public class MergeArray {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Bước 1: Tạo 2 mảng số với kích thước cho trước
        System.out.print("Nhập số phần tử của mảng 1: ");
        int size1 = scanner.nextInt();
        int[] array1 = new int[size1];

        System.out.print("Nhập số phần tử của mảng 2: ");
        int size2 = scanner.nextInt();
        int[] array2 = new int[size2];

        // Bước 2: Nhập giá trị cho mảng 1
        for (int i = 0; i < size1; i++) {
            System.out.print("array1[" + i + "] = ");
            array1[i] = scanner.nextInt();
        }

        // Nhập giá trị cho mảng 2
        for (int i = 0; i < size2; i++) {
            System.out.print("array2[" + i + "] = ");
            array2[i] = scanner.nextInt();
        }

        // Bước 3: Tạo mảng thứ 3
        int[] array3 = new int[size1 + size2];

        // Bước 4: Sao chép mảng 1 vào mảng 3
        for (int i = 0; i < size1; i++) {
            array3[i] = array1[i];
        }

        // Bước 5: Sao chép mảng 2 vào mảng 3 (từ vị trí tiếp theo)
        for (int i = 0; i < size2; i++) {
            array3[size1 + i] = array2[i];
        }

        // In kết quả
        System.out.println("Mảng 1: " + Arrays.toString(array1));
        System.out.println("Mảng 2: " + Arrays.toString(array2));
        System.out.println("Mảng 3 (ghép): " + Arrays.toString(array3));

        scanner.close();
    }
}
