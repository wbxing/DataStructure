package com.banking;

import com.banking.domain.OverdraftException;

public class Account {

    protected double balance;

    public Account() {
    }

    public Account(double balance) {
        this.balance = balance;
    }

    public double getBalance() {
        return balance;
    }

    public boolean deposit(double amt) {
        balance += amt;
        return true;
    }

    public void withdraw(double amt) {
        if (amt > balance) {
            throw new OverdraftException("资金不足", amt - balance);
        } else {
            balance -= amt;
        }

    }
}
