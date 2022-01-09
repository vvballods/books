package lv.sda.books;

import org.junit.jupiter.api.Test;

import java.time.LocalDate;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class ApplicationTest {

    @Test
    public void testBookWasAdded() {
        // 1. solis - sagatvojam testa datus
        Bookstore bookstore = new Bookstore(new FileBookRepository());
        Book book = new Book("12345678", "Divi cilvēki", "", "", "", 300, LocalDate.of(1995, 1, 1));
        int initalSize = bookstore.allBooks().size();

        // 2. solis - izpildam metodi/funkcionalitāti ko pārbaudām, ka viņa pareizi
        bookstore.addBook(book);

        // 3. solis - mēs salīdzinām rezultātu ar sagaidāmo rezultātu
        assertEquals( initalSize + 1, bookstore.allBooks().size());
    }
}
