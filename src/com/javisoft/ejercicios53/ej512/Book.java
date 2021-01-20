package com.javisoft.ejercicios53.ej512;

import java.util.GregorianCalendar;

public class Book {
    private final String title;
    private final Author[] authors;
    private final GregorianCalendar releaseDate;
    private final int pages;

    public Book(String title, Author[] authors, GregorianCalendar releaseDate, int pages) {
        this.title = title;
        this.authors = authors;
        this.releaseDate = releaseDate;
        this.pages = pages;
    }

    public Book(String title, Author author, GregorianCalendar releaseDate, int pages) {
        this(title, new Author[]{author}, releaseDate, pages);
    }

    public String getTitle() {
        return title;
    }

    public Author[] getAuthors() {
        return authors;
    }

    public GregorianCalendar getReleaseDate() {
        return releaseDate;
    }

    public int getPages() {
        return pages;
    }
}
