package com.adidas;

public abstract class Clothing {
    protected String name;
    protected String color;

    public Clothing(String name, String color) {
        this.name = name;
        this.color = color;
    }

    public abstract String toString();
}
