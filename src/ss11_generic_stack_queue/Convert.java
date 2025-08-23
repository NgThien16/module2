package ss11_generic_stack_queue;

import java.util.Scanner;
import java.util.Stack;

public class Convert {
    public static void main(String[] args) {
        Stack<Integer> stack = new Stack<>();
        Scanner scanner  = new Scanner(System.in);
        System.out.println("Nhập số nguyên n để chuyển sang số nhị phân");
        int n = scanner.nextInt();

        while(n>0){
            stack.push(n%2);
            n=n/2;
        }

        while(!stack.isEmpty()){
            System.out.println(stack.pop());
        }
    }
}
