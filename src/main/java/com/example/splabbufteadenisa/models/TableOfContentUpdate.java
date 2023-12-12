package com.example.splabbufteadenisa.models;

import ch.qos.logback.core.net.server.Client;
import ch.qos.logback.core.net.server.ServerRunner;

import java.util.List;

public class TableOfContentUpdate implements Visitor{

    private TableOfContent tableOfContent = new TableOfContent();

    private int pageNumber = 1;

    public void visitSection(Section section) {

        String s = section.getTitle() + " ";

        for(int i = 0; i < 30-section.getTitle().length(); i++) {
            s += ".";
        }

        s += " " + pageNumber;

        tableOfContent.add(s);
    }

    public void visitParagraph(Paragraph paragraph) {
        pageNumber++;
    }

    public void visitImageProxy(ImageProxy imageProxy) {
        pageNumber++;
    }

    public void visitImage(Image image) {
        pageNumber++;
    }

    public void visitTable(Table table) {
        pageNumber++;
    }

    public void visitTableOfContent(TableOfContent tableOfContent) {
        //hapciu
    }

    public void visitBook(Book book) {
        //hapciu
    }

    public TableOfContent getToC() {
        return tableOfContent;
    }
}
