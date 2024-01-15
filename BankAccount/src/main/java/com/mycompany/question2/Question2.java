package com.mycompany.question2;
import java.util.*;
public class Question2 {

    public static void main(String[] args) {
        Question2 Acc = new Question2();
    }
    ArrayList<BankAccount> Account = new ArrayList<BankAccount>();
    Question2(){}
    void InputAccount(){
         Scanner sc = new Scanner(System.in);
        int n;
        System.out.print("Number of Account: ");
        n = sc.nextInt();
        for(int i = 0;i<n;i++){
            BankAccount A = new BankAccount();
            A.input();
            Account.add(A);}
    }
    void OutputNeighborhood(){
         for(int i =0;i<Account.size();i++){
            Account.get(i).output();
         } 
    }
}
