package case_study_1.service;


import case_study_1.entity.Magazine;

import java.util.List;

public interface ICustomerSevice {
    List<Magazine> findAll();
    boolean add(Magazine customer);
    boolean edit(Magazine customer);

}
