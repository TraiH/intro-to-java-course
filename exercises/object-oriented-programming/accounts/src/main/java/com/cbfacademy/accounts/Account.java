package com.cbfacademy.accounts;

public class Account {
        private int accountNumber;
        public double balance;
        public double requested;
  
                
            public Account(int accountNumber, double balance, double requested){
                this.accountNumber = accountNumber; 
                this.balance = balance;
                this.requested = requested;
            
    }
       
        public double getBalance(){
            return balance;
        }

        public int getAccountNumber(){
            return accountNumber;
        }

        public double deposit(double amount){
            this.balance += amount; // Add the deposited amount to the current balance
            return this.balance;  
        }

        public double withdraw(double requested) {
            if (requested > 0 && requested <= this.balance) { // Ensure positive withdrawal and sufficient funds
                this.balance -= requested;  // Deduct the requested amount
                return requested;           // Return the requested amount
            } else {
                return 0;                   // Return 0 if funds are insufficient or requested is invalid
            }
        }
        @Override
    public String toString() {
        return "Account Number: " + accountNumber + ", Balance: " + balance;
    }
}
                
    
