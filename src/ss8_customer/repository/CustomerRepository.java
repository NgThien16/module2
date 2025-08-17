package ss8_customer.repository;

import ss8_customer.entity.Customer;



public class CustomerRepository implements ICustomerRepository{
    private static Customer[] customers= new Customer[100];
    static{
        customers[0]=new Customer(1, "Thien", "thien@gmail.com", "Son Tra");
        customers[1]=new Customer(2, "Quy", "quy@gmail.com", "Hai Chau");
        customers[2]=new Customer(3, "Trung", "trung@gmail.com", "Thanh Khe");

    }
    @Override
    public Customer[] findAll() {
        return customers;
    }

    @Override
    public boolean add(Customer customer) {
        for (int i=0;i<customers.length;i++){
            if(customers[i]==null){
                customers[i]=customer;
                break;
            }
        }
        return true;
    }


    @Override
    public boolean delete(Customer customer){
        for(int i = 0; i < customers.length; i++){
            if(customers[i] != customer&& customers[i].getId() ==customer.getId()){
                customers[i] = null;
                break;
            }
        }
        return false;
    }
}
