package ss11_generic_stack_queue;

import java.util.Stack;

public class Reverse {
    public static void main(String[] args) {
        //khởi tạo stack rỗng có kiểu số
        int[] a= {1,2,3,4,5};
        Stack<Integer> stack = new Stack<>();

        // đưa các phần tử của mảng vào stack
        for (int i = 0; i <a.length ; i++) {
            stack.push(a[i]);

        }
        // lấy các phần từ của stack từ stack ra và đưa trở về lại mảng
        for (int i = 0; i <a.length ; i++) {
            a[i]=stack.pop();
        }
        // kêt thúc và in mảng
        System.out.println("Mảng sau khi đảo ngược: ");
        for(int x:a){
            System.out.print(x+" ");
        }
    }
}
