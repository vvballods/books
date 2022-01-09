package lv.sda.books;

import java.util.List;

public class DatabaseBookRepository implements BookRepository {
    // db konekcija un jādābū viss no DB pa taisno

    @Override
    public void addBook(Book newBook) {

    }

    @Override
    public void removeBook(String isbn) {

    }

    @Override
    public Book getBookByIsbn(String isbn) {
        return null;
    }

    @Override
    public List<Book> searchBook(String query) {
        return null;
    }

    @Override
    public List<Book> getAllBooks() {
        return null;
    }
}
