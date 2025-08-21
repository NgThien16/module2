package ss8_customer.repository;

import ss8_customer.entity.Customer;

import java.util.LinkedList;
import java.util.List;



public class CustomerRepository implements ICustomerRepository{
    private static List<Customer> customers= new LinkedList<>();
    static{
        customers.add(new Customer(1, "Thien", "thien@gmail.com", "Son Tra"));
        customers.add(new Customer(2, "Quy", "quy@gmail.com", "Hai Chau"));
        customers.add(new Customer(3, "Trung", "trung@gmail.com", "Thanh Khe"));

    }
    @Override
    public List<Customer> findAll() {
        return customers;
    }

    @Override
    public boolean add(Customer customer) {
        customers.add(customer);
        return true;
    }


    @Override
    public boolean delete(Customer customer){
        for (Customer c : customers) {
            if (c.getId() == customer.getId()) {
                customers.remove(c);
                return true;
            }
        }
        return false;
    }

    @Override
    public Customer findById(int id) {
        for (Customer c : customers) {
            if (c.getId() == id) {
                return c;
            }
        }
        return null; // không tìm thấy
    }

    @Override
    public List<Customer> findByName(String name) {
        List<Customer> result = new LinkedList<>();
        for (Customer c : customers) {
            if (c.getName().toLowerCase().contains(name.toLowerCase())) {
                result.add(c);
            }
        }
        return result; // có thể rỗng nếu không tìm thấy
    }

}
