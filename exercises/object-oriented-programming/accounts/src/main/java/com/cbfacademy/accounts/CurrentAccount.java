package com.cbfacademy.accounts;

// Inheriting from Account class
public class CurrentAccount extends Account{ 
    private double overdraftLimit;

    //constructor for CurrentAccount
    public CurrentAccount(int accountNumber, double balance, double overdraftLimit){
        // Call the parent constructor to set account number and balance
        super(accountNumber, balance);
        this.overdraftLimit = overdraftLimit;
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
        
        if (requested > 0 && requested <= this.balance) {  // Check if requested amount is within balance
            this.balance -= requested;  // Deduct requested amount
            return requested;  // Return the amount withdrawn
        } 
        else if (requested > 0 && requested <= overdraftLimit) {  // Check if requested amount is within balance + overdraft
            double overdraftLimit = requested - this.getBalance(); 
            return requested;  // Return the amount withdrawn
        }
        else{
            return 0;  // Return 0 if insufficient funds 
        }
    }
}

