package ss8_customer.repository;

import ss8_customer.entity.Customer;
import java.util.List;

public interface ICustomerRepository {
    List<Customer> findAll();
    boolean add(Customer customer);


    boolean delete(Customer customer);

    Customer findById(int id);                  // tìm 1 khách theo id
    List<Customer> findByName(String name);
}
