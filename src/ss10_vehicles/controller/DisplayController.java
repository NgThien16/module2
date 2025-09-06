package ss10_vehicles.controller;

import ss10_vehicles.entity.Car;
import ss10_vehicles.entity.Motobike;
import ss10_vehicles.entity.Truck;
import ss10_vehicles.service.*;
import ss10_vehicles.view.CarView;
import ss10_vehicles.view.MotobikeView;
import ss10_vehicles.view.TruckView;


import java.util.List;
import java.util.Scanner;

public class DisplayController {
    public static void displayMenu() {
        IMotobikeService motobikeService = new MotobikeService();
        ICarService carService = new CarService();
        ITruckService truckService = new TruckService();
        Scanner scanner = new Scanner(System.in);
        boolean flag = true;
        while (flag) {
            System.out.println("------------Hiển thị phương tiện----------");
            System.out.println("Chức năng: " +
                    "\n 1. Hiển thị xe tải" +
                    "\n 2. Hiển thị oto" +
                    "\n 3. Hiển thị xe máy" +
                    "\n 4. Qua lại menu chính"
            );
            System.out.println("Chọn chức năng");
            int choice = Integer.parseInt(scanner.nextLine());
            switch (choice) {
                case 1:
                    System.out.println("Hiển thị xe tải");
                    List<Truck> truckList = truckService.findAll();
                    TruckView.displayTruck(truckList);
                    break;

                case 2:
                    System.out.println("Hiển thị oto");
                    List<Car> carList = carService.findAll();
                    CarView.displayCar(carList);
                    break;

                case 3:
                    System.out.println("Hiển thị xe máy");
                    List<Motobike> motobkieList = motobikeService.findAll();
                    MotobikeView.displayMotobike(motobkieList);
                    break;
                default:
                    System.out.println("Đã kết thúc chương trình");
                    flag = false;
                    break;
            }
        }
    }
}
