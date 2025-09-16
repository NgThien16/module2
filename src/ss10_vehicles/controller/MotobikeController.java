package ss10_vehicles.controller;

import ss10_vehicles.entity.Car;
import ss10_vehicles.entity.Motobike;
import ss10_vehicles.service.*;
import ss10_vehicles.view.CarView;
import ss10_vehicles.view.MotobikeView;

import java.util.ArrayList;
import java.util.List;
public class MotobikeController {
    private IMotobikeService motobikeService= new MotobikeService();
    public void addMotobike() {
        System.out.println("Thêm mới");
        Motobike motobike = MotobikeView.inputDataForNewMotobike();
        boolean isAddSuccess = motobikeService.add(motobike);
        if (isAddSuccess) {
            System.out.println("Thêm mới thành công");
        } else {
            System.out.println("Thêm mới không thành công");
        }

    }


    public void displayMotobike() {
        List<Motobike> motobikeList = motobikeService.findAll();
        MotobikeView.displayMotobike(motobikeList);
    }


    public void deleteMotobike() {
        String plate=MotobikeView.deleteMotobike();
        boolean result = motobikeService.delete(plate);
        if (result) {
            System.out.println("Xóa thành công xe máy có biển số " + plate);
        } else {
            System.out.println("Không tìm thấy xe máy có biển số " + plate);
        }
    }
    public void searchMotobike() {
        String plate = MotobikeView.inputPlateForSearch();
        Motobike motobike = motobikeService.findMotobikeByPlate(plate);
        if (motobike != null) {
            System.out.println("Tìm thấy ô tô:");
            List<Motobike> list = new ArrayList<>();
            list.add(motobike);
            MotobikeView.displayMotobike(list);
        } else {
            System.out.println("Không tìm thấy xe máy có biển số " + plate);
        }
    }
}

