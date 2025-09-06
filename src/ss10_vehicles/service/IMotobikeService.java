package ss10_vehicles.service;

import ss10_vehicles.entity.Motobike;

import java.util.List;

public interface IMotobikeService {
    List<Motobike> findAll();
    boolean add(Motobike motobike);


    boolean delete(Motobike motobike);

    Motobike findById(int id);
    List<Motobike> findByName(String name);
}
