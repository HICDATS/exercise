package com.pta.homework07;

import java.util.Scanner;

public class UndergraduateClass {
    public static void main(String[] args) {
        String name;
        int age;
        String major;
        Scanner input = new Scanner(System.in);
        name  = input.next();
        age = input.nextInt();
        Student student = new Student(name, age);
        name  = input.next();
        age = input.nextInt();
        major = input.next();
        Undergraduate undergraduate = new Undergraduate(name, age, major);
        student.show();
        undergraduate.show();
    }
}

class Student{
    protected String name;
    protected int age;

    public Student(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public void show(){
        System.out.println(String.format("Student[name=%s,age=%d]",this.name,this.age));
    }
}

class Undergraduate extends Student{
    private String major;

    public Undergraduate(String name, int age, String major) {
        super(name, age);
        this.major = major;
    }

    public void show(){
        System.out.println(String.format("Undergraduate[name=%s,age=%d,major=%s]",this.name,this.age,this.major));
    }
}