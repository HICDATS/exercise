package com.pta;

import java.util.Scanner;

public class Bmi {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        double weight = input.nextDouble();
        double height = input.nextDouble();
        double bml;
        if (height > 2.72 || height <= 0 || weight > 727 || weight <= 0){
            System.out.println("input out of range");
        }else{
            bml = weight / Math.pow(height,2);
            if(bml<18.5){
                System.out.println("thin");
            } else if (bml<24) {
                System.out.println("fit");
            } else if (bml<28) {
                System.out.println("overweight");
            }else{
                System.out.println("fat");
            }
        }
    }
}
