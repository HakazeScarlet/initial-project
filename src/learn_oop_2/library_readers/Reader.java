package learn_oop_2.library_readers;

import java.util.ArrayList;
import java.util.List;

public class Reader {

    private String fullName;
    private int ticketID;
    private String faculty;
    private String dateOfBirth;
    private int phoneNumber;
    private int amountOfBooks;

    public Reader(String fullName) {
        this.fullName = fullName;
    }

    void takeBook(int amountOfBooks) {
        System.out.println(fullName + " take " + amountOfBooks + " book(s)");
    }

    void takeBook(String bookTitle) {
        System.out.println(fullName + " take " + bookTitle);
    }

    void takeBook(Book book) {
        System.out.println(fullName + " take book(s): " + book);
    }

    void returnBook(int amountOfBooks) {
        System.out.println(fullName + " return " + amountOfBooks + " book(s)");
    }

    void returnBook(String bookTitle) {
        System.out.println(fullName + " return " + bookTitle);
    }

    void returnBook(Book book) {
        System.out.println(fullName + " return book(s): " + book);
    }

    List<Reader> readers = new ArrayList<>();

}
