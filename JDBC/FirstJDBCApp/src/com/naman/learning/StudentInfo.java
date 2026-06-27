package com.naman.learning;

import java.util.Scanner;

class Student{
    private int id;
    private String name;
    private int age;
    private String city;

    public Student(int id, String name, int age, String city){
        this.id = id;
        this.name = name;
        this.age = age;
        this.city = city;
    }

    public int getId(){
        return id;
    }

    public String getName(){
        return name;
    }

    public int getAge(){
        return age;
    }

    public String getCity(){
        return city;
    }

};
public class StudentInfo {
    public static Student getStudentDetails(Scanner sc){

        System.out.print("Enter Id : ");
        int id = sc.nextInt();
        sc.nextLine();

        System.out.print("Enter Name: ");
        String name = sc.nextLine();

        System.out.print("Enter Age : ");
        int age = sc.nextInt();
        sc.nextLine();

        System.out.print("Enter City : ");
        String city = sc.nextLine();

        return new Student(id, name, age, city);
    }
}
