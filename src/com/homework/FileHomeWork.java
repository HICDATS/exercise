package com.homework;

import java.io.*;

public class FileHomeWork {
    public static void main(String[] args) throws IOException {
        File file= new File("e:\\mytemp");
        if(!file.exists()){
            file.mkdir();
        }
        String filePath = "hello.txt";
        File file2 = new File(file,filePath);
        if(file2.exists()){
            System.out.println("该文件已存在！");
        }else{
            file2.createNewFile();
        }
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(file2));
        bufferedWriter.write("hello,word好家伙~");
        bufferedWriter.close();

    }
}
