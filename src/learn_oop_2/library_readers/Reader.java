package learn_oop_2.library_readers;

import java.util.ArrayList;
import java.util.List;

class Reader {

    protected String fullName;
    protected int ticketID;
    protected String faculty;
    protected String dateOfBirth;
    protected int phoneNumber;
    protected int amountOfBooks;
    protected String bookTitle;

    private List<Reader> readers = new ArrayList<>();

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

    public String getFullName() { return fullName; }

    public void setFullName(String fullName) { this.fullName = fullName; }

    public int getAmountOfBooks() { return amountOfBooks; }

    public void setAmountOfBooks(int amountOfBooks) { this.amountOfBooks = amountOfBooks; }

    public String getBookTitle() { return bookTitle; }

    public void setBookTitle(String bookTitle) { this.bookTitle = bookTitle; }
}
