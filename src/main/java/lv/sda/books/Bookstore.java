package lv.sda.books;

import java.util.ArrayList;
import java.util.List;

import static java.util.Collections.emptyList;

public class Bookstore {
    List<Book> books = new ArrayList<>();

    public void addBook(Book book) {
        books.add(book);
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
        return books;
    }
}
