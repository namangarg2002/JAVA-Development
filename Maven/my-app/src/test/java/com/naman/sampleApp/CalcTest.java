package com.naman.sampleApp;
import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;


public class CalcTest {

    @Test
    void testCalc(){
        Calc calc=new Calc();
        int actualResult=calc.divide(10, 5);
        int expectedResult=2;

        assertEquals(expectedResult, actualResult);
    }
}
