package com.example.splabbufteadenisa.entity;

import java.util.ArrayList;
import java.util.List;

public class Book {
    private String title;
    private List<Author> authors;
    private List<Chapter> chapters;

    public Book(String title) {
        this.title = title;
        this.authors = new ArrayList<>();
        this.chapters = new ArrayList<>();

    }


    public void print() {
        System.out.println("Book: " + title);
        for (Author a : authors) {
            a.print();
        }
        for (Chapter c : chapters) {
            c.print();
        }
    }

    public void addAuthor(Author author) {
        authors.add(author);
    }

    public int createChapter(String name) {
        Chapter c = new Chapter(name);
        chapters.add(c);
        return chapters.indexOf(c);
    }

    public Chapter getChapter(int indexChapter) {
        return chapters.get(indexChapter);
    }
}
