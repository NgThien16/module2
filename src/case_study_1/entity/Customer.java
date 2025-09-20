package case_study_1.entity;


public class Customer extends Person {
    private String customerId;
    private String customerType;
    private String address;

    public Customer() {}

    public Customer(String name, String birthday, String gender, String idNumber, String phoneNumber, String email, String customerId, String customerType, String address) {
        super(name, birthday, gender, idNumber, phoneNumber, email);
        this.customerId = customerId;
        this.customerType = customerType;
        this.address = address;
    }

    public String getCustomerId() {
        return customerId;
    }

    public void setCustomerId(String customerId) {
        this.customerId = customerId;
    }

    public String getCustomerType() {
        return customerType;
    }

    public void setCustomerType(String customerType) {
        this.customerType = customerType;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    @Override
    public String toString() {
        return "Customer{" +
                "customerId='" + customerId + '\'' + super.toString() + '\'' +
                ", customerType='" + customerType + '\'' +
                ", address='" + address + '\'' +
                '}';
    }

    @Override
    public String getInfoToCSV() {
        return this.getName()+","+this.getBirthday()+","+this.getGender()+","+this.getIdNumber()+","+this.getPhoneNumber()+","+this.getEmail()+","+this.getCustomerId()+","+this.getCustomerType()+","+this.getAddress();
    }

}
