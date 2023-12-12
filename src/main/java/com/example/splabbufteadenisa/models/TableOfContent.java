package com.example.splabbufteadenisa.models;

import java.util.ArrayList;
import java.util.List;

public class TableOfContent extends Element{
    private List<String> content = new ArrayList<>();

    void print() {
        for(String s : content) {
            System.out.println(s);
        }
    }

    public void accept(Visitor visitor) {
        visitor.visitTableOfContent(this);
    }

    void add(String string) {
        content.add(string);
    }
}
