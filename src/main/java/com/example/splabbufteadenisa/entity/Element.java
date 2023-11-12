package com.example.splabbufteadenisa.entity;

public abstract class Element {

    private Element parent;
    abstract void print();

    protected Element getParent() {
        return parent;
    }

    protected void setParent(Element parent) {
        this.parent = parent;
    }
}
