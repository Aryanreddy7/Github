package com.xworkz.Object.toString;

public class Furniture {
    private String type;
    private String material;
    private double price;

    public Furniture(String type, String material, double price) {
        this.type = type;
        this.material = material;
        this.price = price;
    }

    @Override
    public String toString() {
        return "Furniture{type='" + type + "', material='" + material + "', price=" + price + "}";
    }
    @Override
    public int hashCode() {
        return 32;
    }
    @Override
    public boolean equals(Object obj) {
        if (obj != null) {
            System.out.println("ref is not null");
            if (obj instanceof Furniture) {
                System.out.println("Comparing!!!!!!");
                Furniture furniture = this;
                Furniture furniture1 = (Furniture) obj;
                if (furniture.material.equals(furniture1.material) && furniture.type.equals(furniture1.type)) {
                    System.out.println("both are same");
                    return true;
                }
            }
        }
        return false;
    }

}
