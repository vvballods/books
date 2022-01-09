package lv.sda.books;

import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import static java.util.stream.Collectors.toList;

public class FileBookRepository implements BookRepository {
    private static final String FILE_NAME = "src/main/resources/books.txt";
    List<Book> books = new ArrayList<>();

    public FileBookRepository() {
        try {
            Path path = Paths.get(FILE_NAME);
            List<Book> books = Files.lines(path).map(line -> {
                List<String> fields = Arrays.stream(line.split(";")).collect(toList());
                return new Book(
                        fields.get(0),
                        fields.get(1),
                        fields.get(2),
                        fields.get(3),
                        fields.get(4),
                        Integer.parseInt(fields.get(5)),
                        LocalDate.of(Integer.parseInt(fields.get(6)), 1, 1)
                );
            }).collect(toList());
            this.books.addAll(books);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public void close() {
        try {
            Path path = Paths.get(FILE_NAME);
            Files.write(path, books.stream().map(Book::toString).collect(toList()));
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    @Override
    public void addBook(Book newBook) {
        books.add(newBook);
    }

    @Override
    public void removeBook(String isbn) {
        books.removeIf(book -> book.getIsbn().equals(isbn));
    }

    @Override
    public Book getBookByIsbn(String isbn) {
        return books.stream()
                .filter(book -> book.getIsbn().equals(isbn))
                .findFirst()
                .orElse(null);
    }

    @Override
    public List<Book> searchBook(String query) {
        return books.stream()
                .filter(book -> book.toString().toLowerCase().contains(query.toLowerCase()))
                .collect(toList());
    }

    @Override
    public List<Book> getAllBooks() {
        return books;
    }
}
