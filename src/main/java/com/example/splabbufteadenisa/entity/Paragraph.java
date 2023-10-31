package com.example.splabbufteadenisa.entity;

public class Paragraph implements Element{
    private String text;

    public Paragraph(String text) {
        this.text = text;
    }

    public void print() {
        System.out.println("Paragraph: " + text);
    }

    public int getIndex() {
        return 1;
    }
}
