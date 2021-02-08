package com.javisoft.ejercicios53.ej512;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.Calendar;
import java.util.GregorianCalendar;
import java.util.HashSet;

import static org.junit.jupiter.api.Assertions.*;

class BookTest {
    private final String TITLE_1 = "The Fellowship of the Ring";
    private final GregorianCalendar RELEASE_DATE_1 = new GregorianCalendar(1954, Calendar.JULY, 29);
    private final int PAGES_1 = 423;
    private final String TITLE_2 = "The Silmarillion";
    private final GregorianCalendar RELEASE_DATE_2 = new GregorianCalendar(1977, Calendar.SEPTEMBER, 15);
    private final int PAGES_BOOK_2 = 365;
    private final Author AUTHOR_1 = new Author("J. R. R.", "Tolkien", new GregorianCalendar(1892, Calendar.JANUARY, 3));
    private final Author AUTHOR_2 = new Author("Christopher", "Tolkien", new GregorianCalendar(1924, Calendar.NOVEMBER, 24));
    private final HashSet<Author> AUTHORS_1 = new HashSet<>();
    private final HashSet<Author> AUTHORS_2 = new HashSet<>();
    private Book book1;
    private Book book2;


    @BeforeEach
    void setUp() {
        AUTHORS_1.add(AUTHOR_1);
        AUTHORS_2.add(AUTHOR_1);
        AUTHORS_2.add(AUTHOR_2);
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
        assertEquals(book1.toString(), TITLE_1 + " (" + AUTHORS_1.toString() + ", " + RELEASE_DATE_1.get(Calendar.YEAR) + "). " + PAGES_1 + " pages.");
        assertEquals(book2.toString(), TITLE_2 + " (" + AUTHORS_2.toString() + ", " + RELEASE_DATE_2.get(Calendar.YEAR) + "). " + PAGES_BOOK_2 + " pages.");
    }
}