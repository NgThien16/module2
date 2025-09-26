package case_study_2.view;

import case_study_2.entity.Book;
import case_study_2.service.BookService;
import case_study_2.util.CheckValidate;

import java.util.List;
import java.util.Scanner;

public class BookView {
    private static Scanner scanner = new Scanner(System.in);
    private static BookService bookService = new BookService();

    public static void displayBook(List<Book> bookList) {
        for (Book book : bookList) {
            if (book != null) {
                System.out.println(book);
            } else {
                break;
            }
        }
    }

    public static Book inputDataForNewBook() {

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
            System.out.println("Input book name: ");
            name = scanner.nextLine();
            if (!CheckValidate.checkName(name)) {
                System.out.println(" Invalid format! Please try again. Example: Never Give Up");
            }
        } while (!CheckValidate.checkName(name));


        String since = "";
        do {
            System.out.println("Input the year of publication: ");
            since = scanner.nextLine();
            if (!CheckValidate.checkSince(since)) {
                System.out.println(" Invalid format! Please try again. Example: 9-12 number");
            }
        } while (!CheckValidate.checkSince(since));

        String author = "";
        do {
            System.out.println("Input book author: ");
            author = scanner.nextLine();
            if (!CheckValidate.checkAuthor(author)) {
                System.out.println(" Invalid format! Please try again. Example: David Beckham");
            }
        } while (!CheckValidate.checkAuthor(author));

        String pages = "";
        do {
            System.out.println("Input book pages: ");
            pages = scanner.nextLine();
            if (!CheckValidate.checkPage(pages)) {
                System.out.println(" Invalid format! Please try again. Example: NV-1234");
            }
        } while (!CheckValidate.checkPage(pages));

        System.out.println("Input book type: ");
        String type = scanner.nextLine();

        Book book = new Book(documentId, name, since, author, pages, type);
        return book;
    }
    public static String deleteBook() {
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
    public static void searchBook(){
        System.out.println("Please enter the book id or name to search : ");
        String keyword =  scanner.nextLine().trim();

        Book foundById = bookService.findById(keyword);
        if(foundById != null){
            System.out.println("Book found with id: ");
            System.out.println(foundById);
            return;
        }
        List<Book> foundByName = bookService.findByName(keyword);
        if(!foundByName.isEmpty()){
            System.out.println("Found by Name");
            displayBook(foundByName);
        }else{
            System.out.println("Book not found with keyword: "+keyword);
        }
    }

}
