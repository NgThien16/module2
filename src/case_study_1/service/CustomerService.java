package case_study_1.service;


import case_study_1.entity.Customer;
import case_study_1.repository.CustomerRepository;

import java.util.List;

public class CustomerService implements ICustomerSevice {
    CustomerRepository customerRepository = new CustomerRepository();
    @Override
    public List<Customer> findAll() {
        return customerRepository.findAll();
    }

    @Override
    public boolean add(Customer customer) {
        return customerRepository.add(customer);
    }

    @Override
    public boolean edit(Customer customer) {
        return customerRepository.edit(customer);
    }
}
