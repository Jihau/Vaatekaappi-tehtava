package com.adidas;

public class Person {
    private Clothes hat;
    private Clothes shirt;
    private Clothes pants;
    private Clothes shoes;

    public void putOn(ClothesFactory factory) {
        hat = factory.createHat();
        shirt = factory.createShirt();
        pants = factory.createPants();
        shoes = factory.createShoes();
    }

    public void whatAmIWearing() {
        System.out.println(hat);
        System.out.println(shirt);
        System.out.println(pants);
        System.out.println(shoes);
    }
}
