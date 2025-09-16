package ss10_vehicles.repository;

import ss10_vehicles.entity.Car;

import java.util.List;

public interface ICarRepository extends IRepository<Car> {
Car findCarByPlate(String plate);

}
