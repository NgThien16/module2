package ss10_vehicles.repository;

import ss10_vehicles.entity.Car;
import ss10_vehicles.entity.Motobike;

public interface IMotobikeRepository extends IRepository<Motobike> {
 Motobike findMotobikeByPlate(String plate);

}
