package com.naman.learning;

import java.util.Random;

public class RandomStudentGenerator {

    private static final Random random = new Random();

    private static String[] names = {
            "Naman","Rahul","Amit","Karan","Rohit",
            "Priya","Anjali","Neha","Aman","Vikas"
    };

    private static String[] cities = {
            "Delhi","Noida","Agra","Lucknow",
            "Hathras","Mumbai","Pune","Jaipur"
    };

    public static int getId(int i) {
        return 100000 + i;
    }

    public static String getName() {
        return names[random.nextInt(names.length)];
    }

    public static int getAge() {
        return 18 + random.nextInt(10);
    }

    public static String getCity() {
        return cities[random.nextInt(cities.length)];
    }
}