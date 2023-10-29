package com.example.splabbufteadenisa.entity;

import java.util.ArrayList;
import java.util.List;

public class SubChapter {
    private String name;
    private List<Image> images;
    private List<Paragraph> paragraphs;
    private List<Table> tables;
    public SubChapter(String name) {
        this.name = name;
        this.images = new ArrayList<>();
        this.paragraphs = new ArrayList<>();
        this.tables = new ArrayList<>();
    }
    public void print() {
        System.out.println("Subchapter: " + name);
        for (Paragraph p : paragraphs) {
            p.print();
        }
        for (Image i : images) {
            i.print();
        }
        for (Table t : tables) {
            t.print();
        }
    }


    public void createNewParagraph(String text) {
        Paragraph p = new Paragraph(text);
        paragraphs.add(p);
    }

    public void createNewImage(String imageName) {
        Image i = new Image(imageName);
        images.add(i);
    }

    public void createNewTable(String title) {
        Table t = new Table(title);
        tables.add(t);
    }
}
