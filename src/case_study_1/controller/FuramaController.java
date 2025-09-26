package case_study_1.controller;



import java.util.Scanner;

public class FuramaController {
    public static void displayMainMenu() {
        Scanner scanner = new Scanner(System.in);
        EmployeeController employeeController = new EmployeeController();
        CustomerController customerController = new CustomerController();
        FacilityController  facilityController = new FacilityController();

        boolean flag = true;
        while (flag) {
            System.out.println("===== ỨNG DỤNG QUẢN LÝ KHU NGHỈ DƯỠNG FURAMA =====");
            System.out.println("Chọn chức năng:");
            System.out.println("1. Employee Management");
            System.out.println("2. Customer Management");
            System.out.println("3. Facility Management");
            System.out.println("4. Booking Management");
            System.out.println("5. Promotion Management");
            System.out.println("6. Exit");
            System.out.print("Nhập lựa chọn: ");

            int choice = Integer.parseInt(scanner.nextLine());
            switch (choice) {
                case 1:
                    boolean employeeFlag = true;
                    while (employeeFlag) {
                        System.out.println("---- Employee Management ----");
                        System.out.println("1. Display list employees");
                        System.out.println("2. Add new employee");
                        System.out.println("3. Edit employee");
                        System.out.println("4. Return main menu");
                        System.out.print("Input your choice: ");
                        int employeeChoice = Integer.parseInt(scanner.nextLine());
                        switch (employeeChoice) {
                            case 1:
                                employeeController.displayEmployee();
                                break;
                            case 2:
                                employeeController.addEmployee();
                                break;
                            case 3:
                                employeeController.editEmployee();
                                break;
                            case 4:
                                employeeFlag = false;
                                break;
                            default:
                                System.out.println("Your choice is incorrect.");
                        }
                    }
                    break;

                case 2:
                    boolean customerFlag = true;
                    while (customerFlag) {
                        System.out.println("----  Customer Management  ----");
                        System.out.println("1. Display list customers");
                        System.out.println("2. Add new customer");
                        System.out.println("3. Edit customer");
                        System.out.println("4. Return main menu");
                        System.out.print("Input your choice: ");
                        int displayChoice = Integer.parseInt(scanner.nextLine());
                        switch (displayChoice) {
                            case 1:
                                customerController.displayCustomer();
                                break;
                            case 2:
                                customerController.addCustomer();
                                break;
                            case 3:
                                customerController.editCustomer();
                                break;
                            case 4:
                                customerFlag = false;
                                break;
                            default:
                                System.out.println("Your choice is incorrect!");
                        }
                    }
                    break;

                case 3:
                    boolean facilityFlag = true;
                    while (facilityFlag) {
                        System.out.println("---- Facility Management ----");
                        System.out.println("1. Display list facilities");
                        System.out.println("2. Add new facility");
                        System.out.println("3. Display list facilities maintenance");
                        System.out.println("4. Return main menu");
                        System.out.print("Input your choice: ");
                        int facilityChoice = Integer.parseInt(scanner.nextLine());
                        switch (facilityChoice) {
                            case 1:
                                facilityController.displayFacility();
                                break;
                            case 2:
                                boolean facilitiesFlag = true;
                                while(facilitiesFlag) {
                                    System.out.println("----  Add new facilities  ----");
                                    System.out.println("1. Add new House");
                                    System.out.println("2. Add new Villa");
                                    System.out.println("3. Add new Room");
                                    System.out.println("4. Return facility management");
                                    int facilitiesChoice =  Integer.parseInt(scanner.nextLine());
                                    switch(facilitiesChoice) {
                                        case 1:
                                            facilityController.addHouse();
                                            break;
                                        case 2:
                                            facilityController.addVilla();
                                            break;
                                        case 3:
                                            facilityController.addRoom();
                                            break;
                                        case 4:
                                            facilitiesFlag = false;
                                            break;
                                        default:
                                            System.out.println("Your choice is incorrect!");
                                    }
                                }
                            case 3:
                                facilityController.displayMaintance();
                                break;
                            case 4:
                                facilityFlag = false;
                                break;
                            default:
                                System.out.println("Your choice is incorrect!");
                        }
                    }
                    break;

                case 4:
                    boolean bookingFlag = true;
                    while (bookingFlag) {
                        System.out.println("---- Booking Management ----");
                        System.out.println("1. Add new booking");
                        System.out.println("2. Display list bookings");
                        System.out.println("3. Create new booking");
                        System.out.println("4. Display list contact");
                        System.out.println("5. Edit contact");
                        System.out.println("6. Return main menu");
                        System.out.print("Input your choice: ");
                        int findChoice = Integer.parseInt(scanner.nextLine());
                        switch (findChoice) {
                            case 1:

                                break;
                            case 2:

                                break;
                            case 3:

                                break;
                            case 4:
                                bookingFlag = false;
                                break;
                            case 5:
                                bookingFlag = false;
                                break;
                            case 6:
                                flag = false;
                                System.out.println("Exiting...!");
                                break;
                            default:
                                System.out.println("Your choice is incorrect!");
                        }
                    }
                    break;


                case 5:
                    boolean promotionFlag = true;
                    while (promotionFlag) {
                        System.out.println("---- Promotion Management ----");
                        System.out.println("1. Display list customers use service");
                        System.out.println("2. Display list customers get voucher");
                        System.out.println("3. Return main menu");
                        System.out.print("Input your choice: ");
                        int findChoice = Integer.parseInt(scanner.nextLine());
                        switch (findChoice) {
                            case 1:

                                break;
                            case 2:

                                break;
                            case 3:
                                promotionFlag = false;
                                System.out.println("Exiting...!");
                                break;
                            default:
                                System.out.println("Your choice is incorrect!");
                        }
                    }
                case 6:
                    flag = false;
                    System.out.println("Thoát chương trình!");
                    break;

                default:
                    System.out.println("Lựa chọn không hợp lệ!");
            }
        }
    }
}
