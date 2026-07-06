package com.naman.learning.SpringBootDemo;

import org.springframework.stereotype.Component;

@Component
public class DellLaptop extends Laptop {
    
    public void compile(){
        System.out.println("Compiling with DellLaptop");
    }
}
