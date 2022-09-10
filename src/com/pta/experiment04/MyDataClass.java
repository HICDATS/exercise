package com.pta.experiment04;

import java.util.Scanner;

public class MyDataClass {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int year;
        int month;
        int day;
        year = input.nextInt();
        month = input.nextInt();
        day = input.nextInt();
        MyData oldData = new MyData(year, month, day);

        year = input.nextInt();
        month = input.nextInt();
        day = input.nextInt();
        MyData newData = new MyData(year, month, day);
        System.out.print(oldData + " ");
        System.out.println(oldData.compare(newData));
    }
}
class MyData{
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

    public int compare(MyData d){
        String newTime = (new Integer(d.year)).toString() + (new Integer(d.month)).toString()
                + (new Integer(d.day)).toString();
        String oldTime = (new Integer(this.year)).toString() + (new Integer(this.month)).toString()
                + (new Integer(this.day)).toString();
        if(Integer.parseInt(oldTime) == Integer.parseInt(newTime)){
            return 0;
        } else if (Integer.parseInt(oldTime) > Integer.parseInt(newTime)) {
            return 1;
        }else{
            return -1;
        }
    }

    @Override
    public String toString() {
        return String.format("%d/%d/%d",this.month,this.day,this.year);
    }
}