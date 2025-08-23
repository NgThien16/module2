package ss11_generic_stack_queue;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;
import java.util.Stack;

public class Palindrome {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhập chữ để kiểm tra Palindrome");
        String str = sc.nextLine();

        System.out.println("Chuỗi/"+str+"có phải Palindrome không?"+ isPalindrome(str));
    }
    public static boolean isPalindrome(String str) {
        Stack<Character> stack = new Stack<>();
        Queue<Character> queue = new LinkedList<>();
        for (char ch : str.toCharArray()) {
            stack.push(ch);
            queue.offer(ch);
        }
        while (!stack.isEmpty()) {
            if (stack.pop() != queue.poll()) {
                return false;
            }
        }
        return true;
    }
}
