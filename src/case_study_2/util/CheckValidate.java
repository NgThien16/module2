package case_study_2.util;

import java.time.LocalDate;
import java.time.Period;
import java.time.format.DateTimeFormatter;
import java.time.format.DateTimeParseException;

public class CheckValidate {
    public static boolean checkDocumentId(String documentId) {
        String regexDocumentId = "^[D][O][C][-][0-9]{3}$";
        return documentId.matches(regexDocumentId);
    }

    public static boolean checkName(String name) {
        String regexName = "^[A-Z][a-z]+(\s[A-Z][a-z]+)*$";
        return name.matches(regexName);
    }
    public static boolean checkAuthor(String author) {
        String regexAuthor = "^[A-Z][a-z]+(\s[A-Z][a-z]+)+$";
        return author.matches(regexAuthor);
    }



    public static boolean checkSince(String since) {
        String regexSince = "^[0,1,2][0-9]{3}$";
        return since.matches(regexSince);
    }

    public static boolean checkPage(String pages) {
        String regexPage = "^[1-9]+$";
        return pages.matches(regexPage);
    }


}
