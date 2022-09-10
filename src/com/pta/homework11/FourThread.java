package com.pta.homework11;

public class FourThread {
    public static void main(String[] args) {
        Thread thread = new Thread(new Run());
        thread.start();
    }
}

class First implements Runnable {
    private int num = 0;

    @Override
    public void run() {
        for (int i = 1; i <= 25; i++) {
            num += i;
        }
    }

    public int getNum() {
        return num;
    }
}

class Second implements Runnable {
    private int num = 0;

    @Override
    public void run() {
        for (int i = 26; i <= 50; i++) {
            num += i;
        }
    }

    public int getNum() {
        return num;
    }
}

class Third implements Runnable {
    private int num = 0;

    @Override
    public void run() {
        for (int i = 51; i <= 75; i++) {
            num += i;
        }
    }

    public int getNum() {
        return num;
    }
}

class Fourth implements Runnable {
    private int num = 0;

    @Override
    public void run() {
        for (int i = 76; i <= 100; i++) {
            num += i;
        }
    }

    public int getNum() {
        return num;
    }
}

class Run implements Runnable{

    @Override
    public void run() {
        First first = new First();
        Second second = new Second();
        Third third = new Third();
        Fourth fourth = new Fourth();

        Thread thread1 = new Thread(first);
        Thread thread2 = new Thread(second);
        Thread thread3 = new Thread(third);
        Thread thread4 = new Thread(fourth);
        thread1.start();
        try {
            thread1.join();
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        thread2.start();
        try {
            thread2.join();
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        thread3.start();
        try {
            thread3.join();
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        thread4.start();
        try {
            thread4.join();
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }

        System.out.println(first.getNum()+ second.getNum()+ third.getNum()+ fourth.getNum());
    }
}