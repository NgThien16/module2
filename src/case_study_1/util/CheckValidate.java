package case_study_1.util;

public class CheckValidate {
    public static boolean checkEmployeeId(String employeeId){
        String regexEmployeeId ="^[N][V][-][0-9]{4}$";
        return employeeId.matches(regexEmployeeId);
    }
    public static boolean checkName(String name){
        String regexName ="^[A-Z][a-z]+(\s[A-Z][a-z]+)*$";
        return name.matches(regexName);
    }
    public static boolean checkIdNumber(String idNumber){
        String regexIdNumber = "^[0-9]{9,12}$";
        return idNumber.matches(regexIdNumber);
    }
    public static boolean checkPhoneNumber(String phoneNumber){
        String regexPhoneNumber = "^[0][0-9]{9}$";
        return phoneNumber.matches(regexPhoneNumber);
    }
    public static boolean checkSalary(String salary){
        String regexSalary = "^[1-9][0-9]+$";
        return salary.matches(regexSalary);
    }

}
