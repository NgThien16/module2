package ss10_vehicles.controller;

import ss10_vehicles.entity.Car;
import ss10_vehicles.entity.Motobike;
import ss10_vehicles.entity.Truck;
import ss10_vehicles.service.*;
import ss10_vehicles.view.CarView;
import ss10_vehicles.view.MotobikeView;
import ss10_vehicles.view.TruckView;


import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class TruckController {
    TruckService  truckService = new TruckService();
    public void addTruck() {
        System.out.println("Thêm mới");
        Truck truck = TruckView.inputDataForNewTruck();
        boolean isAddSuccess = truckService.add(truck);
        if (isAddSuccess) {
            System.out.println("Thêm mới thành công");
        } else {
            System.out.println("Thêm mới không thành công");
        }

    }


    public void displayTruck() {
        List<Truck> truckList = truckService.findAll();
        TruckView.displayTruck(truckList);
    }


    public void deleteTruck() {
        String plate= TruckView.deleteTruck();
        boolean result = truckService.delete(plate);
        if (result) {
            System.out.println("Xóa thành công ô tô có biển số " + plate);
        } else {
            System.out.println("Không tìm thấy ô tô có biển số " + plate);
        }
    }
    public void searchTruck() {
        String plate = TruckView.inputPlateForSearch();
        Truck truck = truckService.findTruckByPlate(plate);
        if (truck != null) {
            System.out.println("Tìm thấy ô tô:");
            List<Truck> list = new ArrayList<>();
            list.add(truck);
            TruckView.displayTruck(list);
        } else {
            System.out.println("Không tìm thấy xe tải có biển số " + plate);
        }

    }
}
