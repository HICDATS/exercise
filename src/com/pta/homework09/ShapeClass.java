package com.pta.homework09;

import java.util.Scanner;

public class ShapeClass {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int n = input.nextInt();
        Shape[] sArr = new Shape[n];
        String select;
        for (int i = 0; i < n; i++) {
            select = input.next();
            if(select.equals("rect")){
                int width = input.nextInt();
                int length = input.nextInt();
                Rectangle rectangle = new Rectangle(width, length);
                sArr[i] = rectangle;
            } else if (select.equals("cir")) {
                int r = input.nextInt();
                Circle circle = new Circle(r);
                sArr[i] = circle;
            }
        }
        System.out.println(sumAllPerimeter(sArr));
        System.out.println(sumAllArea(sArr));
        System.out.print("[");
        for (int i = 0; i < sArr.length; i++) {
            if(i != 0){
                System.out.print(", ");
            }
            System.out.print(sArr[i]);
        }
        System.out.println("]");
        for(Shape s:sArr){
            System.out.println(s.getClass()+","+s.getClass().getSuperclass());
        }
    }

    static double sumAllArea(Shape[] sArr){
        double sum = 0;
        for(Shape temp : sArr){
            sum += temp.getArea();
        }
        return sum;
    }

    static double sumAllPerimeter(Shape[] sArr){
        double sum = 0;
        for(Shape temp : sArr){
            sum += temp.getPerimeter();
        }
        return sum;
    }
}

abstract class Shape{
    double PI = 3.14;
    abstract public double getPerimeter();
    abstract public double getArea();
}

class Rectangle extends Shape{
    private int width;
    private int length;

    public Rectangle(int width, int length) {
        this.width = width;
        this.length = length;
    }

    @Override
    public double getPerimeter() {
        return 2 * (width + length);
    }

    @Override
    public double getArea() {
        return width * length;
    }

    @Override
    public String toString() {
        return "Rectangle [" +
                "width=" + width +
                ", length=" + length +
                ']';
    }
}

class Circle extends Shape{
    private int radius;

    public Circle(int radius) {
        this.radius = radius;
    }

    @Override
    public double getPerimeter() {
        return 2 * PI * radius;
    }

    @Override
    public double getArea() {
        return PI * Math.pow(radius,2);
    }

    @Override
    public String toString() {
        return "Circle [" +
                "radius=" + radius +
                ']';
    }
}