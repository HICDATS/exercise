package com.pta.homework06;

import java.util.Scanner;

public class FanClass {
    public static void main(String[] args) {
        Fan fan = new Fan();
        int speed;
        boolean on;
        double radius;
        String color;
        Scanner input = new Scanner(System.in);
        speed = input.nextInt();
        on = input.nextBoolean();
        radius = input.nextDouble();
        color = input.next();
        Fan myFan = new Fan(speed, on, radius, color);
        System.out.println("-------\nDefault\n-------");
        System.out.println(fan);
        System.out.println("-------\nMy Fan\n-------");
        System.out.println(myFan);
    }
}

class Fan{
    private final int SLOW = 1;
    private final int MEDIUM = 2;
    private final int FAST = 3;
    private int speed = SLOW;
    private boolean on = false;
    private double radius = 5;
    private String color = "white";

    public Fan(){

    }

    public Fan(int fanSpeed,boolean fanOn,double fanRadius,String fanColor){
        this.speed = fanSpeed;
        this.on = fanOn;
        this.radius = fanRadius;
        this.color = fanColor;
    }


    public int getSpeed() {
        return speed;
    }

    public void setSpeed(int speed) {
        this.speed = speed;
    }

    public boolean isOn() {
        return on;
    }

    public void setOn(boolean on) {
        this.on = on;
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String toString(){
        if(!this.on){
            return String.format("speed %d\ncolor %s\nradius %.1f\nfan is off",
                    this.speed,this.color,this.radius);
        }else{
            return String.format("speed %d\ncolor %s\nradius %.1f\nfan is on",
                    this.speed,this.color,this.radius);
        }
    }
}
