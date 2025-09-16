package ss8_mvc.repository;

import java.util.List;

public interface IRepository<T> {
    List<T> findAll();
    boolean add(T t);
    boolean deleteById(int id);
}
