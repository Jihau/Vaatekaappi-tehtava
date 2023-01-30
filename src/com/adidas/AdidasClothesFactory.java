package com.adidas;

public class AdidasClothesFactory implements ClothesFactory {
    @Override
    public Clothes createShirt() {
        return new AdidasShirt();
    }

    @Override
    public Clothes createHat() {
        return new AdidasHat();
    }

    @Override
    public Clothes createShoes() {
        return new AdidasShoes();
    }

    @Override
    public Clothes createPants() {
        return new AdidasPants();
    }
}