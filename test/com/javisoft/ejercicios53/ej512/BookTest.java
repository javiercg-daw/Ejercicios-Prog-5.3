package com.javisoft.ejercicios53.ej512;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.Calendar;
import java.util.GregorianCalendar;
import java.util.HashSet;

import static org.junit.jupiter.api.Assertions.*;

class BookTest {
    private final String TITLE_1;
    private final GregorianCalendar RELEASE_DATE_1;
    private final int PAGES_1;
    private final String TITLE_2;
    private final GregorianCalendar RELEASE_DATE_2;
    private final int PAGES_BOOK_2;
    private final Author AUTHOR_1;
    private final Author AUTHOR_2;
    private final HashSet<Author> AUTHORS_1;
    private final HashSet<Author> AUTHORS_2;
    private Book book1;
    private Book book2;

    public BookTest() {
        this.TITLE_1 = "The Fellowship of the Ring";
        this.RELEASE_DATE_1 = new GregorianCalendar(1954, Calendar.JULY, 29);
        this.PAGES_1 = 423;
        this.TITLE_2 = "The Silmarillion";
        this.RELEASE_DATE_2 = new GregorianCalendar(1977, Calendar.SEPTEMBER, 15);
        this.PAGES_BOOK_2 = 365;
        this.AUTHOR_1 = new Author("J. R. R.", "Tolkien", new GregorianCalendar(1892, Calendar.JANUARY, 3));
        this.AUTHOR_2 = new Author("Christopher", "Tolkien", new GregorianCalendar(1924, Calendar.NOVEMBER, 24));
        this.AUTHORS_1 = new HashSet<>();
        this.AUTHORS_2 = new HashSet<>();
        AUTHORS_1.add(AUTHOR_1);
        AUTHORS_2.add(AUTHOR_1);
        AUTHORS_2.add(AUTHOR_2);
    }

    @BeforeEach
    void setUp() {
        this.book1 = new Book(TITLE_1, AUTHORS_1, RELEASE_DATE_1, PAGES_1);
        this.book2 = new Book(TITLE_2, AUTHORS_2, RELEASE_DATE_2, PAGES_BOOK_2);
    }

    @Test
    void getTitle() {
        assertEquals(book1.getTitle(), TITLE_1);
        assertEquals(book2.getTitle(), TITLE_2);
    }

    @Test
    void getAuthors() {
        assertEquals(book1.getAuthors(), AUTHORS_1);
        assertEquals(book2.getAuthors(), AUTHORS_2);
    }

    @Test
    void getReleaseDate() {
        assertEquals(book1.getReleaseDate(), RELEASE_DATE_1);
        assertEquals(book2.getReleaseDate(), RELEASE_DATE_2);
    }

    @Test
    void getPages() {
        assertEquals(book1.getPages(), PAGES_1);
        assertEquals(book2.getPages(), PAGES_BOOK_2);
    }

    @Test
    void testToString() {
        assertEquals(book1.toString(), TITLE_1 + " (" + AUTHORS_1.toString() + ", " + RELEASE_DATE_1.toString() + "). " + PAGES_1 + " pages.");
        assertEquals(book2.toString(), TITLE_2 + " (" + AUTHORS_2.toString() + ", " + RELEASE_DATE_2.toString() + "). " + PAGES_BOOK_2 + " pages.");
    }
}