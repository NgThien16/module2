package case_study_1.service;

import case_study_1.entity.Employee;
import case_study_1.repository.EmployeeRepository;

import java.util.List;

public class EmployeeService implements IEmployeeService {
    EmployeeRepository employeeRepository = new EmployeeRepository();
    @Override
    public List<Employee> findAll() {
       return employeeRepository.findAll();
    }

    @Override
    public boolean add(Employee employee) {
        return employeeRepository.add(employee);
    }

    @Override
    public boolean edit(Employee employee) {
        return employeeRepository.edit(employee);
    }
}
