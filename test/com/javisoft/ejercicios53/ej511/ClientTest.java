package com.javisoft.ejercicios53.ej511;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ClientTest {

    private Client client;
    private final String ID;
    private final String FIRST_NAME;
    private final String LAST_NAME;

    public ClientTest() {
        this.ID = "0000";
        this.FIRST_NAME = "Homer";
        this.LAST_NAME = "Simpson";
    }

    @BeforeEach
    void setUp() {
        this.client = new Client(ID, FIRST_NAME, LAST_NAME);
    }

    @Test
    void getId() {
        assertEquals(client.getId(), ID);
    }

    @Test
    void getFirstName() {
        assertEquals(client.getFirstName(), FIRST_NAME);
    }

    @Test
    void getLastName() {
        assertEquals(client.getLastName(), LAST_NAME);
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
                "id='" + ID + '\'' +
                ", firstName='" + FIRST_NAME + '\'' +
                ", lastName='" + LAST_NAME + '\'' +
                '}';
        assertEquals(client.toString(), testStr);
    }
}