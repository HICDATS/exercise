package com.homework;

import java.util.ArrayList;
import java.util.Comparator;

public class EmployeeClassE {
    public static void main(String[] args) {
        EmployeeE xiaopan = new EmployeeE("xiaopan", 30000, 2001, 1, 22);
        EmployeeE xiaolou = new EmployeeE("xiaopan", 20000, 2002, 11, 23);
        EmployeeE xiaoye = new EmployeeE("xiaopan", 20100, 2001, 3, 21);
        ArrayList<EmployeeE> employeeES = new ArrayList<>();
        employeeES.add(xiaopan);
        employeeES.add(xiaolou);
        employeeES.add(xiaoye);
        employeeES.sort(new Comparator<EmployeeE>() {
            @Override
            public int compare(EmployeeE o1, EmployeeE o2) {
                if(o1.getName().compareTo(o2.getName()) > 0){
                    return 1;
                } else if (o1.getName().compareTo(o2.getName()) < 0) {
                    return 0;
                } else {
                   return o1.getBirthday().compareTo(o2.getBirthday());
                }
            }
        });
        for (EmployeeE employeeE : employeeES) {
            System.out.println(employeeE);
        }

    }
}

class EmployeeE{
    private String name;
    private int sal;
    private MyData birthday;

    public EmployeeE(String name, int sal, int year, int month, int day) {
        this.name = name;
        this.sal = sal;
        this.birthday = new MyData(year,month,day);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getSal() {
        return sal;
    }

    public void setSal(int sal) {
        this.sal = sal;
    }

    public MyData getBirthday() {
        return birthday;
    }

    public void setBirthday(MyData birthday) {
        this.birthday = birthday;
    }

    public String toString(){
        return name + " " + sal + " " +birthday;
    }
}

class MyData implements Comparable<MyData>{
    private int year;
    private int month;
    private int day;

    public MyData(int year, int month, int day) {
        this.year = year;
        this.month = month;
        this.day = day;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public int getMonth() {
        return month;
    }

    public void setMonth(int month) {
        this.month = month;
    }

    public int getDay() {
        return day;
    }

    public void setDay(int day) {
        this.day = day;
    }

    @Override
    public String toString() {
        return year + "-" +month + "-" +day;
    }

    @Override
    public int compareTo(MyData o) {
        String me = ((Integer)year).toString()+
                ((Integer)month).toString()+(Integer)day;
        String him = ((Integer) o.year).toString()+
                ((Integer)o.month).toString()+(Integer)o.day;
        if(Integer.parseInt(me) > Integer.parseInt(him)){
            return 1;
        } else if (Integer.parseInt(me) < Integer.parseInt(him)) {
            return -1;
        }else{
            return 0;
        }
    }
}
