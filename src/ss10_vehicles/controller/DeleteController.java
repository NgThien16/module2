package ss10_vehicles.controller;

import ss10_vehicles.entity.Car;
import ss10_vehicles.entity.Motobike;
import ss10_vehicles.entity.Truck;
import ss10_vehicles.service.*;
import ss10_vehicles.view.CarView;
import ss10_vehicles.view.MotobikeView;
import ss10_vehicles.view.TruckView;

import java.util.Scanner;

public class DeleteController {
    public static void displayMenu() {
        IMotobikeService motobikeService = new MotobikeService();
        ICarService carService = new CarService();
        ITruckService truckService = new TruckService();
        Scanner scanner = new Scanner(System.in);
        boolean flag = true;
        while (flag) {
            System.out.println("------------Xóa phương tiện----------");
            System.out.println("Chức năng: " +
                    "\n 1. Xóa xe tải" +
                    "\n 2. Xóa xe oto" +
                    "\n 3. Xóa xe máy" +
                    "\n 4. Qua lại menu chính"
            );
            System.out.println("Chọn chức năng");
            int choice = Integer.parseInt(scanner.nextLine());
            switch (choice) {
                case 1:
                    System.out.println("Xóa xe tải");
                    Truck deleteTruck = TruckView.deleteTruck();
                    boolean isDeleteSuccessTruck = truckService.delete(deleteTruck);
                    if (isDeleteSuccessTruck) {
                        System.out.println("Xóa thành công");
                    } else {
                        System.out.println("Xóa không thành công");
                    }
                    break;

                case 2:
                    System.out.println("Xóa xe oto");
                    Car deleteCar = CarView.deleteCar();
                    boolean isDeleteSuccessCar = carService.delete(deleteCar);
                    if (isDeleteSuccessCar) {
                        System.out.println("Xóa thành công");
                    } else {
                        System.out.println("Xóa không thành công");
                    }
                    break;

                case 3:
                    System.out.println("Xóa xe máy");
                    Motobike deleteMotobike = MotobikeView.deleteMotobike();
                    boolean isDeleteSuccessMotobike = motobikeService.delete(deleteMotobike);
                    if (isDeleteSuccessMotobike) {
                        System.out.println("Xóa thành công");
                    } else {
                        System.out.println("Xóa không thành công");
                    }
                    break;
                default:
                    System.out.println("Đã kết thúc chương trình");
                    flag = false;
                    break;
            }
        }
    }
}
