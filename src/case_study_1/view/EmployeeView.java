package case_study_1.view;

import case_study_1.entity.Employee;
import case_study_1.util.CheckValidate;
import ss10_vehicles.entity.Car;

import java.util.List;
import java.util.Scanner;

public class EmployeeView {
    private static Scanner scanner = new  Scanner(System.in);
    public static void displayEmployee(List<Employee> employeeList){
        for(Employee employee: employeeList){
            if(employee != null) {
                System.out.println(employee);
            }else{
                break;
            }
        }
    }
    public static Employee inputDataForNewEmployee() {

        String name ="";
        do {
            System.out.println("Input your name: ");
            name = scanner.nextLine();
            if (!CheckValidate.checkName(name)) {
                System.out.println(" Invalid format! Please try again. Example: Nguyen Van");
            }
        } while (!CheckValidate.checkName(name));

        System.out.println("Input your birthday: ");
        String birthday = scanner.nextLine();
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

        String salary = "";
        do {
            System.out.println("Input your salary: ");
            salary = scanner.nextLine();
            if (!CheckValidate.checkSalary(salary)) {
                System.out.println(" Invalid format! Please try again. More than 0");
            }
        } while (!CheckValidate.checkSalary(salary));

        System.out.println("Input your role: ");
        String role = scanner.nextLine();
        System.out.println("Input your degree: ");
        String degree = scanner.nextLine();
        String employeeId = "";
        do {
            System.out.println("Input your employeeId (format NV-XXXX): ");
            employeeId = scanner.nextLine();
            if (!CheckValidate.checkEmployeeId(employeeId)) {
                System.out.println(" Invalid format! Please try again. Example: NV-1234");
            }
        } while (!CheckValidate.checkEmployeeId(employeeId));



        Employee employee = new Employee(name,birthday,gender,idNumber,phoneNumber,email,salary,role,degree,employeeId);
        return employee;
    }
    public static Employee inputDataForEditEmployee() {
        System.out.println("Enter Employee ID to edit: ");
        String employeeId = scanner.nextLine();

        String name = "";
        do {
            System.out.println("Update name: ");
            name = scanner.nextLine();
            if (!CheckValidate.checkName(name)) {
                System.out.println(" Invalid format! Please try again. Example: Nguyen Van");
            }
        } while (!CheckValidate.checkName(name));

        System.out.println("Update birthday: ");
        String birthday = scanner.nextLine();

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

        String salary = "";
        do {
            System.out.println("Update salary: ");
            salary = scanner.nextLine();
            if (!CheckValidate.checkSalary(salary)) {
                System.out.println(" Invalid format! Please try again. More than 0");
            }
        } while (!CheckValidate.checkSalary(salary));

        System.out.println("Update role: ");
        String role = scanner.nextLine();

        System.out.println("Update degree: ");
        String degree = scanner.nextLine();

        // Tạo object mới với dữ liệu đã cập nhật
        Employee employee = new Employee(name, birthday, gender, idNumber, phoneNumber, email, salary, role, degree, employeeId);
        return employee;
    }



}
