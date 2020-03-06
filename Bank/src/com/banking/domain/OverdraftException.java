package com.banking.domain;

public class OverdraftException extends RuntimeException {

    public static final long serialVersionUID = 38156784L;
    private double deficit;

    public OverdraftException(String message, double deficit) {
        super(message);
        this.deficit = deficit;
    }

    public double getDeficit() {
        return deficit;
    }
}
