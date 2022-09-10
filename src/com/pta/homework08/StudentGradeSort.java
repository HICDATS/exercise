package com.pta.homework08;

import java.util.*;

public class StudentGradeSort {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String info = null;
        String[] infoArr;
        ArrayList<Student> students = new ArrayList<>();
        HashMap<String, Double> hashMap = new HashMap<>();
        while(!(info = input.next()).equals("exit")){
            infoArr = info.split(",");
            if(hashMap.isEmpty() || !hashMap.containsKey((infoArr[0] + "," +infoArr[1]))){
                hashMap.put(infoArr[0] + "," +infoArr[1],Double.parseDouble(infoArr[3]));
            }else{
                hashMap.put(infoArr[0] + "," +infoArr[1], hashMap.get(infoArr[0] + "," +infoArr[1]) +
                        Double.parseDouble(infoArr[3]));
            }
        }
        Set set = hashMap.keySet();
        for (Object s : set){
            String[] temp = ((String)s).split(",");
            students.add(new Student(Double.parseDouble(temp[1]),temp[0],hashMap.get((String)s)));
        }
        students.sort(new Comparator<Student>() {
            @Override
            public int compare(Student o1, Student o2) {
                if(o1.getGrade() < o2.getGrade()){
                    return 1;
                } else if (o1.getGrade() > o2.getGrade()) {
                    return -1;
                }else{
                    if(o1.getId() >o2.getId()){
                        return 1;
                    } else if(o1.getId() < o2.getId()){
                        return -1;
                    }else {
                        return 0;
                    }
                }
            }
        });

        int no = 0;
        for(Student s:students){
            System.out.println(String.format("No%d:%.0f,%s",++no,s.getId(),s.getName()));
        }
    }
}

class Student{
    private Double id;
    private String name;
    private Double grade;

    public Double getGrade() {
        return grade;
    }

    public Double getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public Student(Double id, String name, Double grade) {
        this.id = id;
        this.name = name;
        this.grade = grade;
    }
}