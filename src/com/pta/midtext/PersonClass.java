package com.pta.midtext;

import java.util.Scanner;

public class PersonClass {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int n = input.nextInt();
        int select;
        for (int i = 0; i < n; i++) {
            select = input.nextInt();
            if(select == 0){
                int id = input.nextInt();
                String name = input.next();
                int bir = input.nextInt();
                String major = input.next();
                double score = input.nextDouble();
                Student student = new Student(id, name, bir, major, score);
                System.out.println(student);
            } else if (select == 1) {
                int id = input.nextInt();
                String name = input.next();
                int bir = input.nextInt();
                String title = input.next();
                double salary = input.nextDouble();
                Teacher teacher = new Teacher(id, name, bir, title, salary);
                System.out.println(teacher);
            }
        }
    }
}

abstract class Person{
    int id;
    String name;
    int bir;

    public Person(int id, String name, int bir) {
        this.id = id;
        this.name = name;
        this.bir = bir;
    }
}

class Student extends Person{
    private String major;
    private double score;

    public Student(int id, String name, int bir, String major, double score) {
        super(id, name, bir);
        this.major = major;
        this.score = score;
    }

    @Override
    public String toString() {
        return "Student [" +
                "id=" + id +
                ", name=" + name +
                ", bir=" + bir +
                ", major=" + major +
                ", score=" + score +
                ']';
    }
}

class Teacher extends Person{
    private String title;
    private double salary;

    public Teacher(int id, String name, int bir, String title, double salary) {
        super(id, name, bir);
        this.title = title;
        this.salary = salary;
    }

    @Override
    public String toString() {
        return "Teacher [" +
                "id=" + id +
                ", name=" + name +
                ", bir=" + bir +
                ", title=" + title +
                ", salary=" + salary +
                ']';
    }
}