package case_study_2.repository;

import java.util.List;

public interface IRepository <T>{
    List<T> findAll();
    boolean add(T t);
    boolean delete(String documentId);
    T findById(String documentId);
    List<T> findByName(String name);

}
