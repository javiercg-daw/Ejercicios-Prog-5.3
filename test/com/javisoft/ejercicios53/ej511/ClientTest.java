package com.javisoft.ejercicios53.ej511;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ClientTest {

    private Client client;
    private final String ID = "04206947V";
    private final String FIRST_NAME = "Homer";
    private final String LAST_NAME = "Simpson";
    private final String PHONE_NUMBER = "666666666";

    @BeforeEach
    void setUp() {
        this.client = new Client(ID, FIRST_NAME, LAST_NAME, PHONE_NUMBER);
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

    @Test
    void getPhoneNumber() {
        assertEquals(client.getPhoneNumber(), "666666666");
    }

    @Test
    void setPhoneNumber() {
        client.setPhoneNumber("123456789");
        assertEquals(client.getPhoneNumber(), "123456789");
    }

    @Test
    void testEquals() {
        assertEquals(client, new Client("04206947V", "Homer", "Simpson", "666666666"));
    }
}