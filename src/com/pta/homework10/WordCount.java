package com.pta.homework10;

import java.util.*;

public class WordCount {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String s = null;
        HashSet<String> strings = new HashSet<>();
        int count = 0;
        while(!(s = input.next().toLowerCase()).equals("!!!!!")){
            if (!strings.contains(s)){
                strings.add(s);
                count++;
            }
        }

        System.out.println(count);
    }
}
