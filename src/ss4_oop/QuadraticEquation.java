package ss4_oop;

import java.util.Scanner;

public class QuadraticEquation {
    double a;
    double b;
    double c;

    public QuadraticEquation(double a, double b, double c){
        this.a = a;
        this.b = b;
        this.c = c;
    }

    public double getA() {
        return a;
    }

    public double getB() {
        return b;
    }

    public void setA(double a) {
        this.a = a;
    }

    public void setC(double c) {
        this.c = c;
    }

    public void setB(double b) {
        this.b = b;
    }

    public double getC() {
        return c;
    }
    public double getDiscirminant(){
        return b*b - 4*a*c;
    }
    public double getRoot1(){
        return  (-b +Math.sqrt(b*b - 4*a*c))/(2*a);
    }
    public double getRoot2(){
        return (-b -Math.sqrt(b*b - 4*a*c))/(2*a);
    }
    public void solve(){
        double delta = getDiscirminant();
        if(delta > 0){
            System.out.println("Phương trình có 2 nghiệm là " + getRoot1() + "," + getRoot2());

        }else if(delta == 0){
            System.out.println("Phương trình có 2 nghiệm bằng nhau"+getRoot1());
        }else{
            System.out.println("Phương trình vô nghiệm");
        }
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Please enter  a");
        double a = input.nextDouble();
        System.out.println("Please enter  b");
        double b = input.nextDouble();
        System.out.println("Please enter  c");
        double c = input.nextDouble();

        QuadraticEquation eq = new QuadraticEquation(a, b, c);
        eq.solve();



    }
}
