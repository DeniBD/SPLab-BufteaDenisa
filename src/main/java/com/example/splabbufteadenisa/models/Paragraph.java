package com.example.splabbufteadenisa.models;

public class Paragraph extends Element{
    private String text;
    private AlignStrategy alignStrategy;

    public Paragraph(String text) {
        this.text = text;
        this.alignStrategy = null;
    }

    public void print() {
        if(alignStrategy == null) {
            System.out.println("Paragraph: " + this.text);
        }
        else {
            this.alignStrategy.render(this.text);
        }
    }

    void accept(Visitor visitor) {
        visitor.visitParagraph(this);
    }

    public void setAlignStrategy(AlignStrategy alignStrategy)   {
        this.alignStrategy = alignStrategy;
    }
}
