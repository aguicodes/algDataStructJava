package com.agui;

public class BankAccount {
    private int accountNumber;
    private double Balance = 0;
    private int telephoneNumber;
    private String name;
    private String email;

    public int getAccountNumber(){
        return this.accountNumber;

    }
    public double getBalance(){
        return this.Balance;

    }
    public int getTelephoneNumber(){
        return this.telephoneNumber;

    }
    public String getName(){
        return this.name;

    }
    public String getEmail(){
        return this.email;

    }

    public void setAccountNumber(int acctNum){
        this.accountNumber = acctNum;

    }
    public void setBalance(double bal){
        this.Balance = bal;

    }
    public void setTelephoneNumber(int teleNum){
        this.telephoneNumber = teleNum;

    }
    public void settName(String name){
        this.name = name;

    }
    public void setEmail(String email){
        this.email = email;

    }
    public void addBalance(double add){
        this.Balance +=add;

    }
    public void withdrawalBalance(double take){
        if(take > this.Balance){
            System.out.println("insufficient funds");
        }
        else
            this.Balance -= take;

    }
}
