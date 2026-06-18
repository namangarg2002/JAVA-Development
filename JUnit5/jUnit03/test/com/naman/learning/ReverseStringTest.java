package com.naman.learning;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

public class ReverseStringTest {
    
    @Test
    public void test(){
        ReverseString reverse = new ReverseString();

        assertEquals("avaJ", reverse.reverseString("Java"));
        assertEquals("namaN", reverse.reverseString("Naman"));

    }
}