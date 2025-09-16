package ss10_vehicles.repository;

import ss10_vehicles.entity.Car;

import java.util.List;

public interface ICarRepository {
    List<Car> findAll();
    boolean add(Car car);

    boolean delete(int plate);
}
