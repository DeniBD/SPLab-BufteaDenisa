package com.example.splabbufteadenisa.models;

import java.util.ArrayList;
import java.util.List;

public class Book extends Section {
    private List<Author> authors;

    public Book(String title) {
        super(title);
        this.authors = new ArrayList<>();
    }

    public void print() {

        System.out.println("Book: " + super.title + "\n");

        System.out.println("Authors: ");

        for (Author a : authors) {
            a.print();
        }
        System.out.println();

        for (Element e : super.elements) {
            e.print();
        }
        //super.print();
    }

    public void addAuthor(Author author) {
        authors.add(author);
    }

    public void addContent(Element element) {
        try {
            super.add(element);
        } catch (IllegalArgumentException e) {
            e.printStackTrace();
        }
    }

    public void accept(Visitor visitor) {
        visitor.visitBook(this);
        for (Element element : super.elements) {
            element.accept(visitor);
        }
    }

}
