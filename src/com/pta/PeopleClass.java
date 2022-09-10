package com.pta;

public class PeopleClass {
    public static void main(String[] args) {
        People san = new People("张三", 18);
        san.talk();

    }
}

class People{
    private String name;
    private int age;

    public People(String name, int age) {
        this.name = name;
        this.age = age;
    }
    public void talk(){
        System.out.println(String.format("我是：%s，今年：%d岁\n",name,age));
    }
}