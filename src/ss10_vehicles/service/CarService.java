package ss10_vehicles.service;

import ss10_vehicles.entity.Car;

import ss10_vehicles.repository.ICarRepository;
import ss10_vehicles.repository.CarRepository;
import ss12_product.entity.Product;

import java.util.List;

public class CarService implements ICarService {
    private ICarRepository carRepository= new CarRepository();
    @Override
    public List<Car> findAll() {
        return carRepository.findAll();
    }

    @Override
    public boolean add(Car car) {
        return carRepository.add(car);
    }

    @Override
    public boolean delete(Car car) {
        return carRepository.delete(car);
    }

    @Override
    public Car findById(int id) {
        return carRepository.findById(id);
    }

    @Override
    public List<Car> findByName(String name) {
        return carRepository.findByName(name);
    }
}
