package case_study_1.repository;

import java.util.List;

public interface IRepository <T>{
    List<T> findAll();
    boolean add(T t);
    boolean edit(T t);

}
