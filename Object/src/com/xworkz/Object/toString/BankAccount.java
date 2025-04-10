package com.xworkz.Object.toString;

public class BankAccount {
    private String accountHolder;
    private String accountNumber;
    private double balance;

    public BankAccount(String accountHolder, String accountNumber, double balance) {
        this.accountHolder = accountHolder;
        this.accountNumber = accountNumber;
        this.balance = balance;
    }

    @Override
    public String toString() {
        return "BankAccount{accountHolder='" + accountHolder + "', accountNumber='" + accountNumber + "', balance=" + balance + "}";
    }
}
