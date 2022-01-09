package lv.sda.books;

import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import static java.util.stream.Collectors.toList;

public class Bookstore {
    BookRepository bookRepository;

    public Bookstore(BookRepository bookRepository) {
        this.bookRepository = bookRepository;
    }

    public void closeBookstore() {
        bookRepository.close();
    }

    public boolean addBook(Book newBook) {
        boolean bookNotExists = bookRepository.getAllBooks().stream()
                .noneMatch(book -> book.getIsbn().equals(newBook.getIsbn()));
        if (bookNotExists) {
            bookRepository.addBook(newBook);
            return true;
        }
        return false;
    }

    public boolean removeBook(String isbn) {
        if (getInfo(isbn) != null) {
            bookRepository.removeBook(isbn);
            return true;
        }
        return false;
    }

    public Book getInfo(String isbn) {
        return bookRepository.getBookByIsbn(isbn);
    }

    public List<Book> searchBook(String query) {
        return bookRepository.searchBook(query);
    }

    public List<Book> allBooks() {
        return bookRepository.getAllBooks();
    }
}
