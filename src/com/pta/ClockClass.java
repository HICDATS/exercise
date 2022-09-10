package com.pta;
import java.util.Scanner;

public class ClockClass {
    public static void main(String[] args) {
        MyClock clock1,clock2;
        clock1 = new MyClock();
        clock2 = new MyClock();
        //输入一个时间：时 分 秒
        Scanner sc = new Scanner(System.in);
        int hour,minute,second;
        System.out.println("输入一个时间：（时 分 秒用空格分隔）");
        hour = sc.nextInt();
        minute = sc.nextInt();
        second = sc.nextInt();
        //用输入的时间设置时间对象clock1
        clock1.setClock(hour,minute,second);
        //显示两个时间对象
        clock1.display();
        clock2.display();
    }
}

class MyClock {
    //数据成员：hour minute second
    private int hour;
    private int minute;
    private int second;
    //方法成员:设置时间
    public void setClock(int hour,int minute,int second) {
        this.hour = hour;
        this.minute = minute;
        this.second = second;
    }
    //方法成员: 显示时间
    public void display() {
        System.out.println(String.format("%2d:%2d:%2d",hour,minute,second));
    }
}