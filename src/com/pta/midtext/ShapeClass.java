package com.pta.midtext;

import java.util.Scanner;

public class ShapeClass {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        double a = input.nextDouble();
        double b = input.nextDouble();
        Oval oval = new Oval(a, b);
        System.out.println("The area of " + oval + " is " + oval.area());
        System.out.printf("The perimeterof " + oval + " is " + oval.perimeter());
    }
}

abstract class Shape{
    protected final double PI = 3.1415926;
    abstract double area();
    abstract double perimeter();

}


class Oval extends Shape{
    private double a;
    private double b;

    public Oval() {
        this.a = 0;
        this.b = 0;
    }

    public Oval(double a, double b) {
        this.a = a;
        this.b = b;
    }

    @Override
    double area() {
        return PI * a * b;
    }

    @Override
    double perimeter() {
        return PI * Math.pow(2 * (Math.pow(a,2) + Math.pow(b,2)) , 0.5);//π√[2(a^2+b^2)]
    }

    @Override
    public String toString() {
        return String.format("Oval(a:%.1f,b:%.1f)",a,b);
    }
}