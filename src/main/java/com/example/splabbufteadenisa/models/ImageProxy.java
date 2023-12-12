package com.example.splabbufteadenisa.models;

public class ImageProxy extends Element implements Picture {

    private Image realImage;
    private String name;
    public ImageProxy(String name) {
        this.name = name;
        realImage = null;
    }

    public Image loadImage() {
        if (realImage == null) {
            realImage = new Image(name);
        }
        return realImage;
    }

    public void print() {
        this.loadImage();
        this.realImage.print();
    }

    void accept(Visitor visitor) {
        visitor.visitImageProxy(this);
    }
}
