package com.example.splabbufteadenisa.models;

public interface Visitor {
    void visitSection(Section section);
    void visitParagraph(Paragraph paragraph);
    void visitImageProxy(ImageProxy imageProxy);
    void visitImage(Image image);
    void visitTable(Table table);
    void visitTableOfContent(TableOfContent tableOfContent);
    void visitBook(Book book);

}
