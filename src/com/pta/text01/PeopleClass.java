package com.pta.text01;

public class PeopleClass {
    public static void main(String[] args) {
        People lili = new People("lili", 19);
        People lucy = new People("lucy", 20);
        System.out.println(String.format("this person is %s,her age is %s",lili.getName(),lili.getAge()));
        System.out.println(String.format("this person is %s,her age is %s",lucy.getName(),lucy.getAge()));
    }
}
class People{
    private String name;
    private int age;

    public People(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
}