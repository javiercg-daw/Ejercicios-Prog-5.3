package com.javisoft.ejercicios53.ej512;

import java.util.GregorianCalendar;

public class Author {
    private String firstName;
    private String lastName;
    private final GregorianCalendar dateOfBirth;

    public Author(String firstName, String lastName, GregorianCalendar dateOfBirth) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.dateOfBirth = dateOfBirth;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public GregorianCalendar getDateOfBirth() {
        return dateOfBirth;
    }
}
