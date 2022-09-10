package com.pta;

import java.util.Scanner;

public class CircleClass {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        Circle circle1 = new Circle();
        System.out.println(circle1);
        System.out.printf("%.2f\n",circle1.getArea());
        Circle circle2 = new Circle();
        System.out.println(circle2);
        System.out.printf("%.2f\n",circle2.getArea());
        int r = input.nextInt();
        circle2.setRadius(r);
        System.out.println(circle2);
        System.out.printf("%.2f\n",circle2.getArea());
        r = input.nextInt();
        Circle circle3 = new Circle(r);
        System.out.println(circle3);
        System.out.printf("%.2f\n",circle3.getArea());

    }
}

class Circle{
    private int radius;
    public Circle(){
        this.radius = 2;
        System.out.println("This is a constructor with no para.");
    }

    public Circle(int radius) {
        if(radius <= 0){
            this.radius = 2;
        }
        else{
            this.radius = radius;
        }
        System.out.println("This is a constructor with para.");
    }

    public void setRadius(int radius) {
        if(radius <= 0){
            this.radius = 2;
        }
        else{
            this.radius = radius;
        }
    }

    public int getRadius() {
        return radius;
    }

    @Override
    public String toString() {
        return "Circle [" +
                "radius=" + radius +
                ']';
    }

    public double getArea(){
        return Math.PI * Math.pow(radius,2);
    }
}