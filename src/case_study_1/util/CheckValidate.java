package case_study_1.util;

import java.time.LocalDate;
import java.time.Period;
import java.time.format.DateTimeFormatter;
import java.time.format.DateTimeParseException;

public class CheckValidate {
    public static boolean checkEmployeeId(String employeeId) {
        String regexEmployeeId = "^[N][V][-][0-9]{4}$";
        return employeeId.matches(regexEmployeeId);
    }

    public static boolean checkName(String name) {
        String regexName = "^[A-Z][a-z]+(\s[A-Z][a-z]+)+$";
        return name.matches(regexName);
    }

    public static boolean checkIdNumber(String idNumber) {
        String regexIdNumber = "^[0-9]{9}$|^[0-9]{12}$";
        return idNumber.matches(regexIdNumber);
    }

    public static boolean checkPhoneNumber(String phoneNumber) {
        String regexPhoneNumber = "^[0][0-9]{9}$";
        return phoneNumber.matches(regexPhoneNumber);
    }

    public static boolean checkSalary(String salary) {
        String regexSalary = "^[1-9][0-9]+$";
        return salary.matches(regexSalary);
    }

    public static boolean checkCustomerId(String customerId) {
        String regexCustomerId = "^[K][H][-][0-9]{4}$";
        return customerId.matches(regexCustomerId);
    }

    public static boolean checkAge(String birthday) {

        try {
            DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy");
            LocalDate birthDate = LocalDate.parse(birthday, formatter);
            LocalDate today = LocalDate.now();

            int age = Period.between(birthDate, today).getYears();
            return age >= 18;
        } catch (DateTimeParseException e) {
            return false; // sai định dạng ngày
        }

    }

}
