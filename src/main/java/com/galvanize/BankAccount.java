package com.galvanize;

public class BankAccount {
    @Override
    public String toString() {
        return "Balance = " + balance;
    }

    private long balance = 0;

    void deposit(long cents) {
        balance += cents;
    }

    void withdraw(long cents) {
        balance -= cents;
    }

    long balance() {
        return balance;
    }

    boolean isOverDrawn() {
        return balance < 0;
    }
}
