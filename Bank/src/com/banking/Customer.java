package com.banking;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Customer {

    private String firstName;
    private String lastName;
    private List<Account> accounts;
    private SavingAccount savingAccount;
    private CheckingAccount checkingAccount;
    // private int numOfAccounts;

    public Customer() {
        accounts = new ArrayList<>();
        // numOfAccounts = 0;
    }

    public Customer(String firstName, String lastName) {
        this();
        this.firstName = firstName;
        this.lastName = lastName;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public SavingAccount getSavingAccount() {
        return savingAccount;
    }

    public void setSavingAccount(SavingAccount savingAccount) {
        this.savingAccount = savingAccount;
    }

    public CheckingAccount getCheckingAccount() {
        return checkingAccount;
    }

    public void setCheckingAccount(CheckingAccount checkingAccount) {
        this.checkingAccount = checkingAccount;
    }

    public Iterator<Account> getAccounts() {
        return accounts.iterator();
    }

    public int getNumOfAccounts() {
        return accounts.size();
    }

    public Account getAccount(int index) {
        return accounts.get(index);
    }

    public void addAccount(Account account) {
        accounts.add(account);
    }
}
