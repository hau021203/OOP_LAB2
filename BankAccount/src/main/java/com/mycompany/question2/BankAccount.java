package com.mycompany.question2;
import java.util.*;
public class BankAccount {
    private int mAccNum;
    private String mName;
    private double mBalance;
    private double money;   
       
    public int getAccNum(){
        return mAccNum;       
    }
    public String getName(){
        return mName;
    }
    public double getBalance(){
        return mBalance;
    }
    public BankAccount(){} 
    public BankAccount(int mAccNum,String mName,double mBalance){
        this.mAccNum = mAccNum;
        this.mName = mName;
        this.mBalance = mBalance;
    } 
    public void deposit(double money){
        mBalance += money;
    }
    public boolean withdraw(double money){
        if(money > mBalance){
            return false;
        }else{
            mBalance -= money;
            return true;
        }
    }
    public boolean tranferMoney(BankAccount a,double money){
        if(money>a.mBalance)
            return false;
        else{
            this.mBalance -= money;
            a.mBalance += money;
            return true;
        }
    }
    public void input(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhap so tai khoan");
        mAccNum = sc.nextInt();
        sc.nextLine();
        System.out.println("Nhap ten chu tai khoan");
        mName = sc.nextLine();
        System.out.println("Nhap so du tai khoan");
        mBalance = sc.nextDouble();
    }
    public void output(){
        System.out.println(" account number :"+mAccNum+"| customer's full name :"+mName+"| account balance :"+mBalance);
    }

    
}
