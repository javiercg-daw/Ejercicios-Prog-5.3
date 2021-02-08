package com.javisoft.ejercicios53.ej511;

import java.util.InputMismatchException;
import java.util.Objects;

public class Client {
    private final String dni;
    private String firstName;
    private String lastName;
    private String phoneNumber;
    private static final char[] DNI_LETTERS = {'T', 'R', 'W', 'A', 'G', 'M', 'Y', 'F', 'P', 'D', 'X', 'B',
            'N', 'J', 'Z', 'S', 'Q', 'V', 'H', 'L', 'C', 'K', 'E'};

    public Client(String dni, String firstName, String lastName, String phoneNumber) throws IllegalArgumentException {
        if (!isValidDNI(dni)) {
            throw new IllegalArgumentException("Invalid DNI number provided.");
        }
        this.dni = dni;
        this.firstName = firstName;
        this.lastName = lastName;
        this.phoneNumber = phoneNumber;
    }

    public String getDni() {
        return dni;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    @Override
    public String toString() {
        return "Client{" +
                "id='" + dni + '\'' +
                ", firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Client client = (Client) o;
        return dni.equals(client.dni);
    }

    @Override
    public int hashCode() {
        return Objects.hash(dni);
    }

    protected static boolean isValidDNI(String dni) {
        return dni.matches("\\d{8}[a-zA-Z]") && dni.length() == 9 && dni.toUpperCase().charAt(8) == DNI_LETTERS[Integer.parseInt(dni.substring(0, 8)) % 23];
    }

}
