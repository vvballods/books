package lv.sda.books;

import java.time.LocalDate;

public class Book {
    private String isbn;
    private String title;
    private String author;
    private String publisher;
    private String description;
    private int pages;
    private LocalDate publishingYear;

    public Book(String isbn, String title, String author, String publisher, String description, int pages, LocalDate publishingYear) {
        this.isbn = isbn;
        this.title = title;
        this.author = author;
        this.publisher = publisher;
        this.description = description;
        this.pages = pages;
        this.publishingYear = publishingYear;
    }

    public String getIsbn() {
        return isbn;
    }

    public void setIsbn(String isbn) {
        this.isbn = isbn;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public String getPublisher() {
        return publisher;
    }

    public void setPublisher(String publisher) {
        this.publisher = publisher;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public int getPages() {
        return pages;
    }

    public void setPages(int pages) {
        this.pages = pages;
    }

    public LocalDate getPublishingYear() {
        return publishingYear;
    }

    public void setPublishingYear(LocalDate publishingYear) {
        this.publishingYear = publishingYear;
    }
}
