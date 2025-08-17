package ss8_customer.repository;

import ss8_customer.entity.Customer;

public interface ICustomerRepository {
    Customer[] findAll();
    boolean add(Customer customer);


    boolean delete(Customer customer);
}
