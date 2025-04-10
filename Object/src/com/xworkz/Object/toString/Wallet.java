package com.xworkz.Object.toString;

public class Wallet {
    private String material;
    private int cardSlots;
    private String color;

    public Wallet(String material, int cardSlots, String color) {
        this.material = material;
        this.cardSlots = cardSlots;
        this.color = color;
    }

    @Override
    public String toString() {
        return "Wallet{material='" + material + "', cardSlots=" + cardSlots + ", color='" + color + "'}";
    }
}
