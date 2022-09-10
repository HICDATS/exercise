package com.pta.homework08;

import java.util.Scanner;

public class StringFormat {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String info = null;
        boolean flag = true;
        while(input.hasNext()){
            info = input.nextLine();
            switch (info){
                case "double":
                    double d1 = input.nextDouble();
                    double d2 = input.nextDouble();
                    double d3 = input.nextDouble();
                    String t = input.nextLine();
                    System.out.println("choice=double");
                    System.out.printf("%.2f , %.2f,%.2f\n",d1,d2,d3);
                    break;

                case "int":
                    int i1 = input.nextInt();
                    int i2 = input.nextInt();
                    int i3 = input.nextInt();
                    t = input.nextLine();
                    System.out.println("choice=int");
                    System.out.printf("%d\n",i1 + i2 + i3);
                    break;

                case "str":
                    String s1 = input.next();
                    String s2 = input.next();
                    String s3 = input.next();
                    t = input.nextLine();
                    System.out.println("choice=str");
                    System.out.print(s3);
                    System.out.print(s2);
                    System.out.println(s1);
                    break;

                case "line":
                    s1 = input.nextLine();
                    //t = input.nextLine();
                    System.out.println("choice=line");
                    System.out.println(s1.toUpperCase());
                    break;

                default:
                    //flag = false;
                    System.out.printf("choice=%s\n",info);
                    System.out.println("other");
                    break;
            }
        }
    }
}
