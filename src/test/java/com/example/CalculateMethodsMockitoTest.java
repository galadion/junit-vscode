package com.example;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.junit.jupiter.MockitoExtension;
import org.mockito.Mock;
import org.mockito.Mockito;

import static org.junit.jupiter.api.Assertions.assertEquals;

@ExtendWith(MockitoExtension.class)
public class CalculateMethodsMockitoTest {

    //this is a mocked object example
    @Mock
    CalculateMethods calculateMethods;

    @BeforeEach
    public void setupMocks() {
        //specify what needs to be done for certain actions
        //here means whenever divide method is called with param 6 and 3
        //it will return a mocked response of 2.0
        Mockito.when(calculateMethods.divide(6, 3)).thenReturn(2.0);
    }

    @Test
    public void testDivide() {
        assertEquals(2.0, calculateMethods.divide(6, 3));
    }
}
