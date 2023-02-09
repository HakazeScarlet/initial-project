package learn_oop_2.library_readers;

class Reader {

    protected String fullName;
    protected int ticketID;
    protected String faculty;
    protected String dateOfBirth;
    protected int phoneNumber;
    protected int amountOfBooks;
    protected String bookTitle;

    public Reader(String fullName) {
        this.fullName = fullName;
    }

    void takeBook(int amountOfBooks) {
        System.out.println(fullName + " take " + amountOfBooks + " book(s)");
    }

    void takeBook(String ... bookTitles) {
        System.out.println(fullName + "take the next books: ");
        for (String title : bookTitles) {
            System.out.printf("%s \t", title);
        }
    }

    void takeBook(Book ... books) {
        System.out.println(fullName + "take the next books: ");
        for (Book book : books) {
            System.out.printf("%s \t", book.getTitle());
        }
    }

    // TODO: Correct next 3 methods, see examples above and re-read the task

    void returnBook(int amountOfBooks) {
        System.out.println(fullName + " return " + amountOfBooks + " book(s)");
    }

    void returnBook(String bookTitle) {
        System.out.println(fullName + " return " + bookTitle);
    }

    void returnBook(Book book) {
        System.out.println(fullName + " return book(s): " + book);
    }
}
