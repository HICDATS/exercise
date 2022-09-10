package com.pta.homework08;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;

public class CompanyManage {
    public static void main(String[] args) {
        work[] ws = new work[5];
        ws[0] = new work(1,500,400,"职工1","female");
        ws[1] = new work(2,400,600,"职工2","female");
        ws[2] = new work(3,600,300,"职工3","male");
        ws[3] = new work(4,800,200,"职工4","female");
        ws[4] = new work(5,500,700,"职工5","male");
        Arrays.sort(ws);
        System.out.println("编号,团险,个险,姓名,性别");
        for (int i = 0; i < ws.length; i++) {
            System.out.printf("%d,%d,%d,%s,%s\n",ws[i].getId(),ws[i].getTeam(),ws[i].getPersonal(),
                    ws[i].getName(),ws[i].getSex());
        }
        ArrayList<work> works = new ArrayList<>();
        for (int i = 0; i < ws.length; i++) {
            works.add(ws[i]);
        }
        works.sort(new compare());
        System.out.println("编号,团险,个险,姓名,性别");
        for (int i = 0; i < works.size(); i++) {
            System.out.printf("%d,%d,%d,%s,%s\n",works.get(i).getId(),works.get(i).getTeam(),works.get(i).getPersonal(),
                    works.get(i).getName(),works.get(i).getSex());
        }
    }
}

class work implements Comparable<work>{
    private int id;
    private String name;
    private String sex;
    private int team;
    private int personal;


    public work() {
    }

    public work(int id, int team, int personal,String name, String sex ) {
        this.id = id;
        this.name = name;
        this.sex = sex;
        this.team = team;
        this.personal = personal;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSex() {
        return sex;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }

    public int getTeam() {
        return team;
    }

    public void setTeam(int team) {
        this.team = team;
    }

    public int getPersonal() {
        return personal;
    }

    public void setPersonal(int personal) {
        this.personal = personal;
    }

    @Override
    public int compareTo(work o) {
        return (this.getTeam()+this.getPersonal()) - (o.getTeam() + o.getPersonal());
    }
}

class compare implements Comparator<work>{
    @Override
    public int compare(work o1, work o2) {
        return o1.getTeam() - o2.getTeam();
    }
}