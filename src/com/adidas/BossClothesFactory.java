package com.adidas;

public class BossClothesFactory implements ClothesFactory {
    @Override
    public Clothes createShirt() {
        return new BossShirt();
    }

    @Override
    public Clothes createHat() {
        return new BossHat();
    }

    @Override
    public Clothes createShoes() {
        return new BossShoes();
    }

    @Override
    public Clothes createPants() {
        return new BossPants();
    }
}