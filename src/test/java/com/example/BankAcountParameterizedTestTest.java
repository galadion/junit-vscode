package com.example;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

import java.time.DayOfWeek;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.extension.ExtendWith;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvFileSource;
import org.junit.jupiter.params.provider.CsvSource;
import org.junit.jupiter.params.provider.EnumSource;
import org.junit.jupiter.params.provider.ValueSource;

// this annotation will let this test class now what to inject
// this enables us to use BankAccount as if it were instantiated already
@ExtendWith(BankAccountParameterResolver.class)
public class BankAcountParameterizedTestTest {
    
    // in this test we specify set of values to be tested
    // and we pass these values (array) into the method to be tested
    @ParameterizedTest
    @ValueSource(ints = {100, 400, 800, 1000})
    @DisplayName("Deposit successfully")
    public void testDeposit(int amount, BankAccount bankAccount) {
        //we already inject the BankAccount as a parameter to this test function
        //refer to the BankAccountParameterResolver class on how this bank account is created

        bankAccount.deposit(amount);
        assertEquals(amount, bankAccount.getBalance());
    }

    // parameterized test for enums
    @ParameterizedTest
    @EnumSource(value = DayOfWeek.class, names = {"TUESDAY", "THURSDAY"})
    @DisplayName("Day of week starts with T")
    public void testDayOfWeek(DayOfWeek day) {
        assertTrue(day.toString().startsWith("T"));
    }


    // parameterized test with csv entries
    @ParameterizedTest
    @CsvSource({"100, Mary", "200, John", "150, Ted"})
    public void depositAndNameTest(double amount, String name, BankAccount bankAccount) {
        bankAccount.deposit(amount);
        bankAccount.setHolderName(name);

        assertEquals(amount, bankAccount.getBalance());
        assertEquals(name, bankAccount.getHolderName());
    }

    // parameterized test with csv file source
    @ParameterizedTest
    @CsvFileSource(resources = "/details.csv")
    public void depositAndNameTestWithCsvFile(double amount, String name, BankAccount bankAccount) {
        bankAccount.deposit(amount);
        bankAccount.setHolderName(name);

        assertEquals(amount, bankAccount.getBalance());
        assertEquals(name, bankAccount.getHolderName());
    }
}
