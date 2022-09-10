package com.pta;

import java.util.Scanner;

public class VehicleClass {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String kind;
        double speed;
        String color;
        kind = input.next();
        speed = input.nextInt();
        color = input.next();
        Vehicle v1 = new Vehicle(kind, speed, color);
        System.out.println("第一辆是"+v1.getKind()+"，时速为"+v1.getSpeed()+"km/h，颜色为"+v1.getColor());
        kind = input.next();
        speed = input.nextInt();
        color = input.next();
        Vehicle v2 = new Vehicle(kind, speed, color);
        System.out.println("第二辆是"+v2.getKind()+"，时速为"+v2.getSpeed()+"km/h，颜色为"+v2.getColor());


    }
}

class Vehicle{
    private String kind;
    private double speed;
    private String color;

    public Vehicle(String kind, double speed, String color) {
        this.kind = kind;
        this.speed = speed;
        this.color = color;
    }

    public String getKind() {
        return kind;
    }

    public void setKind(String kind) {
        this.kind = kind;
    }

    public double getSpeed() {
        return speed;
    }

    public void setSpeed(int speed) {
        this.speed = speed;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

}