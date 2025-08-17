package ss8_customer.controller;

import ss8_customer.entity.Customer;
import ss8_customer.service.ICustomerService;
import ss8_customer.service.CustomerService;
import ss8_customer.view.CustomerView;

import java.util.Scanner;

public class CustomerController {
    public static void displayMenu() {
        ICustomerService customerService = new CustomerService();
        Scanner scanner = new Scanner(System.in);
        boolean flag = true;
        while (flag) {
            System.out.println("------------Quản lý khách hàng----------");
            System.out.println("Chức năng: " +
                    "\n 1. Danh sách" +
                    "\n 2. Thêm mới" +
                    "\n 3. Xoá" +
                    "\n 4. Tìm kiếm" +
                    "\n 5. Qua lại menu chính"
            );
            System.out.println("Chọn chức năng");
            int choice = Integer.parseInt(scanner.nextLine());
            switch (choice) {
                case 1:
                    System.out.println("Danh sách");
                    Customer[] customerList = customerService.findAll();
                    CustomerView.display(customerList);
                    break;
                case 2:
                    System.out.println("Thêm mới");
                    Customer addCustomer = CustomerView.inputDataForNewCustomer();
                    boolean isAddSuccess = customerService.add(addCustomer);
                    if (isAddSuccess) {
                        System.out.println("Thêm mới thành công");
                    } else {
                        System.out.println("Thêm mới không thành công");
                    }
                    break;
                case 3:
                    System.out.println("Xoá");
                    Customer deleteCustomer = CustomerView.deleteCustomer();
                    boolean isDeleteSuccess = customerService.delete(deleteCustomer);
                    if (isDeleteSuccess) {
                        System.out.println("Xóa thành công");
                    } else {
                        System.out.println("Xóa không thành công");
                    }
                    break;
                case 4:
                    System.out.println("Tìm kiếm");
                    // code mở rộng ở đây
                    break;
                default:
                    System.out.println("Đã kết thúc chương trình");
                    flag = false;
                    break;
            }
        }
    }
}
