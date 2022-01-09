package lv.sda.books;

import java.util.List;

public interface BookRepository {
    void addBook(Book newBook);
    void removeBook(String isbn);
    Book getBookByIsbn(String isbn);
    List<Book> searchBook(String query);
    List<Book> getAllBooks();
    default void close() {}
}


