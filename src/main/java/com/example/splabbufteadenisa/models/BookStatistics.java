package com.example.splabbufteadenisa.models;

public class BookStatistics implements Visitor{

    private int imageCount = 0;
    private int tableCount = 0;
    private int paragraphCount = 0;
    public void visitSection(Section section) {
    }

    public void visitParagraph(Paragraph paragraph) {
        paragraphCount++;
    }

    public void visitImageProxy(ImageProxy imageProxy) {
        imageCount++;
    }

    public void visitImage(Image image) {
        imageCount++;
    }


    public void visitTable(Table table) {
        tableCount++;
    }

    public void visitTableOfContent(TableOfContent tableOfContent) {
        //hapciu
    }

    public void visitBook(Book book) {
        //hapciu
    }

    public void printStatistics() {
        System.out.println("Number of paragraphs: " + paragraphCount);
        System.out.println("Number of images: " + imageCount);
        System.out.println("Number of tables: " + tableCount);
    }
}
