package ss10_vehicles.repository;

import ss10_vehicles.entity.Car;

import java.util.List;

public interface IRepository<T> {
    List<T> findAll();
    boolean add(T t);
    boolean delete(String plate);

}
