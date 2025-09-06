package ss10_vehicles.controller;

import ss10_vehicles.entity.Car;
import ss10_vehicles.entity.Motobike;
import ss10_vehicles.entity.Truck;
import ss10_vehicles.service.*;
import ss10_vehicles.view.CarView;
import ss10_vehicles.view.MotobikeView;
import ss10_vehicles.view.TruckView;

import java.util.Scanner;

public class AddController {
    public static void displayMenu() {
        IMotobikeService motobikeService = new MotobikeService();
        ICarService carService = new CarService();
        ITruckService truckService = new TruckService();
        Scanner scanner = new Scanner(System.in);
        boolean flag = true;
        while (flag) {
            System.out.println("------------Thêm mới phương tiện----------");
            System.out.println("Chức năng: " +
                    "\n 1. Thêm xe tải" +
                    "\n 2. Thêm oto" +
                    "\n 3. Thêm xe máy" +
                    "\n 4. Qua lại menu chính"
            );
            System.out.println("Chọn chức năng");
            int choice = Integer.parseInt(scanner.nextLine());
            switch (choice) {
                case 1:
                    System.out.println("Thêm mới xe tải");
                    Truck addTruck = TruckView.inputDataForNewTruck();
                    boolean isAddSuccessTruck = truckService.add(addTruck);
                    if (isAddSuccessTruck) {
                        System.out.println("Thêm mới thành công");
                    } else {
                        System.out.println("Thêm mới không thành công");
                    }
                    break;

                case 2:
                    System.out.println("Thêm mới oto");
                    Car addCar = CarView.inputDataForNewCar();
                    boolean isAddSuccessCar = carService.add(addCar);
                    if (isAddSuccessCar) {
                        System.out.println("Thêm mới thành công");
                    } else {
                        System.out.println("Thêm mới không thành công");
                    }
                    break;

                case 3:
                    System.out.println("Thêm mới xe máy");
                    Motobike addMotobike = MotobikeView.inputDataForNewMotobike();
                    boolean isAddSuccessMotobike = motobikeService.add(addMotobike);
                    if (isAddSuccessMotobike) {
                        System.out.println("Thêm mới thành công");
                    } else {
                        System.out.println("Thêm mới không thành công");
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
