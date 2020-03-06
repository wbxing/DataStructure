package com.banking;

import com.banking.domain.OverdraftException;

public class CheckingAccount extends Account {

    private double overdraftProtection = -1;
    private SavingAccount protectedBy = null;

    public CheckingAccount() {
    }

    public CheckingAccount(double balance) {
        super(balance);
    }

    public CheckingAccount(double balance, double overdraftProtection) {
        super(balance);
        this.overdraftProtection = overdraftProtection;
    }

    public CheckingAccount(double balance, SavingAccount protectedBy) {
        super(balance);
        this.protectedBy = protectedBy;
    }

    @Override
    public void withdraw(double amt) {
        if(balance >= amt){
            balance -= amt;
        }else{
            if(overdraftProtection == -1){
                throw new OverdraftException("no overdraft protection", amt - balance);
            }
            if (overdraftProtection >= (amt - balance)){
                overdraftProtection -= (amt - balance);
                balance = 0;
            } else {
                throw new OverdraftException("Insufficient funds for overdraft protrction", amt - balance);
            }
        }
    }
}
