package com.example;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;
import static org.junit.jupiter.api.Assumptions.assumeFalse;
import static org.junit.jupiter.api.Assumptions.assumeTrue;
import static org.junit.jupiter.api.Assumptions.assumingThat;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

@DisplayName("Test BankAccount Class")
public class BankAccountAssumptionTest {

    @Test
    @DisplayName("Account is active")
    public void testActive() {
        BankAccount bankAccount = new BankAccount(500, -1000);
        assumeFalse(bankAccount == null);
        assertTrue(bankAccount.isActive());
    }

    @Test
    @DisplayName("Account is active")
    public void testAsusmingThat() {
        BankAccount bankAccount = new BankAccount(500, -1000);
        // if the assumption is true, the executable will be run
        // in this example executable will not run
        assumingThat(bankAccount == null, () -> assertFalse(bankAccount.isActive()));
    }
}
