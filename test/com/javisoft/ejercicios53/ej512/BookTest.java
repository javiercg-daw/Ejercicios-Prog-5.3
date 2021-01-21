package com.javisoft.ejercicios53.ej512;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.Calendar;
import java.util.GregorianCalendar;
import java.util.HashSet;

import static org.junit.jupiter.api.Assertions.*;

class BookTest {
    private final String titleBook1;
    private final GregorianCalendar releaseDateBook1;
    private final int pagesBook1;
    private final String titleBook2;
    private final GregorianCalendar releaseDateBook2;
    private final int pagesBook2;
    private final Author author1;
    private final Author author2;
    private final HashSet<Author> authorsBook1;
    private final HashSet<Author> authorsBook2
    private Book book1;
    private Book book2;

    public BookTest() {
        this.titleBook1 = "The Fellowship of the Ring";
        this.releaseDateBook1 = new GregorianCalendar(1954, Calendar.JULY, 29);
        this.pagesBook1 = 423;
        this.titleBook2 = "The Silmarillion";
        this.releaseDateBook2 = new GregorianCalendar(1977, Calendar.SEPTEMBER, 15);
        this.pagesBook2 = 365;
        this.author1 = new Author("J. R. R.", "Tolkien", new GregorianCalendar(1892, Calendar.JANUARY, 3));
        this.author2 = new Author("Christopher", "Tolkien", new GregorianCalendar(1924, Calendar.NOVEMBER, 24));
        this.authorsBook1 = new HashSet<>();
        this.authorsBook2 = new HashSet<>();
        authorsBook1.add(author1);
        authorsBook2.add(author1);
        authorsBook2.add(author2);
    }

    @BeforeEach
    void setUp() {
        this.book1 = new Book(titleBook1, authorsBook1, releaseDateBook1, pagesBook1);
        this.book2 = new Book(titleBook2, authorsBook2, releaseDateBook2, pagesBook2);
    }

    @Test
    void getTitle() {
        assertEquals(book1.getTitle(), titleBook1);
        assertEquals(book2.getTitle(), titleBook2);
    }

    @Test
    void getAuthors() {
        assertEquals(book1.getAuthors(), );
        assertArrayEquals(book2.getAuthors(), authors);
    }

    @Test
    void getReleaseDate() {
        assertEquals(book1.getReleaseDate(), releaseDateBook1);
        assertEquals(book2.getReleaseDate(), releaseDateBook2);
    }

    @Test
    void getPages() {
        assertEquals(book1.getPages(), pagesBook1);
        assertEquals(book2.getPages(), pagesBook2);
    }

    @Test
    void toString() {
        assertEquals(book1.toString(), titleBook1 + " (" + Arrays.toString(authors) + ", " + releaseDate.toString() + "). " + pages + " pages.";
    }
}