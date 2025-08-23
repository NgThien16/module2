package ss10_vehicles.controller;



import java.util.Scanner;

public class MainController {
    public static void displayMenu() {
        Scanner scanner = new Scanner(System.in);
        boolean flag = true;
        while (flag) {
            System.out.println("------------Quản lý phương tiện giao thông----------");
            System.out.println("Chức năng: " +
                    "\n 1. Thêm mới phương tiện" +
                    "\n 2. Hiển thị phương tiện" +
                    "\n 3. Xoá phương tiện" +
                    "\n 4. Tìm kiếm" +
                    "\n 5. Qua lại menu chính"
            );
            System.out.println("Chọn chức năng");
            int choice = Integer.parseInt(scanner.nextLine());
            switch (choice) {
                case 1:
                    System.out.println("Thêm mới phương tiện");


                case 2:
                    System.out.println("Hiển thị phương tiện");

                case 3:
                    System.out.println("Xóa");
                    // code mở rộng ở đây
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
