package ss8_customer.service;

import ss8_customer.entity.Customer;
import ss8_customer.repository.CustomerRepository;
import ss8_customer.repository.ICustomerRepository;

public class CustomerService implements ICustomerService {
    private ICustomerRepository customerRepository = new CustomerRepository();

    @Override
    public Customer[] findAll() {
        return customerRepository.findAll();
    }

    @Override
    public boolean add(Customer customer) {
        return customerRepository.add(customer);
    }

    @Override
    public boolean delete(Customer deleteCustomer) {
        return customerRepository.delete(deleteCustomer);
    }
}