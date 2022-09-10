package com.pta;

import java.util.Scanner;

public class BankAccountClass {
    public static void main(String[] args) {
        int a;
        int b;
        int c;
        Scanner input = new Scanner(System.in);
        a = input.nextInt();
        b = input.nextInt();
        c = input.nextInt();
        BankAccount bankAccount = new BankAccount(a);
        System.out.println(bankAccount.getBalance());
        bankAccount.withdraw(b);
        System.out.println(bankAccount.getBalance());
        bankAccount.deposit(c);
        System.out.println(bankAccount.getBalance());
    }
}

class BankAccount{
    private int balance;
    public BankAccount(){
        this.balance = 0;
    }
    public BankAccount(int balance){
        this.balance = balance;
    }
    public int getBalance(){
        return this.balance;
    }
    public void withdraw(int amount){
        this.balance -= amount;
    }
    public void deposit(int amount){
        this.balance += amount;
    }
}
