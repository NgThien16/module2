package case_study_1.view;

import case_study_1.entity.Magazine;
import case_study_1.util.CheckValidate;

import java.util.List;
import java.util.Scanner;

public class MagazineView {
    private static Scanner scanner = new  Scanner(System.in);
    public static void displayCustomer(List<Magazine> customerList){
        for(Magazine customer: customerList){
            if(customer != null) {
                System.out.println(customer);
            }else{
                break;
            }
        }
    }
    public static Magazine inputDataForNewCustomer() {

        String name ="";
        do {
            System.out.println("Input your name: ");
            name = scanner.nextLine();
            if (!CheckValidate.checkName(name)) {
                System.out.println(" Invalid format! Please try again. Example: Nguyen Van");
            }
        } while (!CheckValidate.checkName(name));

        String birthday = "";
        do {
            System.out.println("Input your birthday: ");
            birthday = scanner.nextLine();
            if (!CheckValidate.checkAge(birthday)) {
                System.out.println(" Invalid format! Please try again. Example: dd/MM/YYYY");
            }
        } while (!CheckValidate.checkAge(birthday));

        System.out.println("Input your gender: ");
        String gender = scanner.nextLine();


        String idNumber = "";
        do {
            System.out.println("Input your idNumber: ");
            idNumber = scanner.nextLine();
            if (!CheckValidate.checkIdNumber(idNumber)) {
                System.out.println(" Invalid format! Please try again. Example: 9-12 number");
            }
        } while (!CheckValidate.checkIdNumber(idNumber));

        String phoneNumber = "";
        do {
            System.out.println("Input your phoneNumber: ");
            phoneNumber = scanner.nextLine();
            if (!CheckValidate.checkPhoneNumber(phoneNumber)) {
                System.out.println(" Invalid format! Please try again. Example: 0XXXXXXXXX");
            }
        } while (!CheckValidate.checkPhoneNumber(phoneNumber));

        System.out.println("Input your email: ");
        String email = scanner.nextLine();

        String customerId = "";
        do {
            System.out.println("Input your employeeId (format KH-XXXX): ");
            customerId = scanner.nextLine();
            if (!CheckValidate.checkCustomerId(customerId)) {
                System.out.println(" Invalid format! Please try again. Example: NV-1234");
            }
        } while (!CheckValidate.checkCustomerId(customerId));

        System.out.println("Input customer type(normal, silver, diamond, gold): ");
        String customerType = scanner.nextLine();
        System.out.println("Input customer address: ");
        String address = scanner.nextLine();




        Magazine employee = new Magazine(name,birthday,gender,idNumber,phoneNumber,email,customerId,customerType,address);
        return employee;
    }
    public static Magazine inputDataForEditCustomer() {
        System.out.println("Enter Customer ID to edit: ");
        String customerId = scanner.nextLine();

        String name = "";
        do {
            System.out.println("Update name: ");
            name = scanner.nextLine();
            if (!CheckValidate.checkName(name)) {
                System.out.println(" Invalid format! Please try again. Example: Nguyen Van");
            }
        } while (!CheckValidate.checkName(name));

        String birthday = "";
        do {
            System.out.println("Update your birthday: ");
            birthday = scanner.nextLine();
            if (!CheckValidate.checkAge(birthday)) {
                System.out.println(" Invalid format! Please try again. Example: dd/MM/YYYY");
            }
        } while (!CheckValidate.checkAge(birthday));

        System.out.println("Update gender: ");
        String gender = scanner.nextLine();

        String idNumber = "";
        do {
            System.out.println("Update idNumber: ");
            idNumber = scanner.nextLine();
            if (!CheckValidate.checkIdNumber(idNumber)) {
                System.out.println(" Invalid format! Please try again. Example: 9-12 number");
            }
        } while (!CheckValidate.checkIdNumber(idNumber));

        String phoneNumber = "";
        do {
            System.out.println("Update phoneNumber: ");
            phoneNumber = scanner.nextLine();
            if (!CheckValidate.checkPhoneNumber(phoneNumber)) {
                System.out.println(" Invalid format! Please try again. Example: 0XXXXXXXXX");
            }
        } while (!CheckValidate.checkPhoneNumber(phoneNumber));

        System.out.println("Update email: ");
        String email = scanner.nextLine();
        System.out.println("Update  customerType: ");
        String customerType = scanner.nextLine();
        System.out.println("Update address: ");
        String address = scanner.nextLine();

        // Tạo object mới với dữ liệu đã cập nhật
        Magazine employee = new Magazine(name, birthday, gender, idNumber, phoneNumber, email, customerId,customerType,address);
        return employee;
    }
}
