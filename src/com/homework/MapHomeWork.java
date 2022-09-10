package com.homework;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

@SuppressWarnings("all")
public class MapHomeWork {
    public static void main(String[] args) {
        HashMap<String,Integer> hashMap = new HashMap<String,Integer>();
        hashMap.put("jack",650);
        hashMap.put("tom",1200);
        hashMap.put("smith",2900);
        hashMap.put("jack",100);
        Set<Map.Entry<String, Integer>> entries = hashMap.entrySet();
        for(Map.Entry<String, Integer> en:entries){

        }
//        for(Object o : set){
//            Map.Entry e = (Map.Entry)o;
//            //hashMap.put(e.getKey(),(int)e.getValue()+100);
//        }
//        for(Object o : set){
//            Map.Entry e = (Map.Entry)o;
//            System.out.println(e.getKey());
//        }
//        for(Object o : set){
//            Map.Entry e = (Map.Entry)o;
//            System.out.println(e.getValue());
//        }
        for(String s:hashMap.keySet()){
            System.out.println(s);
        }
    }
}
