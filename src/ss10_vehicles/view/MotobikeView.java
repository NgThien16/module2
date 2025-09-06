package ss10_vehicles.view;


import ss10_vehicles.entity.Motobike;

import java.util.List;
import java.util.Scanner;

public class MotobikeView {
    private static Scanner scanner = new  Scanner(System.in);
    public static void displayMotobike(List<Motobike> motobikeList){
        for(Motobike motobike : motobikeList){
            if(motobike != null) {
                System.out.println(motobike);
            }else{
                break;
            }
        }
    }
    public static Motobike inputDataForNewMotobike() {
        System.out.println("Nhập biển kiểm soát");
        int plate = Integer.parseInt(scanner.nextLine());
        System.out.println("Nhập tên hãng xe");
        String brand = scanner.nextLine();
        System.out.println("Nhập năm sản xuất");
        int since  = Integer.parseInt(scanner.nextLine());
        System.out.println("Nhập tên chủ sở hữu");
        String owner = scanner.nextLine();
        System.out.println("Nhập công suất của xe(mã lực)");
        int power= Integer.parseInt(scanner.nextLine());
        Motobike motobike= new Motobike(plate, brand, since, owner, power);
        return motobike;
    }
    public  static Motobike deleteMotobike() {
        System.out.println("Nhập biển kiểm soát cần xóa");
        int plate = Integer.parseInt(scanner.nextLine());
        Motobike motobikeDelete = new Motobike(plate, null, 0, null, 0);
        return motobikeDelete;
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
