package com.karayilmazhakan.model;

public class AccountModel {

    String fullName;
    double balance;
    double criticalDept;
    String[] lastTransaction = {"",""};

    public AccountModel() {

    }

    public AccountModel(String fullName, double balance, double criticalDept) {
        this.fullName = fullName;
        this.balance = balance;
        this.criticalDept = criticalDept;
    }

    public String getFullName() {
        return fullName;
    }

    public void setFullName(String fullName) {
        this.fullName = fullName;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public double getCriticalDept() {
        return criticalDept;
    }

    public void setCriticalDept(double criticalDept) {
        this.criticalDept = criticalDept;
    }

    public void credit(double amount) {
        lastTransaction[0]="credit";
        lastTransaction[1]=String.valueOf(amount);
        balance -= amount;
    }
    public void debit (double amount) {
        lastTransaction[0]="debit";
        lastTransaction[1]=String.valueOf(amount);
        balance += amount;
    }
    public double showBalance() {
        return balance;
    }
    public void showInfo() {
        System.out.println(fullName);
        System.out.println("balance: " + balance);
        if (balance < criticalDept) System.out.println("Balance is Critical");
        else System.out.println("Balance is Normal");

        System.out.println("Last Transaction Type: "+ lastTransaction[0]);
        System.out.println("Last Transaction amount: "+ lastTransaction[1]);
    }
}
