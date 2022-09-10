package com.pta.experiment05;

import java.util.Scanner;

public class StringNum {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String s = null;
        while(!(s = input.nextLine()).equals("end")){
            System.out.println(new CountNum().count(s));
        }
    }
}

class CountNum{
    int num = 0;
    public int count(String s){
        for (int i = 0; i < s.length(); i++) {
            if(Character.isDigit(s.charAt(i))){
                num += Integer.parseInt(s.charAt(i)+"");
            }
        }
        return num;
    }
}