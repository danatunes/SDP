package com.company;

import com.company.Factory.Book;
import com.company.Factory.BookFactory;
import com.company.JDBC.BookRepository;

import java.sql.SQLException;
import java.util.List;
import java.util.Scanner;

public class Librarian {
    Book book;
    List<Book> bookList;
    Integer id;
    String name;
    private BookRepository bookRepository ;
    public Librarian() {
        bookRepository = new BookRepository();
    }

    public Librarian(Integer id, String name) {
        this.id = id;
        this.name = name;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void addBook(Integer c, String author, String title) {
        BookFactory bookFactory = new BookFactory();

        Book book = bookFactory.createBook(c, author, title);
        book.displayBook();

        try {
            bookRepository.add(book);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public void issueBook() {

    }

    public void returnBook() {

    }

    public void searchBook(String title ,String author) {

        try {
            System.out.println(bookRepository.getBook(title,author));
        } catch (SQLException throwables) {
            throwables.printStackTrace();
        }

    }

    public void getAllCollection(){
        try {
            System.out.println(bookRepository.getBook());;
        } catch (SQLException throwables) {
            throwables.printStackTrace();
        }
    }

    public void deleteBook(int id) {
        try {
            bookRepository.delete(id);
        } catch (SQLException throwables) {
            throwables.printStackTrace();
        }
    }

}
