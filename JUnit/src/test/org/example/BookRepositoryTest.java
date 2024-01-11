package org.example;

import org.junit.jupiter.api.Test;
import java.util.List;
import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

class BookRepositoryTest {
    InMemoryBookRepository inMemoryBookRepository = new InMemoryBookRepository();
    List<Book> books = inMemoryBookRepository.findAll();
    BookRepository bookRepositoryMock = mock(BookRepository.class);
    BookService bookService = new BookService(bookRepositoryMock);

    @Test
    void findByIdTest() {
        when(bookRepositoryMock.findById("2")).thenReturn(books.get(0));
        Book needBook = bookService.findBookById("2");
        assertEquals(bookRepositoryMock.findById("2"), needBook);
    }

    @Test
    void findAllTest() {
        when(bookRepositoryMock.findAll()).thenReturn(books);
        List<Book> resList = bookService.findAllBooks();
        assertEquals(bookRepositoryMock.findAll(), resList);
    }
}