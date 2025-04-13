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
    @Override
    public int hashCode() {
        return 83;
    }
    @Override
    public boolean equals(Object obj) {
        if (obj != null) {
            System.out.println("ref is not null");
            if (obj instanceof Wallet) {
                System.out.println("Comparing!!!!!!");
                Wallet wallet = this;
                Wallet wallet1 = (Wallet) obj;
                if (wallet.material.equals(wallet1.material) && wallet.color.equals(wallet1.color) && wallet.cardSlots == wallet1.cardSlots) {
                    System.out.println("both are same");
                    return true;
                }
            }
        }
        return false;
    }

}
