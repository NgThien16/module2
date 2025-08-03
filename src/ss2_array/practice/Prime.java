package ss2_array.practice;

import java.util.Scanner;

public class Prime {
    public static void main(String[] args) {
        Scanner scanner  = new Scanner(System.in);
        System.out.println("enter a number");
        int number = Integer.parseInt(scanner.nextLine());
        if(number<2){
            System.out.println(number+ " is less than 2");
        }else{
            int i=2;
            boolean check = true;
            while(i<=Math.sqrt(number)){
                if(number%i==0){
                    check = false;
                    break;
                }
                i++;
            }
            if(check)
                System.out.println(number+" is a prime number");
            else
                System.out.println(number+" is not a prime number");
        }
    }
}
