package com.pta.homework11;

import java.util.Scanner;

public class Revise {
    public static void main(String[] args) {
        Thread t = new Thread(new RunHandler());
        t.start();
    }
}

class RunHandler implements Runnable{
    public void run(){
        Scanner in = new Scanner(System.in);
        int x = in.nextInt();
        while(x-- != 0){
        System.out.println("run");
        }
    }
}