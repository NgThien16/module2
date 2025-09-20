package case_study_1.service;

import case_study_1.entity.Employee;

import java.util.List;

public interface IEmployeeService {
    List<Employee> findAll();
    boolean add(Employee employee);
    boolean edit(Employee employee);
}
