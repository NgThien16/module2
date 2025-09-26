package case_study_2.controller;


import java.util.Scanner;

public class DocumentController {
    public static void displayMainMenu() {
        Scanner scanner = new Scanner(System.in);
        BookController  bookController = new BookController();
        MagazineController   magazineController = new MagazineController();

        boolean flag = true;
        while (flag) {
            System.out.println("===== Document Management =====");
            System.out.println("Choose function:");
            System.out.println("1. Book Management");
            System.out.println("2. Magazine Management");
            System.out.println("3. Exit");
            System.out.print("Input your choice: ");

            int choice = Integer.parseInt(scanner.nextLine());
            switch (choice) {
                case 1:
                    boolean bookFlag = true;
                    while (bookFlag) {
                        System.out.println("---- Book Management ----");
                        System.out.println("1. Display list books");
                        System.out.println("2. Add new book");
                        System.out.println("3. Delete book");
                        System.out.println("4. Search book");
                        System.out.println("5. Return main menu");
                        System.out.print("Input your choice: ");
                        int bookChoice = Integer.parseInt(scanner.nextLine());
                        switch (bookChoice) {
                            case 1:
                                bookController.displayBook();
                                break;
                            case 2:
                                bookController.addBook();
                                break;
                            case 3:
                                bookController.deleteBook();
                                break;
                            case 4:
                                bookController.searchBook();
                                break;
                            case 5:
                                bookFlag = false;
                                break;
                            default:
                                System.out.println("Your choice is incorrect.");
                        }
                    }
                    break;

                case 2:
                    boolean magazineFlag = true;
                    while (magazineFlag) {
                        System.out.println("---- Magazine Management ----");
                        System.out.println("1. Display list magazines");
                        System.out.println("2. Add new magazine");
                        System.out.println("3. Delete Magazine");
                        System.out.println("4. Search Magazine");
                        System.out.println("5. Return main menu");
                        System.out.print("Input your choice: ");
                        int magazineChoice = Integer.parseInt(scanner.nextLine());
                        switch (magazineChoice) {
                            case 1:
                                magazineController.displayMagazine();
                                break;
                            case 2:
                                magazineController.addMagazine();
                                break;
                            case 3:
                                magazineController.deleteMagazine();
                                break;
                            case 4:
                                magazineController.searchMagazine();
                                break;
                            case 5:
                                magazineFlag = false;
                                break;
                            default:
                                System.out.println("Your choice is incorrect.");
                        }
                    }
                    break;
                case 3:
                    flag = false;
                    System.out.println("Exiting..........!");
                    break;

                default:
                    System.out.println("Your choice  is incorrect.!");
            }
        }
    }
}
