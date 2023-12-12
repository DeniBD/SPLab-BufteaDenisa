package com.example.splabbufteadenisa.models;

public abstract class Element {

    private Element parent;
    abstract void print();

    abstract void accept(Visitor visitor);

    protected Element getParent() {
        return parent;
    }

    protected void setParent(Element parent) {
        this.parent = parent;
    }
}
