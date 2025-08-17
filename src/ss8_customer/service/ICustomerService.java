package ss8_customer.service;

import ss8_customer.entity.Customer;

public interface ICustomerService {
    Customer[] findAll();
    boolean add(Customer customer);

    boolean delete(Customer deleteCustomer);
}
