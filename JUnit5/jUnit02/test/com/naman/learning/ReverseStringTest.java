package com.naman.learning;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class ReverseStringTest {
    
    @Test
    public void test(){
        ReverseString reverse = new ReverseString();

        String ActualResult = reverse.reverseString("Java");
        String ExpectedResult = "avaJ";

        assertEquals(ExpectedResult, ActualResult);

    }
}
