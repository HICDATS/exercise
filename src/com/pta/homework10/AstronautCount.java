package com.pta.homework10;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.HashMap;
import java.util.Scanner;

public class AstronautCount {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String info = null;
        HashMap hashMap = new HashMap<String,Integer>();
        ArrayList<String> strings = new ArrayList<>();
        while(!(info = input.nextLine()).equals("end")){
            String[] s = info.split("\\s+");
            for(String st:s){
                if(!strings.contains(st)){
                    strings.add(st);
                }
                if(!hashMap.containsKey(st)){
                    hashMap.put(st,1);
                }else{
                    hashMap.put(st,(int)hashMap.get(st)+1);
                }
            }
            strings.sort(new Comparator<String>() {
                @Override
                public int compare(String o1, String o2) {
                    return o1.compareTo(o2);
                }
            });
        }
        for(String temp : strings){
            System.out.print(temp+ " ");
            System.out.println(hashMap.get(temp));
        }
    }
}
