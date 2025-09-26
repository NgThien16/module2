package case_study_2.service;

import java.util.List;

public interface IService <T> {
    List<T> findAll();
    boolean add(T t);
    boolean delete(String documentId);
    T findById(String documentId);
    List<T> findByName(String name);
}
