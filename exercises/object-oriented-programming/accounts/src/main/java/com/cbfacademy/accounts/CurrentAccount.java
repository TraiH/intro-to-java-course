package com.cbfacademy.accounts;

// Inheriting from Account class
public class CurrentAccount extends Account{ 
    private double overdraftLimit;
    public double requested;
   
    //constructor for CurrentAccount
    public CurrentAccount(int accountNumber, double balance, double overdraftLimit, double requested){
        // Call the parent constructor to set account number and balance and requested
        super(accountNumber, balance, requested);
        this.overdraftLimit = overdraftLimit;
        this.requested = requested;
    }    
     
      //sets the overdraft limit
    public void setOverdraftLimit(double overdraftLimit) {
        this.overdraftLimit = overdraftLimit;  // Add overdraft to balance
        } 
    
    //returns the current overdraft limit
    public double getOverdraftLimit() {  
        return overdraftLimit;
    }
    
    @Override
    public double withdraw(double requested) {
        double overdraftLimitPlusBalance = this.balance + overdraftLimit;
        if (requested <= overdraftLimitPlusBalance){
            return requested;

        } else (requested > overdraftLimitPlusBalance) {
            return 0;
        }
    }
}


