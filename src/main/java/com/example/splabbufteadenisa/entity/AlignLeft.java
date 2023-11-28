package com.example.splabbufteadenisa.entity;

public class AlignLeft implements AlignStrategy {

    public void render(String text) {
        System.out.println("+++++" + text);
    }
}
