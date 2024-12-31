package com.cbfacademy.accounts;


// Inheriting from Account class
public class SavingsAccount extends Account {
    public double interestRate; // Interest rate for savings account


    // Constructor for SavingsAccount
    public SavingsAccount(int accountNumber, double balance, double interestRate, double requested) {
        // Call the parent constructor to set account number and balance
        super(accountNumber, balance, requested);
        this.interestRate = interestRate;
    }
    
    public double getInterestRate(){
        return interestRate; //returns the current interest rate
    }
    
    public void setInterestRate(double interestRate){
        this.interestRate = interestRate;
    }
    public double applyInterest() {
        double interestAmount = this.getBalance() * this.interestRate;  // Calculate interest based on current balance
        this.balance += interestAmount;  // Add interest to the balance
        return this.getBalance();  // Return the updated balance
    }
}
