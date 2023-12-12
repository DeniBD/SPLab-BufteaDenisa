package com.example.splabbufteadenisa.models;

public class Table extends Element {
    private String title;

    public Table(String title) {
        this.title = title;
    }

    public void print() {
        System.out.println("Table with Title: " + title);
    }

    void accept(Visitor visitor) {
        visitor.visitTable(this);
    }

}
