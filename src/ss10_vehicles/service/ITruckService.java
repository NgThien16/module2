package ss10_vehicles.service;

import ss10_vehicles.entity.Truck;

import java.util.List;

public interface ITruckService {
    List<Truck> findAll();
    boolean add(Truck truck);


    boolean delete(Truck truck);

    Truck findById(int plate);
    List<Truck> findByName(String name);
}
