package com.example.splabbufteadenisa.entity;

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

    public void setAlignStrategy(AlignStrategy alignStrategy)   {
        this.alignStrategy = alignStrategy;
    }
}
