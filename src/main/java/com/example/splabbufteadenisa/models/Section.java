package com.example.splabbufteadenisa.models;

import java.util.ArrayList;
import java.util.List;

public class Section extends Element {
    protected String title;
    protected List<Element> elements;

    public Section(String title) {
        this.title = title;
        this.elements = new ArrayList<>();
    }

    public void print() {
        System.out.println(title);
//        for (Element e : elements) {
//            e.print();
//        }
    }

    public void accept(Visitor visitor) {
        visitor.visitSection(this);
        for (Element e : elements) {
            e.accept(visitor);
        }
    }

    public void add(Element element) throws IllegalArgumentException {
        if(element.getParent() == null) {
            element.setParent(this);
            elements.add(element);
        }
        else {
            throw new IllegalArgumentException("Element already has a parent");
        }
    }

    public void remove(Element element) {
        elements.remove(element);
        element.setParent(null);
    }

    public Element get(int index) {
        return elements.get(index);
    }


    protected String getTitle() {
        return title;
    }
}
