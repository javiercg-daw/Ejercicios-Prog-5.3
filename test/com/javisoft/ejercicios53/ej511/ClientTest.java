package com.javisoft.ejercicios53.ej511;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ClientTest {

    private Client client;
    private final String id;
    private final String firstName;
    private final String lastName;

    public ClientTest() {
        this.id = "0000";
        this.firstName = "Homer";
        this.lastName = "Simpson";
    }

    @BeforeEach
    void setUp() {
        this.client = new Client(id, firstName, lastName);
    }

    @Test
    void getId() {
        assertEquals(client.getId(), id);
    }

    @Test
    void getFirstName() {
        assertEquals(client.getFirstName(), firstName);
    }

    @Test
    void getLastName() {
        assertEquals(client.getLastName(), lastName);
    }

    @Test
    void setFirstName() {
        String newFirstName = "Manolo";
        client.setFirstName(newFirstName);
        assertEquals(client.getFirstName(), newFirstName);
    }

    @Test
    void setLastName() {
        String newLastName = "Thompson";
        client.setLastName(newLastName);
        assertEquals(client.getLastName(), newLastName);
    }

    @Test
    void testToString() {
        String testStr = "Client{" +
                "id='" + id + '\'' +
                ", firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                '}';
        assertEquals(client.toString(), testStr);
    }
}