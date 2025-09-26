package case_study_1.controller;

import case_study_1.entity.Magazine;
import case_study_1.service.MagazineService;
import case_study_1.view.MagazineView;

import java.util.List;

public class CustomerController {
    private MagazineService customerService = new MagazineService();

    public void addCustomer() {
        System.out.println("Add new customer");
        Magazine customer = MagazineView.inputDataForNewCustomer();
        boolean isAddSuccess = customerService.add(customer);
        if (isAddSuccess) {
            System.out.println("successfully add employee");
        } else {
            System.out.println("not add employee");
        }

    }


    public void displayCustomer() {
        List<Magazine> customerList = customerService.findAll();
        MagazineView.displayCustomer(customerList);
    }

    public void editCustomer(){
        System.out.println("Edit customer");
        Magazine customer = MagazineView.inputDataForEditCustomer();
        boolean isEditSuccess = customerService.edit(customer);
        if (isEditSuccess) {
            System.out.println("successfully edit employee");
        } else {
            System.out.println("can not edit employee");
        }
    }
}
