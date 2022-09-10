package com.homework;

public class EmployeeHomeWork {
    public static void main(String[] args) {
        Manager dai = new Manager("呆头", 200, 27);
        Worker an = new Worker("小强", 120, 30);
        dai.printSal();
        an.printSal();

    }
}

class Employee{
    private String name;
    private double sal;
    private int days;

    public Employee(String name, double sal, int days) {
        this.name = name;
        this.sal = sal;
        this.days = days;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getSal() {
        return sal;
    }

    public void setSal(double sal) {
        this.sal = sal;
    }

    public int getDays() {
        return days;
    }

    public void setDays(int days) {
        this.days = days;
    }

    public void printSal(){

    }
}

class Manager extends Employee{
    public Manager(String name, double sal, int days) {
        super(name, sal, days);
    }
    public void printSal(){
        System.out.println(getName()+"经理的工资是"+(1000+getSal()*getDays()*1.2));
    }
}

class Worker extends Employee{
    public Worker(String name, double sal, int days) {
        super(name, sal, days);
    }

    public void printSal() {
        System.out.println(getName()+"员工的工资是"+(getSal()*getDays()));
    }
}