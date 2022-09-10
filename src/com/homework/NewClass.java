package com.homework;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;

@SuppressWarnings("all")
public class NewClass {
    public static void main(String[] args) {
        New new1 = new New("新冠确诊病例超千万，数百万印度教信徒赴恒河\"圣浴\"引民众担忧");
        New new2 = new New("男子突然想起两个月前钓的鱼还在网兜里，捞起来一看赶紧放生");
        ArrayList arrayList = new ArrayList();
        arrayList.add(new1);
        arrayList.add(new2);
        Collections.reverse(arrayList);
        for(Object o:arrayList){
            New n = (New)o;
            if(n.getTitle().length()>15){
                System.out.println(n.getTitle().substring(0,16) + "...");
            }else{
                System.out.println(n);
            }
        }
    }
}

class New{
    private String title;
    private String content;

    public New(String title) {
        this.title = title;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    @Override
    public String toString() {
        return title;
    }
}