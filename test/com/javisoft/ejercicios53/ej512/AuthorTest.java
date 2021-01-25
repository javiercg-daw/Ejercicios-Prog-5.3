package com.javisoft.ejercicios53.ej512;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;

import java.util.Calendar;
import java.util.GregorianCalendar;

import static org.junit.jupiter.api.Assertions.*;

class AuthorTest {
    private final String FIRST_NAME = "John Ronald Reuel";
    private final String LAST_NAME = "Tolkien";
    private final GregorianCalendar DATE_OF_BIRTH = new GregorianCalendar(1892, Calendar.JANUARY, 3);
    private Author author;

    @BeforeEach
    void setUp() {
        this.author = new Author(FIRST_NAME, LAST_NAME, DATE_OF_BIRTH);
    }

    @Test
    void getFirstName() {
        assertEquals(author.getFirstName(), FIRST_NAME);
    }

    @Test
    void setFirstName() {
        String newFirstName = LAST_NAME;
        author.setFirstName(newFirstName);
        assertEquals(author.getFirstName(), newFirstName);
    }

    @Test
    void getLastName() {
        assertEquals(author.getLastName(), LAST_NAME);
    }

    @ParameterizedTest
    @ValueSource(strings = {
            "González", "Miyazaki", "Baggins"
    })
    void setLastName(String newLastName) {
        author.setLastName(newLastName);
        assertEquals(author.getLastName(), newLastName);
    }

    @Test
    void getDateOfBirth() {
        assertEquals(author.getDateOfBirth(), DATE_OF_BIRTH);
    }

    @Test
    void toStringTest() {
        String output = "Author{" +
                "firstName='" + FIRST_NAME + '\'' +
                ", lastName='" + LAST_NAME + '\'' +
                ", dateOfBirth=" + DATE_OF_BIRTH +
                '}';
        assertEquals(author.toString(), output);
    }
}