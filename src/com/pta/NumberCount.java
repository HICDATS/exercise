package com.pta;

import java.util.Scanner;

public class NumberCount {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int oddCount = 0;
        int evenCount = 0;
        int n = input.nextInt();
        for (int i = 2 , thisNum = 3; thisNum <= n; i++) {
            if(thisNum % 2 == 0){
                evenCount++;
            }
            else{
                oddCount++;
            }
            thisNum = i * 3;
        }
        System.out.println(String.format("%d,%d",oddCount,evenCount));
    }
}
