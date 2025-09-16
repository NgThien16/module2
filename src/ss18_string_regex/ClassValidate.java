package ss18_string_regex;

import java.util.Scanner;

public class ClassValidate {
    public static boolean checkName(String name){
        String regexClass ="^[CAP][0-9]{4}[GHIK]$";
        return name.matches(regexClass);
    }

    public static void main(String[] args) {
        Scanner scanner= new Scanner(System.in);
        String name="";
        do {
            System.out.println("Enter the name of a class");
            name=scanner.nextLine();
         }while(!checkName(name));
        System.out.println("The name is valid");
        }
    }