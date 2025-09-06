package ss14_sort_althorithm;

import java.util.Arrays;

public class Insertion {
    public static void main(String[] args) {
        int[] array ={9,1,5,7,2,4,3};
        System.out.println("before insertion"+ Arrays.toString(array));
        insertionSort(array);
        System.out.println("after insertion"+ Arrays.toString(array));
    }
    public static void insertionSort(int[] list){
        int pos, x;
        for(int i = 1; i < list.length; i++){ //đoạn array[0] đã sắp xếp
            x = list[i];
            pos = i;
            while(pos > 0 && x < list[pos-1]){
                list[pos] = list[pos-1]; // đổi chỗ
                pos--;
            }
            list[pos] = x;
        }
    }
}
