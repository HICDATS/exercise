package com.pta;

import java.util.Scanner;

public class MaxAndMin {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int[] arr = new int[10];
        int max_;
        int min_;
        int evenCount = 0;
        double evenSum = 0.0;
        for (int i = 0; i < arr.length; i++) {
            arr[i] = input.nextInt();
        }
        max_ = arr[0];
        min_ = arr[0];
        for (int i = 0; i < arr.length; i++) {
            if(max_ < arr[i]){
                max_ = arr[i];
            }
            if(min_ > arr[i]){
                min_ = arr[i];
            }
            if(arr[i] % 2 == 0){
                evenCount += 1;
                evenSum += arr[i];
            }
        }
        System.out.println("最大值是" + max_);
        System.out.println("最小值是" + min_);
        System.out.println("偶数的个数是" + evenCount);
        if(evenCount == 0){
            System.out.println("偶数的平均值是0");
        }
        else{
            System.out.println("偶数的平均值是" + String.format("%.1f",evenSum / evenCount));
        }
    }
}
