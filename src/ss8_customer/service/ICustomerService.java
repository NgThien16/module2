package ss8_customer.service;

import ss8_customer.entity.Customer;
import java.util.List;

public interface ICustomerService {
    List<Customer> findAll();
    boolean add(Customer customer);

    boolean delete(Customer deleteCustomer);
    Customer findById(int id);                  // tìm 1 khách theo id
    List<Customer> findByName(String name);
}
