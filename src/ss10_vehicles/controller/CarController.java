package ss10_vehicles.controller;

import ss10_vehicles.entity.Car;

import ss10_vehicles.service.CarService;
import ss10_vehicles.service.ICarService;
import ss10_vehicles.view.CarView;


import java.util.List;


public class CarController {
    private ICarService carService = new CarService();


    public void addCar() {
        System.out.println("Thêm mới");
        Car car = CarView.inputDataForNewCar();
        boolean isAddSuccess = carService.add(car);
        if (isAddSuccess) {
            System.out.println("Thêm mới thành công");
        } else {
            System.out.println("Thêm mới không thành công");
        }

    }


    public void displayCar() {
        List<Car> otoList = carService.findAll();
        CarView.displayCar(otoList);
    }


    public void deleteCar() {
        int plate= Integer.parseInt(CarView.deleteCar());
        boolean result = carService.delete(plate);
        if (result) {
            System.out.println("Xóa thành công ô tô có biển số " + plate);
        } else {
            System.out.println("Không tìm thấy ô tô có biển số " + plate);
        }
    }
    public void searchCar() {
//        int plate = CarView.searchCar();
//        Car car = carService.findByBienKiemSoat(plate);
//        if (car != null) {
//            System.out.println("Tìm thấy ô tô:");
//            List<Oto> list = new ArrayList<>();
//            list.add(oto);
//            OtoView.displayList(list);
//        } else {
//            System.out.println("Không tìm thấy ô tô có biển số " + plate);
//        }
    }

}
