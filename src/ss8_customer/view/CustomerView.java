package ss8_customer.view;

import ss5_access_modifier.Product;
import ss8_customer.entity.Customer;

import java.util.Scanner;

public class CustomerView {
    private static Scanner scanner = new Scanner(System.in);
    public static void display(Customer[] customerList) {
        for (Customer customer : customerList) {
            if(customer != null){
                System.out.println(customer);
            }else{
                break;
            }
        }
    }
    public static Customer inputDataForNewCustomer() {
        System.out.println("Nhập id");
        int id = Integer.parseInt(scanner.nextLine());
        System.out.println("Nhập tên");
        String name = scanner.nextLine();
        System.out.println("Nhập email");
        String email = scanner.nextLine();
        System.out.println("Nhập địa chỉ");
        String address = scanner.nextLine();
        Customer customer = new Customer(id,name,email,address);
        return customer;
    }
    public  static Customer deleteCustomer() {
        System.out.println("Nhập id cần xóa");
        int id = Integer.parseInt(scanner.nextLine());
        Customer customerDelete = new Customer(id, null, null,  null);
        return customerDelete;
    }
}
