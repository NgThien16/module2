package ss2_array.practice;

import java.util.Scanner;

public class Interest {
    public static void main(String[] args) {
        // khai báo 3 biến
        double money =1.0;
        int month =1;
        double interestRate =1.0;
        // nhập dữ liệu cho 3 biến
        Scanner input = new Scanner(System.in);
        //nhập số tiền gửi
        System.out.println("Enter investment amount: ");
        money = Double.parseDouble(input.next());
        // nhập số tháng gửi
        System.out.println("Enter number of month: ");
        month = Integer.parseInt(input.next());
        // nhập lãi suất
        System.out.println("Enter annual interest rate in percent");
        interestRate = Double.parseDouble(input.next());
        // Tính lãi suất nhận được
        double totalInterest =0;
        for (int i = 0; i < month; i++) {
            totalInterest += money*(interestRate/100)/12*month;
        }
        System.out.println("The total interest is "+totalInterest);
    }
}
