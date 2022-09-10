package com.homework;

import java.io.FileReader;
import java.io.IOException;
import java.util.Properties;

public class FileHomeWork03 {
    public static void main(String[] args) throws IOException {
        Properties ps = new Properties();
        ps.load(new FileReader("src\\com\\homework\\dog.properties"));
        ps.list(System.out);
        System.out.println(ps.getProperty("name"));
    }
}

class dog{
    private String name;
    private int age;
    private String color;

    public dog(String name, int age, String color) {
        this.name = name;
        this.age = age;
        this.color = color;
    }
}