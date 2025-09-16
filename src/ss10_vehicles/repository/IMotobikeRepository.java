package ss10_vehicles.repository;

import ss10_vehicles.entity.Motobike;

import java.util.List;

public interface IMotobikeRepository extends IRepository<Motobike> {
    List<Motobike> findAll();
    boolean add(Motobike motobike);


    boolean delete(int plate);

}
