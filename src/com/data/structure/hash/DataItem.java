package com.data.structure.hash;

public class DataItem {
    private int key;
    public DataItem next;

    public DataItem(int key) {
        this.key = key;
    }

    public int getKey() {
        return this.key;
    }

    public void display() {
        System.out.println(key + " ");
    }
}
