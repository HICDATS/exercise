package com.pta.homework10;

import sun.awt.windows.ThemeReader;

import java.util.Scanner;

public class CountDown {
    public static void main(String[] args) {
        CountDown_ countDown_ = new CountDown_();
        Scanner input = new Scanner(System.in);
        int num = input.nextInt();
        countDown_.setNum(num);
        Thread thread = new Thread(countDown_);
        thread.start();
    }

}

class CountDown_ implements Runnable{
    private int num;

    public CountDown_() {
    }

    public CountDown_(int num) {
        this.num = num;
    }

    public void setNum(int num) {
        this.num = num;
    }

    @Override
    public void run() {
        while(num >= 0){
            System.out.println(num--);
            try {
                Thread.sleep(500);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
    }
}