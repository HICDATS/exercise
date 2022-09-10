package com.pta.homework09;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Objects;
import java.util.Scanner;

public class PersonOverrideClass {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int n1 = input.nextInt();
        ArrayList<PersonOverride> personOverrides1 = new ArrayList<>();
        for (int i = 0; i < n1; i++) {
            personOverrides1.add(new PersonOverride());
        }
        int n2 = input.nextInt();
        ArrayList<PersonOverride> personOverrides2 = new ArrayList<>();
        for (int i = 0; i < n2; i++) {
            String name = input.next();
            int age = input.nextInt();
            boolean gender = input.nextBoolean();
            if(!personOverrides2.contains(new PersonOverride(name,age,gender))){
                personOverrides2.add(new PersonOverride(name,age,gender));
            }
        }
        for(PersonOverride p: personOverrides1){
            System.out.println(p);
        }
        for(PersonOverride p:personOverrides2){
            System.out.println(p);
        }
        System.out.println(personOverrides2.size());
        System.out.println(Arrays.toString(PersonOverride.class.getConstructors()));
    }
}

class PersonOverride{
    private String name;
    private int age;
    private boolean gender;

    public PersonOverride() {
        this("default",1,true);
    }

    public PersonOverride(String name, int age, boolean gender) {
        this.name = name;
        this.age = age;
        this.gender = gender;
    }



    @Override
    public String toString() {
        return String.format("%s-%d-%b",this.name,this.age,this.gender);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        PersonOverride that = (PersonOverride) o;
        return age == that.age && gender == that.gender && Objects.equals(name, that.name);
    }
}