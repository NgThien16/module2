package case_study_1.service;


import case_study_1.entity.Customer;

import java.util.List;

public interface ICustomerSevice {
    List<Customer> findAll();
    boolean add(Customer customer);
    boolean edit(Customer customer);

}
