package com.pta.homework11;

import java.util.Scanner;

public class TeachetScore {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int n = input.nextInt();
        int m = input.nextInt();
        int[] sorce = new int[n];
        for (int i = 0; i < (n * m); i++) {
            sorce[i / m] += input.nextInt();
        }
        for (int i : sorce) {
            System.out.println(i);
        }
    }
}

