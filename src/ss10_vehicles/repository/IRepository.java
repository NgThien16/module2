package ss10_vehicles.repository;

import java.util.List;

public interface IRepository<T> {
    List<T> findAll();
    boolean add(T t);
    boolean delete(int plate);
}
