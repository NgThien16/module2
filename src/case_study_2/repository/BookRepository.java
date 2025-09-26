package case_study_2.repository;

import case_study_2.entity.Book;
import case_study_2.util.ReadAndWriteFile;

import java.io.IOException;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class BookRepository implements IBookRepository {
    private final String BOOK_FILE = "src/case_study_2/data/book.csv";

    @Override
    public List<Book> findAll() {
        List<Book> bookList = new ArrayList<>();
        try {
            List<String> stringList = ReadAndWriteFile.readFileCSV(BOOK_FILE);
            String[] array = null;
            for (int i = 0; i < stringList.size(); i++) {
                array = stringList.get(i).split(",");
                if (array.length == 6) {
                    Book book = new Book(
                            array[0], array[1], array[2],
                            array[3], array[4], array[5]
                    );
                    bookList.add(book);
                }
            }
        } catch (IOException e) {
            System.out.println("Error reading file");
        }
        return bookList;
    }

    @Override
    public boolean add(Book book) {
        List<String> list = new ArrayList<>();
        list.add(book.getInfoToCSV());
        try {
            ReadAndWriteFile.writeListStringToCSV(BOOK_FILE, list, true);

        } catch (IOException e) {
            System.out.println("Error writing file");
            return false;
        }
        return true;
    }

    @Override
    public boolean delete(String documentId) {
        boolean isSuccessDelete = false;
        List<Book> bookList = this.findAll();
        for (int i = 0; i <bookList.size() ; i++) {
            if(bookList.get(i).getDocumentId().equals(documentId)) {
                bookList.remove(i);
                isSuccessDelete = true;
                break;
            }

        }
        List<String> stringList = new LinkedList<>();
        for (int i = 0; i < bookList.size(); i++) {
            stringList.add(bookList.get(i).getInfoToCSV());
        }
        try{
            ReadAndWriteFile.writeListStringToCSV(BOOK_FILE, stringList,false);
        }catch (IOException e){
            System.out.println("Error writing file");
        }
        return isSuccessDelete;
    }

    @Override
    public Book findById(String documentId) {
        List<Book> bookList = this.findAll();
        for (Book book : bookList) {
            if (book.getDocumentId().equalsIgnoreCase(documentId)) {
                return book;
            }
        }
        return null;
    }

    @Override
    public List<Book> findByName(String name) {
        List<Book> result = new ArrayList<>();
        List<Book> bookList = this.findAll();
        for (Book book : bookList) {
            if (book.getName().toLowerCase().contains(name.toLowerCase())) {
                result.add(book);
            }
        }
        return result;
    }

}
