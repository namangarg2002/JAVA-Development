package com.naman.learning;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

public class ShapesTest {
    
    @Test
    void testCmputeSquareArea(){
        Shapes shape = new Shapes();
        assertEquals(576, shape.computeSquareArea(24));
    }

    @Test
    void testCmputeCircleArea(){
        Shapes shape = new Shapes();
        assertEquals(314, shape.computeCircleArea(10));
    }
}
