package com.javisoft.ejercicios53.ej512;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;

import java.util.Calendar;
import java.util.GregorianCalendar;

import static org.junit.jupiter.api.Assertions.*;

class AuthorTest {
    private final String firstName;
    private final String lastName;
    private final GregorianCalendar dateOfBirth;
    private Author author;

    public AuthorTest() {
        this.firstName = "John Ronald Reuel";
        this.lastName = "Tolkien";
        this.dateOfBirth = new GregorianCalendar(1892, Calendar.JANUARY, 3);
    }

    @BeforeEach
    void setUp() {
        this.author = new Author(firstName, lastName, dateOfBirth);
    }

    @Test
    void getFirstName() {
        assertEquals(author.getFirstName(), "John Ronald Reuel");
    }

    @Test
    void setFirstName() {
        String newFirstName = "J. R. R.";
        author.setFirstName(newFirstName);
        assertEquals(author.getFirstName(), newFirstName);
    }

    @Test
    void getLastName() {
        assertEquals(author.getLastName(), lastName);
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
        assertEquals(author.getDateOfBirth(), dateOfBirth);
    }
}