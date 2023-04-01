package learn_oop_2.library_readers;

public class Main {

    public static void main(String[] args) {
        Reader reader1 = new Reader("Marchenko Andrew");
        reader1.takeBook("War and Peace", "Adventures", "Dictionary");
        reader1.returnBook(3);
    }
}
