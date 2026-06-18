package com.naman.learning;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

public class ReverseStringTest {
    
    @Test
    void testReverseString_SingleWord(){
        ReverseString reverse = new ReverseString();

        assertEquals("avaJ", reverse.reverseString("Java"));

    }

    @Test
    void testReverseString_Sentance(){
        ReverseString reverse = new ReverseString();

        assertEquals("dlroW olleH", reverse.reverseString("Hello World"));

    }
}