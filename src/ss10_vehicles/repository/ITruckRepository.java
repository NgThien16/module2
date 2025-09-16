package ss10_vehicles.repository;


import ss10_vehicles.entity.Truck;

import java.util.List;

public interface ITruckRepository extends IRepository<Truck>{
 Truck findTruckByPlate(String plate);
}
