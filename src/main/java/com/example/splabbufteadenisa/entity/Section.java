package com.example.splabbufteadenisa.entity;

import java.util.ArrayList;
import java.util.List;

public class Section implements Element {
    protected String title;
    protected List<Element> elements;

    public Section(String title) {
        this.title = title;
        this.elements = new ArrayList<>();
    }

    public void print() {
        System.out.println(title);
        for (Element e : elements) {
            e.print();
        }
    }

    public void add(Element element) {
        elements.add(element);
    }

    public void remove(Element element) {
        elements.remove(element);
    }

    public Element get(int index) {
        return elements.get(index);
    }


    protected String getTitle() {
        return title;
    }
}
