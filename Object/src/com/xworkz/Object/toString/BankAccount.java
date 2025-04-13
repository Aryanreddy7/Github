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
    @Override
    public int hashCode() {
        return 05;
    }
    @Override
    public boolean equals(Object obj) {
        if(obj != null) {
            System.out.println("ref is not null");
            if(obj instanceof BankAccount) {
                System.out.println("Comparing!!!!!!");
                BankAccount bankAccount = this;
                BankAccount bankAccount1 = (BankAccount) obj;
                if(bankAccount.accountNumber.equals(bankAccount1.accountNumber)) {
                    System.out.println("both are same");
                    return true;
                }
            }
        }
        return false;
    }
}
