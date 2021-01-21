package com.javisoft.ejercicios53.ej512;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.GregorianCalendar;
import java.util.HashSet;

public class Book {
    private final String title;
    private final HashSet<Author> authors;
    private final GregorianCalendar releaseDate;
    private final int pages;

    public Book(String title, HashSet<Author> authors, GregorianCalendar releaseDate, int pages) {
        this.title = title;
        this.authors = authors;
        this.releaseDate = releaseDate;
        this.pages = pages;
    }

    public String getTitle() {
        return title;
    }

    public HashSet<Author> getAuthors() {
        return authors;
    }

    public GregorianCalendar getReleaseDate() {
        return releaseDate;
    }

    public int getPages() {
        return pages;
    }

    @Override
    public String toString() {
        return title + " (" + authors.toString() + ", " + releaseDate.toString() + "). " + pages + " pages.";
    }
}
