package com.example.splabbufteadenisa.entity;

public class Image extends Element {
    private String imageName;

    public Image(String imageName) {
        this.imageName = imageName;
    }

    // crate a print method
    public void print() {
        System.out.println("Image with name: " + imageName);
    }



}
