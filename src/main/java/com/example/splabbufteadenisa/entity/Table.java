package com.example.splabbufteadenisa.entity;

public class Table implements Element {
    private String title;

    public Table(String title) {
        this.title = title;
    }

    public void print() {
        System.out.println("Table with Title: " + title);
    }

    public int getIndex() {
        return 3;
    }
}
