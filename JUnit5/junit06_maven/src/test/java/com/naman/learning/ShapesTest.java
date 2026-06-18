package com.naman.learning;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

public class ShapesTest {
    
    @Test
    void testComputeSquareArea(){
        Shapes shape = new Shapes();
        assertEquals(576, shape.computeSquareArea(24), "Expected 576");
    }

    @Test
    void testComputeCircleArea(){
        Shapes shape = new Shapes();
        assertEquals(315, shape.computeCircleArea(10), () -> "Expected 314");
    }
}
