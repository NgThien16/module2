package case_study_1.controller;




import case_study_1.entity.Employee;
import case_study_1.service.EmployeeService;
import case_study_1.service.IEmployeeService;
import case_study_1.view.EmployeeView;

import java.util.ArrayList;
import java.util.List;

public class EmployeeController {
    private IEmployeeService employeeService = new EmployeeService();


        public void addEmployee() {
            System.out.println("Add new employee");
            Employee employee = EmployeeView.inputDataForNewEmployee();
            boolean isAddSuccess = employeeService.add(employee);
            if (isAddSuccess) {
                System.out.println("successfully add employee");
            } else {
                System.out.println("not add employee");
            }

        }


        public void displayEmployee() {
            List<Employee> employeeList = employeeService.findAll();
            EmployeeView.displayEmployee(employeeList);
        }

        public void editEmployee(){
            System.out.println("Edit employee");
            Employee employee = EmployeeView.inputDataForEditEmployee();
            boolean isEditSuccess = employeeService.edit(employee);
            if (isEditSuccess) {
                System.out.println("successfully edit employee");
            } else {
                System.out.println("can not edit employee");
            }
        }

    }