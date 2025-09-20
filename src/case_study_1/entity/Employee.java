package case_study_1.entity;

import java.time.LocalDate;

public class Employee extends Person {
    private String employeeId;
    private String degree;
    private String role;
    private String salary;
    public Employee() {

    }

    public Employee(String name, String birthday, String gender, String idNumber, String phoneNumber, String email, String salary, String role, String degree, String employeeId) {
        super(name, birthday, gender, idNumber, phoneNumber, email);
        this.salary = salary;
        this.role = role;
        this.degree = degree;
        this.employeeId = employeeId;
    }

    public String getEmployeeId() {
        return employeeId;
    }

    public void setEmployeeId(String employeeId) {
        this.employeeId = employeeId;
    }

    public String getDegree() {
        return degree;
    }

    public void setDegree(String degree) {
        this.degree = degree;
    }

    public String getRole() {
        return role;
    }

    public void setRole(String role) {
        this.role = role;
    }

    public String getSalary() {
        return salary;
    }

    public void setSalary(String salary) {
        this.salary = salary;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "employeeId='" + employeeId + '\'' + super.toString() + '\'' +
                ", degree='" + degree + '\'' +
                ", role='" + role + '\'' +
                ", salary=" + salary +
                '}';
    }
    @Override
    public String getInfoToCSV() {
        return this.getName()+","+this.getBirthday()+","+this.getGender()+","+this.getIdNumber()+","+this.getPhoneNumber()+","+this.getEmail()+","+this.getSalary()+","+this.getRole()+","+this.getDegree()+","+this.getEmployeeId();
    }

}
