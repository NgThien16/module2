package ss1_java_overview;

import java.util.Scanner;

public class Convert {
    public static void main(String[] args) {
        double vnd = 23000;
        double usd ;
        Scanner sc = new Scanner(System.in);
        System.out.println("Please enter your usd");
        usd = sc.nextDouble();
        double convert = usd*vnd;
        System.out.println("Your usd is "+convert+"VND");

    }
}
