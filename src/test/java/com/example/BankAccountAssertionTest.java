package com.example;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

import java.time.Duration;

import static org.junit.jupiter.api.Assertions.assertNull;
import static org.junit.jupiter.api.Assertions.assertNotNull;
import static org.junit.jupiter.api.Assertions.assertThrows;
import static org.junit.jupiter.api.Assertions.assertAll;
import static org.junit.jupiter.api.Assertions.assertTimeout;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

@DisplayName("Test BankAccount Class")
public class BankAccountAssertionTest {

    @Test
    @DisplayName("Withdraw 500 successfully")
    public void testWithdraw() {
        BankAccount bankAccount = new BankAccount(500, -1000);

        bankAccount.withdraw(300);
        assertEquals(200, bankAccount.getBalance());
    }

    @Test
    @DisplayName("Deposit 400 successfully")
    public void testDeposit() {
        BankAccount bankAccount = new BankAccount(400, 0);

        bankAccount.deposit(500);
        assertEquals(900, bankAccount.getBalance());
    }

    @Test
    @DisplayName("Withdraw will become negative")
    public void testWithdrawNotStuckAtZero() {
        BankAccount bankAccount = new BankAccount(500, -1000);
        
        bankAccount.withdraw(800);
        assertNotEquals(0, bankAccount.getBalance());
    }

    @Test
    @DisplayName("Account is active")
    public void testActive() {
        BankAccount bankAccount = new BankAccount(500, -1000);
        
        assertTrue(bankAccount.isActive());
    }

    @Test
    @DisplayName("Holder name is set")
    public void testHolderName() {
        BankAccount bankAccount = new BankAccount(500, -1000);
        
        assertNull(bankAccount.getHolderName());

        bankAccount.setHolderName("Meeka");
        assertNotNull(bankAccount.getHolderName());
    }

    @Test
    @DisplayName("Withdraw below minimum")
    public void testWithdrawBelowMinimum() {
        BankAccount bankAccount = new BankAccount(500, -1000);
        
        assertThrows(RuntimeException.class, () -> bankAccount.withdraw(2000));
    }

    @Test
    @DisplayName("Withdraw and deposit without exception")
    public void testWithdrawAndDepositWithoutException() {
        BankAccount bankAccount = new BankAccount(500, -1000);
        assertAll(() -> bankAccount.deposit(200), () -> bankAccount.withdraw(500));
    }

    @Test
    @DisplayName("Deposit timeout")
    public void testDepositTimeout() {
        BankAccount bankAccount = new BankAccount(500, 0);
        assertTimeout(Duration.ofNanos(1), () -> bankAccount.withdraw(200));
    }
}
