package com.example.splabbufteadenisa.entity;

import java.util.ArrayList;
import java.util.List;

public class SubChapter {
    private String name;
    private List<Element> elements;
    public SubChapter(String name) {
        this.name = name;
        this.elements = new ArrayList<>();
    }
    public void print() {
        System.out.println("Subchapter: " + name);
        for (Element e : elements) {
            e.print();
        }

    }
    public void addElement(Element e) {
        elements.add(e);
        elements.sort((o1, o2) -> o1.getIndex() - o2.getIndex());
    }


    public void createNewParagraph(String text) {
        Paragraph p = new Paragraph(text);
        addElement(p);
    }

    public void createNewImage(String imageName) {
        Image i = new Image(imageName);
        addElement(i);
    }

    public void createNewTable(String title) {
        Table t = new Table(title);
        addElement(t);
    }
}
