package ss2_array.exercise;

import java.util.Scanner;

public class Prime20 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Please enter the number ");
        int num = input.nextInt();
        int count = 0;
        int n =2;
        while (count<num) {
            boolean isPrime = true;

            if(num<2) {
                isPrime = false;
            }else{
                for (int i = 2; i <= Math.sqrt(n) ; i++) {
                    if(n%i==0){
                        isPrime = false;
                        break;
                    }

                }
            }
            if(isPrime){

                System.out.println(n+"");
                count++;
            }
            n++;
        }

    }
}
