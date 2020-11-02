package com.company.JDBC;

import com.company.Factory.Book;

import java.sql.SQLException;
import java.util.List;

public interface IBookRepository {
    public void add(Book book)
            throws Exception;
    public void delete(int id)
            throws SQLException;
    public Book getBook(String author , String title)
            throws SQLException;
    public List<Book> getBook()
            throws SQLException;
    public void update(Book book)
            throws SQLException;
}
