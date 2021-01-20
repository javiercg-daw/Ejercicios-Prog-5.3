package com.javisoft.ejercicios53.ej511;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;
import org.junit.jupiter.params.provider.ValueSource;

import static org.junit.jupiter.api.Assertions.*;

class AccountTest {

    private Account account;
    private final String id;
    private final Client owner;
    private final double balance;
    private final Client otherClient;
    private Account otherAccount;

    public AccountTest() {
        this.id = "00001";
        this.owner = new Client("0000", "Homer", "Simpson");
        this.balance = 735.2;
        this.otherClient = new Client("0001", "Ambrosio", "Contreras");
    }

    @BeforeEach
    void setUp() {
        this.account = new Account(id, owner, balance);
        this.otherAccount = new Account("00011", otherClient, 472.7);
    }

    @Test
    void getId() {
        assertEquals(account.getId(), id);
    }

    @Test
    void getOwner() {
        assertEquals(account.getOwner(), owner);
    }

    @Test
    void getBalance() {
        assertEquals(account.getBalance(), balance);
    }

    @ParameterizedTest
    @ValueSource(doubles = {
            128.39, 38.89, 93524.346
    })
    void setBalance(double amount) {
        account.setBalance(amount);
        assertEquals(account.getBalance(), amount);
    }

    @ParameterizedTest
    @CsvSource({
            "38.2,      773.4",
            "1123.546,  1858.746",
            "3.3876,    738.5876"
    })
    void addToBalance(double amount, double output) {
        account.addToBalance(amount);
        assertEquals(account.getBalance(), output, 0.0001);
    }

    @ParameterizedTest
    @CsvSource({
            "123.45,    611.75",
            "7.34,      727.86",
            "999.98,     -264.78"
    })
    void removeFromBalance(double amount, double output) {
        account.removeFromBalance(amount);
        assertEquals(account.getBalance(), output, 0.0001);
    }

    @Test
    void pay() {
        account.pay(otherAccount, 42.42);
        assertEquals(account.getBalance(), 692.78, 0.0001);
        assertEquals(otherAccount.getBalance(), 515.12, 0.0001);
    }

    @Test
    void getPaid() {
        account.getPaid(otherAccount, 66.6);
        assertEquals(account.getBalance(), 801.8, 0.0001);
        assertEquals(otherAccount.getBalance(), 406.1, 0.0001);
    }

    @Test
    void testToString() {
        String newStr = "Account{" +
                "id='" + id + '\'' +
                ", owner=" + owner +
                ", balance=" + balance +
                '}';

        assertEquals(account.toString(), newStr);
    }

}