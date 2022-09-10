package com.pta;

import java.util.Scanner;

public class Loading {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String user = input.next();
        String password = input.next();
        if("SwpuIot".equals(user)){
            if("123456".equals(password)){
                System.out.println("Welcome");
            }
            else{
                System.out.println("Mismatch");
            }
        }
        else{
            System.out.println("NotExist");
        }
    }
}
