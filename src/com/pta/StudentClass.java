package com.pta;

import java.util.Scanner;

public class StudentClass {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String name = input.next();
        int age = input.nextInt();
        String sex = input.next();
        Student student = new Student(name, sex, age);
        System.out.println(student);
    }
}

class Student{
    private String name;
    private String sex;
    private int age;

    public Student(String name, String sex, int age) {
        this.name = name;
        this.sex = sex;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSex() {
        return sex;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String toString() {
        return "Student [" +
                "name='" + name +
                "', sex='" + sex+
                "', age=" + age +
                ']';
    }
}