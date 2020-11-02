package com.company;

import com.company.Factory.Book;
import com.company.JDBC.BookRepository;

import java.util.Scanner;

public class LibraryFacade {

    private Librarian librarian = new Librarian();
    private String author;
    private String title;

    public void requestBook() {

        while (true) {
            System.out.println("Library system!");
            System.out.println("1 Work");
            System.out.println("2 Off");
            Scanner sc = new Scanner(System.in);
            Integer choice = sc.nextInt();

            if (choice == 1) {
                System.out.println("1 Create Book");
                System.out.println("2 Search Book");
                System.out.println("3 get all collection of books");
                System.out.println("4 delete book with id");
                Scanner scn = new Scanner(System.in);
                choice = scn.nextInt();
                if (choice == 1) {
                    System.out.println("please typing what you want to create:");
                    System.out.println("1 Journal");
                    System.out.println("2 Textbook");
                    System.out.println("3 Magazine");

                    Scanner scan = new Scanner(System.in);
                    Integer c = scan.nextInt();

                    System.out.println("Author");
                    Scanner a = new Scanner(System.in);

                    System.out.println("Title");
                    Scanner t = new Scanner(System.in);

                    author = a.nextLine();
                    title = t.nextLine();

                    librarian.addBook(c, author, title);
                } else if (choice == 2) {
                    System.out.println("Type title and author of book");
                    Scanner scanner = new Scanner(System.in);
                    title = scanner.nextLine();
                    Scanner scanner1 = new Scanner(System.in);
                    author = scanner1.nextLine();
                    librarian.searchBook(title, author);
                } else if (choice == 3) {
                    librarian.getAllCollection();
                } else if (choice == 4){
                    System.out.println("type id:");
                    Scanner scanner2 = new Scanner(System.in);
                    Integer id = scanner2.nextInt();
                    librarian.deleteBook(id);
                }
            }
            break;
        }
    }

    public void payBill() {

    }

       /*     System.out.println("please typing what you want to create:");
            System.out.println("1 Journal");
            System.out.println("2 Textbook");
            System.out.println("3 Magazine");

    Scanner sc = new Scanner(System.in);
    Integer c = sc.nextInt();

            System.out.println("Author");
    Scanner a = new Scanner(System.in);

            System.out.println("Title");
    Scanner t = new Scanner(System.in);

    String author = a.nextLine();
    String title = t.nextLine();

            librarian.addBook(c,author,title);*/
}
