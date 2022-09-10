package com.pta.experiment01;

import java.util.Scanner;

public class BookInformation {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String booksArr = input.nextLine();
        String[] books = booksArr.split("；");
        Integer priceNum = 0;
        for(String book : books){
            String[] temp = book.split("：");
            StringBuffer stringBuffer = new StringBuffer(temp[1]);
            int index;
            if((index = stringBuffer.indexOf(" ")) != -1){
                stringBuffer.deleteCharAt(index);
            }
            temp[1] = stringBuffer.toString();
            priceNum += Integer.parseInt(temp[1]);
            System.out.println(temp[0] + "--" + temp[1].trim());
        }
        System.out.println("总价格--" + priceNum);
    }
}
