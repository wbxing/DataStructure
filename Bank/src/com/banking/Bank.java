package com.banking;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Bank {

    private List<Customer> customers;
    // private int numOfCustomers;
    private static Bank bank = new Bank();

    private Bank() {
        this(5);
    }

    private Bank(int init) {
        customers = new ArrayList<>();
        // numOfCustomers = 0;
    }

    public static Bank getBank() {
        return bank;
    }

    public void addCustomer(String firstName, String lastName) {
        customers.add(new Customer(firstName, lastName));
    }

    public int getNumOfCustomers() {
        return customers.size();
    }

    public Iterator<Customer> getCustomers() {
        return customers.iterator();
    }

    public Customer getCustomer(int index) {
        return customers.get(index);
    }

}
