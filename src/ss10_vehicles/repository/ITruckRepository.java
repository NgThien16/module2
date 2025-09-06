package ss10_vehicles.repository;


import ss10_vehicles.entity.Truck;

import java.util.List;

public interface ITruckRepository {
    List<Truck> findAll();
    boolean add(Truck truck);


    boolean delete(Truck truck);

    Truck findById(int plate);
    List<Truck> findByName(String name);
}
