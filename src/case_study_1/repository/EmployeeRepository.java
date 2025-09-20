package case_study_1.repository;

import case_study_1.entity.Employee;
import case_study_1.util.ReadAndWriteFile;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class EmployeeRepository implements IEmployeeRepository {
    private final String EMPLOYEE_FILE = "src/case_study_1/data/employee.csv";

    @Override
    public List<Employee> findAll() {
        List<Employee> employeeList = new ArrayList<>();
        try {
            List<String> stringList = ReadAndWriteFile.readFileCSV(EMPLOYEE_FILE);
            String[] array = null;
            for (int i = 0; i < stringList.size(); i++) {
                array = stringList.get(i).split(",");
                Employee employee = new Employee(array[0], array[1],array[2],array[3],array[4],array[5],array[6],array[7], array[8],array[9]);
                employeeList.add(employee);
            }
        } catch (IOException e) {
            System.out.println("Error reading file");
        }
        return employeeList;
    }

    @Override
    public boolean add(Employee employee) {
        List<String> list = new ArrayList<>();
        list.add(employee.getInfoToCSV());
        try {
            ReadAndWriteFile.writeListStringToCSV(EMPLOYEE_FILE, list, true);

        } catch (IOException e) {
            System.out.println("Error writing file");
            return false;
        }
        return true;
    }

    @Override
    public boolean edit(Employee employee) {
        //đọc toàn bộ danh sách nhân viên
        try {
            List<Employee> employeeList = findAll();
            boolean found = false;
            // Tìm nhân viên sửa theo id
            for (int i = 0; i < employeeList.size(); i++) {
                if (employeeList.get(i).getEmployeeId().equals(employee.getEmployeeId())) {
                    employeeList.set(i, employee);
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
            for (Employee e : employeeList) {
                stringList.add(e.getInfoToCSV());
            }
            ReadAndWriteFile.writeListStringToCSV(EMPLOYEE_FILE, stringList, false);
            return true;
        } catch (IOException e) {
            System.out.println("Error writing file");
            return false;
        }
    }
}
