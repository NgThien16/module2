package case_study_1.controller;

import case_study_1.entity.Customer;
import case_study_1.service.CustomerService;
import case_study_1.view.CustomerView;

import java.util.List;

public class CustomerController {
    private CustomerService customerService = new CustomerService();

    public void addCustomer() {
        System.out.println("Add new customer");
        Customer customer = CustomerView.inputDataForNewCustomer();
        boolean isAddSuccess = customerService.add(customer);
        if (isAddSuccess) {
            System.out.println("successfully add employee");
        } else {
            System.out.println("not add employee");
        }

    }


    public void displayCustomer() {
        List<Customer> customerList = customerService.findAll();
        CustomerView.displayCustomer(customerList);
    }

    public void editCustomer(){
        System.out.println("Edit customer");
        Customer customer = CustomerView.inputDataForEditCustomer();
        boolean isEditSuccess = customerService.edit(customer);
        if (isEditSuccess) {
            System.out.println("successfully edit employee");
        } else {
            System.out.println("can not edit employee");
        }
    }
}
