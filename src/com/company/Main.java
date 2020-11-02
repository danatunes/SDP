package com.company;

import com.company.Factory.*;
import com.company.JDBC.BookRepository;
import com.company.JDBC.DBConnection;
import org.postgresql.ssl.DbKeyStoreSocketFactory;

import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws Exception {

        LibraryFacade libraryFacade = new LibraryFacade();
        libraryFacade.requestBook();

    }
}
