package com.javisoft.ejercicios53.ej511;

import com.javisoft.ejercicios53.ej513.Circle;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;
import org.junit.jupiter.params.provider.ValueSource;

import java.util.InputMismatchException;

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

    @ParameterizedTest
    @ValueSource(strings = {"66666665Q", "777777777G", "04206947N", "123456789", "a123345", "9999999A", "45323", "a5443", "a123123123", "999999889"})
    void constructorThrowsExceptionInvalidDNI(String dni) {
        assertThrows(IllegalArgumentException.class, () -> new Client(dni, "Anuel", "AA", "123123123"));
    }

    @ParameterizedTest
    @ValueSource(strings = {"23541342Z", "75433123T", "54332433Q"})
    void constructorDoesNotThrowExceptionValidDNI(String dni) {
        assertDoesNotThrow(() -> new Client(dni, "A", "b", "3132098"));
    }

    @Test
    void getId() {
        assertEquals(client.getDni(), ID);
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

    @ParameterizedTest
    @CsvSource({
            "12312323D, True",
            "04206947V, True",
            "12312323A, False",
            "34254243K, True",
            "34254243L, False"
    })
    void isValidDNITest(String dni, boolean output) {
        assertEquals(Client.isValidDNI(dni), output);
    }

}