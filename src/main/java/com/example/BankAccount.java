package com.example;

import javax.management.RuntimeErrorException;

public class BankAccount {
    private double balance;
    private double minBalance;
    private boolean isActive = true;
    private String holderName;

    public BankAccount(double balance, double minBalance) {
        this.balance = balance;
        this.minBalance = minBalance;
    }

    public double getBalance() {
        return balance;
    }

    public double getMinBalance() {
        return minBalance;
    }

    public boolean isActive() {
        return isActive;
    }

    public void setHolderName(String name) {
        holderName = name;
    }

    public String getHolderName() {
        return holderName;
    }

    public double withdraw(double amount) {
        if (balance - amount > minBalance) {
            balance -= amount;
            return balance;
        }
        else {
            throw new RuntimeException();
        }
    }

    public double deposit(double amount) {
        return balance += amount;
    }
}
