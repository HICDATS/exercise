package com.pta;

import java.util.Scanner;

public class TeacherClass {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int no;
        String name;
        int age;
        String seminary;
        no = input.nextInt();
        name = input.next();
        age = input.nextInt();
        seminary = input.next();
        Teacher t1 = new Teacher(no, name, age, seminary);
        System.out.println(t1);
        no = input.nextInt();
        name = input.next();
        age = input.nextInt();
        seminary = input.next();
        Teacher t2 = new Teacher(no, name, age, seminary);
        System.out.println(t2);
        System.out.println(t1.equals(t2));

    }
}

class Teacher{
    private int no;
    private String name;
    private int age;
    private String seminary;

    public Teacher(int no, String name, int age, String seminary) {
        this.no = no;
        this.name = name;
        this.age = age;
        this.seminary = seminary;
    }

    public int getNo() {
        return no;
    }

    public void setNo(int no) {
        this.no = no;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getSeminary() {
        return seminary;
    }

    public void setSeminary(String seminary) {
        this.seminary = seminary;
    }

    public boolean equals(Teacher t){
        return this.no == t.no;

    }

    @Override
    public String toString() {
        return "no: " + no +
                ", name:" + name +
                ", age: " + age +
                ", seminary: " + seminary;
    }
}