package ss14_sort_althorithm;

import java.util.Arrays;

public class Insection {
    public static void main(String[] args) {
        int [] array={3,8,7,1,2,12};
        System.out.println("Mảng trước khi sắp xếp là"+Arrays.toString(array));
        insertionSort(array);
        System.out.println("Mảng sau khi sắp xếp là" + Arrays.toString(array));
    }
    public static void insertionSort(int[] array){
        int pos, x;
        for (int i = 1; i < array.length; i++) { // bắt đầu từ phần tử thứ 2
            x = array[i];
            pos = i;

            System.out.println("\nBước " + i + ": Chèn " + x);

            while (pos > 0 && x < array[pos - 1]) {
                array[pos] = array[pos - 1]; // dịch chuyển
                pos--;
            }
            array[pos] = x;

            // In mảng sau mỗi lần chèn
            System.out.println("Trạng thái mảng: " + Arrays.toString(array));
        }
    }
}
