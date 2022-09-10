package com.pta.experiment04;

import java.util.Scanner;

public class CheckPerson {
    public static void main(String[] args) {
        int arrLen;
        Scanner input = new Scanner(System.in);
        arrLen = input.nextInt();
        Person[] pArr= new Person[arrLen];
        String checkName;
        boolean flag = false;
        int index = -1;

        for (int i = 0; i < arrLen; i++) {
            String name;
            int age;
            name = input.next();
            age = input.nextInt();
            pArr[i] = new Person(name,age);
        }
        checkName = input.next();

        for (int i = 0; i < arrLen; i++) {
            System.out.println(pArr[i]);
            if(pArr[i].getName().equals(checkName)){
                flag = true;
                index = i;
            }
        }

        if(flag){
            System.out.println("查询结果：");
            System.out.println(pArr[index]);
        }else{
            System.out.println("not found");
        }
    }
}

class Person{
    private String name;
    private int age;

    public Person() {
        this.name = null;
        this.age = 1;
    }

    public Person(String name, int age) {
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

    @Override
    public String toString() {
        return "Person [name=" + name + ", age=" + age + "]";
    }
}