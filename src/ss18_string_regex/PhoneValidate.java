package ss18_string_regex;

import java.util.Scanner;

public class PhoneValidate {
    public static boolean checkPhoneNumber(String phoneNumber){
        String regexPhoneNumber ="^[0-9]{2}[-][0-9]{10}$";
        return phoneNumber.matches(regexPhoneNumber);
    }

    public static void main(String[] args) {
        Scanner scanner= new Scanner(System.in);
        String phoneNumber= "";
        do {
            System.out.println("Enter the phone number");
            phoneNumber=scanner.nextLine();
        }while(!checkPhoneNumber(phoneNumber));
        System.out.println("The phone number is valid");
    }
}

