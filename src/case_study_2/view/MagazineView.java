package case_study_2.view;


import case_study_2.entity.Magazine;

import case_study_2.service.MagazineService;
import case_study_2.util.CheckValidate;


import java.util.List;
import java.util.Scanner;

public class MagazineView {
    private static Scanner scanner = new Scanner(System.in);
    private static MagazineService magazineService = new MagazineService();

    public static void displayMagazine(List<Magazine> magazineList) {
        for (Magazine magazine : magazineList) {
            if (magazine != null) {
                System.out.println(magazine);
            } else {
                break;
            }
        }
    }

    public static Magazine inputDataForNewMagazine() {

        String documentId = "";
        do {
            System.out.println("Input document id (DOC-123): ");
            documentId = scanner.nextLine();
            if (!CheckValidate.checkDocumentId(documentId)) {
                System.out.println(" Invalid format! Please try again. Example: DOC-123");
            }
        } while (!CheckValidate.checkDocumentId(documentId));

        String name = "";
        do {
            System.out.println("Input magazine name: ");
            name = scanner.nextLine();
            if (!CheckValidate.checkName(name)) {
                System.out.println(" Invalid format! Please try again. Example: Time");
            }
        } while (!CheckValidate.checkName(name));


        String since = "";
        do {
            System.out.println("Input the year of publication: ");
            since = scanner.nextLine();
            if (!CheckValidate.checkSince(since)) {
                System.out.println(" Invalid format! Please try again. Example:2020");
            }
        } while (!CheckValidate.checkSince(since));

        String author = "";
        do {
            System.out.println("Input magazine author: ");
            author = scanner.nextLine();
            if (!CheckValidate.checkAuthor(author)) {
                System.out.println(" Invalid format! Please try again. Example: David Beckham");
            }
        } while (!CheckValidate.checkAuthor(author));

        System.out.println("Input issue number");
        String issueNumber = scanner.nextLine();

        System.out.println("Input issue month: ");
        String issueMonth = scanner.nextLine();

        Magazine magazine = new Magazine(documentId, name, since, author, issueNumber, issueMonth);
        return magazine;
    }

    public static String deleteMagazine() {
        String documentId = "";
        do {
            System.out.println("Input document id to delete: ");
            documentId = scanner.nextLine();
            if (!CheckValidate.checkDocumentId(documentId)) {
                System.out.println(" Invalid format! Please try again. Example: DOC-123");
            }
        } while (!CheckValidate.checkDocumentId(documentId));

       return documentId;
    }
    public static void searchMagazine(){
        System.out.println("Please enter the magazine id or name to search : ");
        String keyword =  scanner.nextLine().trim();

        Magazine foundById = magazineService.findById(keyword);
        if(foundById != null){
            System.out.println("Magazine found with id: ");
            System.out.println(foundById);
            return;
        }
        List<Magazine> foundByName = magazineService.findByName(keyword);
        if(!foundByName.isEmpty()){
            System.out.println("Found by Name");
            displayMagazine(foundByName);
        }else{
            System.out.println("Magazine not found with keyword: "+keyword);
        }
    }
}
