package com.pta.homework11;

public class ClassNameInterface {
    public static void main(String[] args) {
        System.out.println((new Company()).getClassName());
    }
}

interface ClassName{
    public String getClassName();
}

class Company implements ClassName{

    @Override
    public String getClassName() {
        return getClass().toString().split(" ")[1];
    }
}