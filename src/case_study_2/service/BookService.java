package case_study_2.service;


import case_study_2.repository.BookRepository;

import case_study_2.entity.Book;

import java.util.List;

public class BookService implements IBookService{
    BookRepository bookRepository = new BookRepository();
    @Override
    public List<Book> findAll() {
       return bookRepository.findAll();
    }

    @Override
    public boolean add(Book book) {
        return  bookRepository.add(book);
    }

    @Override
    public boolean delete(String documentId) {
        return  bookRepository.delete(documentId);
    }

    @Override
    public Book findById(String documentId) {
        return bookRepository.findById(documentId);
    }

    @Override
    public List<Book> findByName(String name) {
        return bookRepository.findByName(name);
    }
}
