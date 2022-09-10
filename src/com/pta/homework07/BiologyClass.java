package com.pta.homework07;

import java.util.Scanner;

public class BiologyClass {
    public static void main(String[] args) {
        Pupil pupil = new Pupil();
        String school;
        Scanner input = new Scanner(System.in);
        school = input.next();
        pupil.setSchool(school);
        System.out.println("我的学校是" + pupil.getSchool());
        pupil.breathe();
        pupil.eat();
        pupil.sleep();
        pupil.think();
    }
}

interface Biology{
    void breathe();
}

interface Animal{
    void eat();
    void sleep();
}

class Person implements Biology,Animal{
    @Override
    public void breathe() {
        System.out.println("我喜欢呼吸新鲜空气");
    }

    @Override
    public void eat() {
        System.out.println("我会按时吃饭");
    }

    @Override
    public void sleep() {
        System.out.println("早睡早起身体好");
    }

    public void think(){
        System.out.println("我喜欢思考");
    }

}

class Pupil extends Person{
    private String school;

    public void setSchool(String school){
        this.school = school;
    }

    public String getSchool(){
        return this.school;
    }

}