package ss10_vehicles.service;

import ss10_vehicles.entity.Car;

import java.util.List;

public interface ICarService {
    List<Car> findAll();
    boolean add(Car car);
    boolean delete(String plate);
    Car findCarByPlate(String plate);
}
