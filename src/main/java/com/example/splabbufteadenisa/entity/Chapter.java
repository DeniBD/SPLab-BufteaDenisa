package com.example.splabbufteadenisa.entity;

import java.util.ArrayList;
import java.util.List;

public class Chapter {
    private String name;
    private List<SubChapter> subChapters;

    public Chapter(String name) {
        this.name = name;
        subChapters = new ArrayList<>();
    }

    public void print() {
        System.out.println("Chapter: " + name);
        for (SubChapter s : subChapters) {
            s.print();
        }
    }

    public int createSubChapter(String name) {
        SubChapter s = new SubChapter(name);
        subChapters.add(s);
        return subChapters.indexOf(s);
    }

    public SubChapter getSubChapter(int indexSubChapter) {
        return subChapters.get(indexSubChapter);
    }
}
