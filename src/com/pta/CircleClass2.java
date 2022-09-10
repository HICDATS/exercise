package com.pta;

import java.util.Scanner;

public class CircleClass2 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        double r1;
        double r2;
        r1 = input.nextDouble();
        r2 = input.nextDouble();
        Circle2 circle1 = new Circle2(r1);
        Circle2 circle2 = new Circle2(r2);
        circle1.printArea();
        circle2.printArea();
    }
}

class Circle2{
    private double r;
    public void printArea(){
        System.out.printf("%.2f\n",Math.PI * Math.pow(r,2));
    }

    public Circle2(double r) {
        this.r = r;
    }
}