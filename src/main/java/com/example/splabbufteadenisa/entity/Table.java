package com.example.splabbufteadenisa.entity;

public class Table extends Element {
    private String title;

    public Table(String title) {
        this.title = title;
    }

    public void print() {
        System.out.println("Table with Title: " + title);
    }

}
