package com.homework;

import java.io.*;

public class FileHomeWork02 {
    public static void main(String[] args) throws IOException {
        String filePath = "e:\\hao.txt";
        InputStreamReader isr = new InputStreamReader(new FileInputStream(filePath),"gbk");
        BufferedReader bufferedReader = new BufferedReader(isr);
        String s = null;
        int num = 0;
        while((s = bufferedReader.readLine()) != null){
            System.out.print(++num + ". ");
            System.out.println(s);
        }
    }
}
