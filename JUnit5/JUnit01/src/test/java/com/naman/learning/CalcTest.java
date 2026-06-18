package com.naman.learning;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class CalcTest {

    @Test
    public void test(){
        Calc c = new Calc();
        int ActualResult = c.divide(10, 5);
        int expectedResult = 2;
        assertEquals(expectedResult, ActualResult);
    }
}
