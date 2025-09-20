package case_study_1.repository;

import case_study_1.entity.Customer;
import case_study_1.entity.Employee;
import case_study_1.util.ReadAndWriteFile;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class CustomerRepository implements ICustomerRepository {
    private final String CUSTOMER_FILE ="src/case_study_1/data/customer.csv";
    @Override
    public List<Customer> findAll() {
        List<Customer> customerList = new ArrayList<>();
        try{
            List<String> stringList = ReadAndWriteFile.readFileCSV(CUSTOMER_FILE);
            String[] array = null;
            for(int i = 0; i < stringList.size(); i++){
                array = stringList.get(i).split(",");
                Customer customer = new Customer(array[0], array[1],array[2],array[3],array[4],array[5],array[6],array[7], array[8]);
                customerList.add(customer);
            }
        }catch(IOException e){
            System.out.println("Error reading file");
        }
        return customerList;
    }

    @Override
    public boolean add(Customer customer) {
        List<String> list = new ArrayList<>();
        list.add(customer.getInfoToCSV());
        try{
            ReadAndWriteFile.writeListStringToCSV(CUSTOMER_FILE, list, true);
        } catch (IOException e) {
            System.out.println("Error writing file");
            return false;
        }
        return true;
    }

    @Override
    public boolean edit(Customer customer) {
        //đọc toàn bộ danh sách khách hàng
        try {
            List<Customer> customerList = findAll();
            boolean found = false;

            for (int i = 0; i < customerList.size(); i++) {
                if (customerList.get(i).getCustomerId().equals(customer.getCustomerId())) {
                    customerList.set(i, customer);
                    found = true;
                    break;
                }
            }
            if (!found) {
                System.out.println("Employee not found");
                return false;
            }
            //ghi đè lại file CSV
            List<String> stringList = new ArrayList<>();
            for (Customer c : customerList) {
                stringList.add(c.getInfoToCSV());
            }
            ReadAndWriteFile.writeListStringToCSV(CUSTOMER_FILE, stringList, false);
            return true;
        } catch (IOException e) {
            System.out.println("Error writing file");
            return false;
        }
    }
}
