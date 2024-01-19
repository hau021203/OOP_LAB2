package com.mycompany.question2;

import java.util.*;

public class Question2 {

    public static void main(String[] args) {
        Question2 Acc = new Question2();
        Acc.InputAccount();
        Acc.OutputAccount();
        Acc.depositToAccount();
        Acc.OutputAccount();
        Acc.withdrawToAccount();
        Acc.OutputAccount();
        Acc.transferToAccount();
        Acc.OutputAccount();

    }
    ArrayList<BankAccount> Account = new ArrayList<BankAccount>();

    Question2() {
    }

    public void InputAccount() {
        Scanner sc = new Scanner(System.in);
        int n;
        System.out.print("Number of Account: ");
        n = sc.nextInt();
        for (int i = 0; i < n; i++) {
            BankAccount A = new BankAccount();
            A.input();
            Account.add(A);
        }
    }

    public void OutputAccount() {
        for (int i = 0; i < Account.size(); i++) {
            Account.get(i).output();
        }
    }

    public void depositToAccount() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhap so tai khoan can gui tien :");
        int a = sc.nextInt();
        System.out.println("Nhap so tien can gui :");
        double n = sc.nextInt();
        for (int i = 0; i < Account.size(); i++) {
            if (a == Account.get(i).getAccNum()) {
                Account.get(i).deposit(n);
            }
        }
    }

    public void withdrawToAccount() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhap so tai khoan can rut tien :");
        int a = sc.nextInt();
        System.out.println("Nhap so tien can rut :");
        double n = sc.nextInt();
        for (int i = 0; i < Account.size(); i++) {
            if (a == Account.get(i).getAccNum()) {
                Account.get(i).withdraw(n);
                break;
            }
        }
    }

    public void transferToAccount() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhap so tai khoan gui tien :");
        int a = sc.nextInt();
        System.out.println("Nhap so tai khoan nhan tien :");
        int b = sc.nextInt();
        System.out.println("Nhap so tien can gui :");
        double n = sc.nextInt();
        for (int i = 0; i < Account.size(); i++) {
            if (a == Account.get(i).getAccNum()) {
                for (int j = 0; j < Account.size(); j++) {
                    if (b == Account.get(j).getAccNum()) {
                        Account.get(i).tranferMoney(Account.get(j), n);
                        break;
                    }
                }
            }
        }
    }

}
