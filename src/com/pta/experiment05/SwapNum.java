package com.pta.experiment05;

import java.util.Scanner;

public class SwapNum {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String num = input.nextLine();
        String[] numArr = num.split(" ");
        int maxIndex = 0;
        int minIndex = 0;
        for (int i = 0; i < numArr.length; i++) {
            if(Integer.parseInt(numArr[maxIndex]) < Integer.parseInt(numArr[i])){
                maxIndex = i;
            }
            if(Integer.parseInt(numArr[minIndex]) > Integer.parseInt(numArr[i])){
                minIndex = i;
            }
            System.out.println(numArr[i]);
        }
        String temp = null;
        temp = numArr[maxIndex];
        numArr[maxIndex] = numArr[0];
        numArr[0] = temp;

        temp = numArr[minIndex];
        numArr[minIndex] = numArr[numArr.length - 1];
        numArr[numArr.length - 1] = temp;

        for (int i = 0; i < numArr.length; i++) {
            System.out.println(numArr[i]);
        }

    }
}
