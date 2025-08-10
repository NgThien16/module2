package ss3_method;

import java.util.Scanner;

public class Matrix {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // ma tran co san
        double[][] matrix1 = {
                {1.5, 2.8, 3.9},
                {4.2, 5.1, 0.7},
                {9.0, 2.3, 8.4}
        };
        // find max
        double maxValue = matrix1[0][0];
        int maxRow =0;
        int maxCol =0;

        for (int i = 0; i < matrix1.length ; i++) {
            for (int j = 0; j < matrix1[i].length; j++) {
                if (matrix1[i][j] > maxValue) {
                    maxValue = matrix1[i][j];
                    maxRow = i;
                    maxCol = j;
                }
            }

        }
        System.out.println("Ma tran co san");
        printMatrix(matrix1);
        System.out.printf("Giá trị lớn nhất: %.2f tại tọa độ (%d, %d)%n",
                maxValue, maxRow, maxCol);
        // ===== BƯỚC 2: Ma trận người dùng nhập =====
        System.out.print("\nNhập số hàng: ");
        int rows = scanner.nextInt();
        System.out.print("Nhập số cột: ");
        int cols = scanner.nextInt();

        double[][] matrix2 = new double[rows][cols];

        // Nhập giá trị cho ma trận
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                System.out.printf("Nhập phần tử [%d][%d]: ", i, j);
                matrix2[i][j] = scanner.nextDouble();
            }
        }

        // Tìm max trong matrix2
        maxValue = matrix2[0][0];
        maxRow = 0;
        maxCol = 0;

        for (int i = 0; i < matrix2.length; i++) {
            for (int j = 0; j < matrix2[i].length; j++) {
                if (matrix2[i][j] > maxValue) {
                    maxValue = matrix2[i][j];
                    maxRow = i;
                    maxCol = j;
                }
            }
        }

        System.out.println("\nMa trận vừa nhập:");
        printMatrix(matrix2);
        System.out.printf("Giá trị lớn nhất: %.2f tại tọa độ (%d, %d)%n",
                maxValue, maxRow, maxCol);

        scanner.close();
    }

    // Hàm in ma trận
    public static void printMatrix(double[][] matrix) {
        for (double[] row : matrix) {
            for (double value : row) {
                System.out.printf("%6.2f", value);
            }
            System.out.println();
        }
    }

}
