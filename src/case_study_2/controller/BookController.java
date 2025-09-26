package case_study_2.controller;




import case_study_2.entity.Book;
import case_study_2.service.BookService;
import case_study_2.view.BookView;

import java.util.List;

public class BookController {
    private BookService bookService = new BookService();

    public void addBook() {
        System.out.println("Add new book");
        Book book = BookView.inputDataForNewBook();
        boolean isAddSuccess = bookService.add(book);
        if (isAddSuccess) {
            System.out.println("successfully add book");
        } else {
            System.out.println("can not add book");
        }

    }


    public void displayBook() {
        List<Book> bookList = bookService.findAll();
        BookView.displayBook(bookList);
    }

    public void deleteBook() {
        System.out.println("Delete magazine");
        String deleteBook = BookView.deleteBook();
        boolean isDeleteSuccess = bookService.delete(deleteBook);
        if (isDeleteSuccess) {
            System.out.println("successfully delete book");

        }else{
            System.out.println("can not delete book");
        }

    }
    public void searchBook() {
        System.out.println("Search book");
        BookView.searchBook();
    }

    }