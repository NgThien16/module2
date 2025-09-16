package ss10_vehicles.service;

import ss10_vehicles.entity.Motobike;
import ss10_vehicles.repository.IRepository;

import java.util.List;

public interface IMotobikeService  {
    List<Motobike> findAll();
    boolean add(Motobike motobike);
    boolean delete(String plate);
    Motobike findMotobikeByPlate(String plate);


}
