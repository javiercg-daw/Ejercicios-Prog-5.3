package com.javisoft.ejercicios53.ej511;

public class Account {
    private final String id;
    private final Client owner;
    private double balance;

    public Account(String id, Client owner, double balance) {
        this.id = id;
        this.owner = owner;
        this.balance = balance;
    }

    public Account(String id, Client owner) {
        this(id, owner, 0.0);
    }

    public String getId() {
        return id;
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
                "id='" + id + '\'' +
                ", owner=" + owner +
                ", balance=" + balance +
                '}';
    }
}
