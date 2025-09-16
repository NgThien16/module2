package ss10_vehicles.view;


import ss10_vehicles.entity.Truck;


import java.util.List;
import java.util.Scanner;

public class TruckView {
    private static Scanner scanner = new  Scanner(System.in);
    public static void displayTruck(List<Truck> truckList){
        for(Truck truck : truckList){
            if(truck != null) {
                System.out.println(truck);
            }else{
                break;
            }
        }
    }
    public static Truck inputDataForNewTruck() {
        System.out.println("Nhập biển kiểm soát");
        int plate = Integer.parseInt(scanner.nextLine());
        System.out.println("Nhập tên hãng xe");
        String brand = scanner.nextLine();
        System.out.println("Nhập năm sản xuất");
        int since  = Integer.parseInt(scanner.nextLine());
        System.out.println("Nhập tên chủ sở hữu");
        String owner = scanner.nextLine();
        System.out.println("Nhập trọng tải của xe(tấn)");
        int payload = Integer.parseInt(scanner.nextLine());
        Truck truck= new Truck(plate, brand, since, owner, payload);
        return truck;
    }
    public  static String deleteTruck() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Nhập biển kiểm soát xe tải cần xóa: ");
        return scanner.nextLine();
    }
//    public static int inputIdForSearch() {
//        System.out.println("Nhập id cần tìm");
//        return Integer.parseInt(scanner.nextLine());
//    }
//
//    public static String inputNameForSearch() {
//        System.out.println("Nhập tên cần tìm");
//        return scanner.nextLine();
//    }
}
