package com.naman.learning.SpringBootDemo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;


@Component
public class Dev {

    // Constructor Autowiring

    // Laptop laptop;
    DellLaptop dell;
    HpLaptop hp;
    @Autowired
    public Dev(DellLaptop dell, HpLaptop hp){
        this.dell = dell;
        this.hp = hp;
    }

    // Setter Autowiring

    // Laptop laptop;
    // @Autowired
    // public void setLaptop(Laptop laptop){
    //     this.laptop = laptop;
    // }

    // field Autowiring
    // @Autowired
    // public Laptop laptop;
    
    public void build(){
        dell.compile();
        hp.compile();
        System.out.println("working on Awesome Project");
    }
}
