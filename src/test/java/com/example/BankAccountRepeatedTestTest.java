package com.example;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.RepeatedTest;
import org.junit.jupiter.api.RepetitionInfo;
import org.junit.jupiter.api.extension.ExtendWith;

// this annotation will let this test class now what to inject
// this enables us to use BankAccount as if it were instantiated already
@ExtendWith(BankAccountParameterResolver.class)
public class BankAccountRepeatedTestTest {
    
    @RepeatedTest(5)
    @DisplayName("Deposit 400 successfully")
    public void testDeposit(BankAccount bankAccount) {
        //we already inject the BankAccount as a parameter to this test function
        //refer to the BankAccountParameterResolver class on how this bank account is created

        bankAccount.deposit(500);
        assertEquals(500, bankAccount.getBalance());
    }

    @RepeatedTest(5)
    @DisplayName("Deposit 400 successfully")
    public void testDepositRepetitionInfo(BankAccount bankAccount, RepetitionInfo repetitionInfo) {
        //we already inject the BankAccount as a parameter to this test function
        //refer to the BankAccountParameterResolver class on how this bank account is created

        bankAccount.deposit(500);
        assertEquals(500, bankAccount.getBalance());

        System.out.println("Nr " + repetitionInfo.getCurrentRepetition());
    }
}

