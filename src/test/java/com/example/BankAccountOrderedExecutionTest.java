package com.example;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.MethodOrderer;
import org.junit.jupiter.api.Order;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestMethodOrder;

@DisplayName("Test BankAccount Class")
@TestMethodOrder(MethodOrderer.OrderAnnotation.class) // use this annotation to tell that we will use ordered execution
public class BankAccountOrderedExecutionTest {
    static BankAccount bankAccount = new BankAccount(0, 0);

    @Test
    @Order(2) // use this annotation to specify which order in number
    public void testWithdraw() {
        // if we don't control the order, this test will fail because withdraw from 0 balance will throw execption
        bankAccount.withdraw(300);
        assertEquals(200, bankAccount.getBalance());
    }

    @Test
    @Order(1)
    public void testDeposit() {
        bankAccount.deposit(500);
        assertEquals(500, bankAccount.getBalance());
    }
}
