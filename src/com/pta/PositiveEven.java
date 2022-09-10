package com.pta;

import java.util.Scanner;

public class PositiveEven {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int x  = input.nextInt();
        if(x < 2){
            return;
        }
        else{
            System.out.print(2);
        }
        for (int i = 4; i < x; i += 2) {
            System.out.print(","+i);
        }
    }
}
