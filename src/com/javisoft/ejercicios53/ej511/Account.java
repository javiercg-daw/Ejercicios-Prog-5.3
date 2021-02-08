package com.javisoft.ejercicios53.ej511;

public class Account {
    private final String iban;
    private final Client owner;
    private double balance;

    public Account(String iban, Client owner, double balance) {
        this.iban = iban;
        this.owner = owner;
        this.balance = balance;
    }

    public Account(String iban, Client owner) {
        this(iban, owner, 0.0);
    }

    public String getIban() {
        return iban;
    }

    public Client getOwner() {
        return owner;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public void addToBalance(double amount) {
        setBalance(getBalance() + amount);
    }

    public void removeFromBalance(double amount) {
        setBalance(getBalance() - amount);
    }

    public void pay(Account recipient, double amount) {
        this.removeFromBalance(amount);
        recipient.addToBalance(amount);
    }

    public void getPaid(Account issuer, double amount) {
        issuer.pay(this, amount);
    }

    @Override
    public String toString() {
        return "Account{" +
                "id='" + iban + '\'' +
                ", owner=" + owner +
                ", balance=" + balance +
                '}';
    }
}
