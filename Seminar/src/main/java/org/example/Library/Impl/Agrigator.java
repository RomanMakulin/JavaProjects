package org.example.Library.Impl;

import org.example.Library.Book;

public class Agrigator implements BookCart{
    public static int count = 0;
    public Book book;
    public BookGenre genre;

    public Agrigator(Book book, BookGenre genre) {
        this.book = book;
        this.genre = genre;
    }

    public Agrigator() {
    }

    @Override
    public Agrigator generateBook() {
        count++;
        return new Agrigator(new Book("title","author", 20, 2023), new BookGenre());
    }

    @Override
    public String toString() {
        return "Agrigator{" +
                "book=" + book +
                ",\n genre=" + genre +
                '}';
    }
}
