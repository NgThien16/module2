package ss10_vehicles.view;

import ss10_vehicles.entity.Car;
import ss12_product.entity.Product;

import java.util.List;
import java.util.Scanner;

public class CarView {
    private static Scanner scanner = new  Scanner(System.in);
    public static void displayCar(List<Car> carList){
        for(Car car : carList){
            if(car != null) {
                System.out.println(car);
            }else{
                break;
            }
        }
    }
    public static Car inputDataForNewCar() {
        System.out.println("Nhập biển kiểm soát");
        int plate = Integer.parseInt(scanner.nextLine());
        System.out.println("Nhập tên hãng xe");
        String brand = scanner.nextLine();
        System.out.println("Nhập năm sản xuất");
        int since  = Integer.parseInt(scanner.nextLine());
        System.out.println("Nhập tên chủ sở hữu");
        String owner = scanner.nextLine();
        System.out.println("Nhập số chỗ ngồi");
        int seats = Integer.parseInt(scanner.nextLine());
        System.out.println("Nhập loại xe");
        String type = scanner.nextLine();
        Car car= new Car(plate, brand, since, owner, seats, type);
        return car;
    }
    public  static Car deleteCar() {
        System.out.println("Nhập biển kiểm soát cần xóa");
        int plate = Integer.parseInt(scanner.nextLine());
        Car carDelete = new Car(plate, null, 0, null, 0, null);
        return carDelete;
    }
    public static int inputIdForSearch() {
        System.out.println("Nhập id cần tìm");
        return Integer.parseInt(scanner.nextLine());
    }

    public static String inputNameForSearch() {
        System.out.println("Nhập tên cần tìm");
        return scanner.nextLine();
    }
}
