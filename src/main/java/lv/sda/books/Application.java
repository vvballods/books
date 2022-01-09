package lv.sda.books;

import java.time.LocalDate;
import java.util.List;
import java.util.Scanner;

public class Application {

    static Scanner scanner = new Scanner(System.in);
    static Bookstore bookstore;

    public static void main(String[] args) {
        System.out.println("Which storage method you want to use 1 - File, 2 - DB: ");
        int selected = Integer.parseInt(scanner.nextLine());
        if (selected == 2) {
            bookstore = new Bookstore(new FileBookRepository());
        } else {
            bookstore = new Bookstore(new DatabaseBookRepository());
        }

        while (true) {
            System.out.println("Menu");
            System.out.println("1. Search Book");
            System.out.println("2. Add Book");
            System.out.println("3. Remove Book");
            System.out.println("4. Get book info");
            System.out.println("5. List Available Books");
            System.out.println(" To quit press: q");
            String input = scanner.nextLine();

            if ("q".equalsIgnoreCase(input)) {
                bookstore.closeBookstore();
                System.out.println("Quiting application");
                break;
            }
            switch (input) {
                case "1":
                    System.out.println("Searching for book");
                    System.out.println("Search query: ");
                    String query = scanner.nextLine();
                    List<Book> results = bookstore.searchBook(query);
                    if (results.isEmpty()) {
                        System.out.println("Didn't find any books");
                    } else {
                        System.out.println("Found books:");
                        results.forEach(System.out::println);
                    }
                    break;
                case "2":
                    System.out.println("Adding book");
                    boolean added = bookstore.addBook(inputBook());
                    if (added) {
                        System.out.println("Book added");
                    } else {
                        System.out.println("Book not added");
                    }
                    break;
                case "3":
                    System.out.println("Removing book");
                    System.out.println("Provide Isbn of the book to remove: ");
                    String isbn = scanner.nextLine();
                    boolean removed = bookstore.removeBook(isbn);
                    if (removed) {
                        System.out.println("Book with isbn " + isbn + " was removed!");
                    } else {
                        System.out.println("Book with isbn " + isbn + " was not found!");
                    }
                    break;
                case "4":
                    System.out.println("Getting book info");
                    String isbnInput = scanner.nextLine();
                    System.out.println(bookstore.getInfo(isbnInput));
                    break;
                case "5":
                    System.out.println("Listing available books:");
                    bookstore.allBooks().forEach(System.out::println);
                    break;
                default:
                    System.out.println("Wrong input, please try again");
            }
            System.out.println();

        }
    }

    public static Book inputBook() {
        System.out.println("Isbn: ");
        String isbn = scanner.nextLine();
        System.out.println("Title: ");
        String title = scanner.nextLine();
        System.out.println("Author: ");
        String author = scanner.nextLine();
        System.out.println("Publisher: ");
        String publisher = scanner.nextLine();
        System.out.println("Description: ");
        String description = scanner.nextLine();
        System.out.println("Pages: ");
        int pages = Integer.parseInt(scanner.nextLine());
        System.out.println("Publishing year: ");
        LocalDate publishingYear = LocalDate.of(Integer.parseInt(scanner.nextLine()), 1, 1);
        return new Book(isbn, title, author, publisher, description, pages, publishingYear);
    }
}
