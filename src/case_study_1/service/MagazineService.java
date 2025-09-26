package case_study_1.service;


import case_study_1.entity.Magazine;
import case_study_1.repository.CustomerRepository;

import java.util.List;

public class MagazineService implements ICustomerSevice {
    CustomerRepository customerRepository = new CustomerRepository();
    @Override
    public List<Magazine> findAll() {
        return customerRepository.findAll();
    }

    @Override
    public boolean add(Magazine customer) {
        return customerRepository.add(customer);
    }

    @Override
    public boolean edit(Magazine customer) {
        return customerRepository.edit(customer);
    }
}
