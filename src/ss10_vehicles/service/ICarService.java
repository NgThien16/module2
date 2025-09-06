package ss10_vehicles.service;

import ss10_vehicles.entity.Car;
import ss12_product.entity.Product;

import java.util.List;

public interface ICarService {
    List<Car> findAll();
    boolean add(Car car);


    boolean delete(Car car);

    Car findById(int id);
    List<Car> findByName(String name);
}
