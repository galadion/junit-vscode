package com.example;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestInstance;
import org.junit.jupiter.api.extension.ExtendWith;

// this annotation will let this test class now what to inject
// this enables us to use BankAccount as if it were instantiated already

//@TestInstance(TestInstance.Lifecycle.PER_CLASS) //with lifecycle per class we dont need the static anymore for @BeforeAll
public class BankAccountBeforeAndAfterTest {
    static BankAccount bankAccount;


    // this will be executed before all tests
    // @BeforeAll
    // public static void prepTest() {
    //     System.out.println("Test start");
    //     bankAccount = new BankAccount(500, 0);
    // }

    // this will be executed before each test
    @BeforeEach
    public void prepTest() {
        System.out.println("Prep test");
        bankAccount = new BankAccount(500, 0);
    }

    
    @Test
    public void testWithdraw() {
        // if we don't control the order, this test will fail because withdraw from 0 balance will throw execption
        bankAccount.withdraw(300);
        assertEquals(200, bankAccount.getBalance());
    }

    @Test
    public void testDeposit() {
        bankAccount.deposit(500);

        // below part if we use @BeforeAll then the previous amount from previous test
        // which is 200 will be used
        assertEquals(1000, bankAccount.getBalance());
    }

    // this will be executed after all test
    // @AfterAll
    // public static void endTest() {
    //     System.out.println("Test end.");
    // }

    @AfterEach
    public void endTest() {
        System.out.println("End test");
    }
}
