package lv.sda.books;

import java.util.List;

import static java.util.Collections.emptyList;

public class Bookstore {

    public void addBook(Book book) {
        // pievienosim grāmatu
    }

    public void removeBook(String isbn) {
        // dzēšam grāmatu pēc isbn
    }

    public Book getInfo(String isbn) {
        // atrodam grāmatu
        return null;
    }

    public List<Book> searchBook(String query) {
        // meklēsim grāmatas pēc query (nosaukma)
        return emptyList();
    }

    public List<Book> allBooks() {
        return emptyList();
    }
}
