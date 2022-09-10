package com.pta.text01;

import java.util.Scanner;

public class EmployeeClass {
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        Employee [] e=new Employee[3];
        e[0]=new SalariedEmployee(in.next(),in.next(),in.nextDouble());
        e[1]=new HourlyEmployee(in.next(),in.next(),in.nextDouble(),in.nextDouble());
        e[2]=new CommissionEmployee(in.next(),in.next(),in.nextDouble(),in.nextDouble());
        for(int i=0;i<e.length;i++)
        {
            System.out.println(e[i].getSalary());
            System.out.println(e[i]);
        }
    }
}

abstract class Employee{
    protected String name;
    protected String id;

    public Employee(String name, String id) {
        this.name = name;
        this.id = id;
    }
    abstract public double getSalary();
}

class SalariedEmployee extends Employee{

    private double monthSal;

    public SalariedEmployee(String name, String id,double monthSal) {
        super(name, id);
        this.monthSal = monthSal;
    }

    public double getSalary() {
        return monthSal;
    }

    public void setMonthSal(double monthSal) {
        this.monthSal = monthSal;
    }

    @Override
    public String toString() {
        return String.format("SalariedEmployee[name=%s,id=%s][monthSalary=%.1f]",
                this.name,this.id,this.monthSal);
    }
}

class HourlyEmployee extends Employee{

    private double hourSal;
    private double hours;

    public HourlyEmployee(String name, String id, double hourSal, double hours) {
        super(name, id);
        this.hourSal = hourSal;
        this.hours = hours;
    }

    public double getHourSal() {
        return hourSal;
    }

    public void setHourSal(double hourSal) {
        this.hourSal = hourSal;
    }

    public double getHours() {
        return hours;
    }

    public void setHours(int hours) {
        this.hours = hours;
    }

    public double getSalary(){
        return this.hourSal * this.hours;
    }

    @Override
    public String toString() {
        return String.format("HourlyEmployee[name=%s,id=%s][hourSalary=%.1f,workhour=%.1f]",
                this.name,this.id,this.hourSal,this.hours);
    }
}


class CommissionEmployee extends Employee{
    private double ratio;
    private double salSum;

    public CommissionEmployee(String name, String id, double ratio, double salSum) {
        super(name, id);
        this.ratio = ratio;
        this.salSum = salSum;
    }

    public double getRatio() {
        return ratio;
    }

    public void setRatio(double ratio) {
        this.ratio = ratio;
    }

    public double getSalSum() {
        return salSum;
    }

    public void setSalSum(double salSum) {
        this.salSum = salSum;
    }

    public double getSalary(){
        return this.salSum * this.ratio;
    }

    @Override
    public String toString() {
        return String.format("CommissionEmployee[name=%s,id=%s][commissionRatio=%.1f,sale=%.1f]",
                this.name,this.id,this.ratio,this.salSum);
    }
}