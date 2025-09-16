package ss10_vehicles.service;

import ss10_vehicles.entity.Car;

import ss10_vehicles.repository.ICarRepository;
import ss10_vehicles.repository.CarRepository;

import java.util.List;

public class CarService implements ICarService {
    private static ICarRepository carRepository= new CarRepository();
    @Override
    public List<Car> findAll() {
        return carRepository.findAll();
    }

    @Override
    public boolean add(Car car) {
        return carRepository.add(car);
    }

    @Override
    public boolean delete(String plate) {
        return carRepository.delete(plate);
    }

    @Override
    public Car findCarByPlate(String plate) {
        return carRepository.findCarByPlate(plate);
    }
}
