package ss10_vehicles.repository;


import ss10_vehicles.entity.Truck;

import java.util.List;

public interface ITruckRepository extends IRepository<Truck>{
    List<Truck> findAll();
    boolean add(Truck truck);


    boolean delete(int plate);
}
