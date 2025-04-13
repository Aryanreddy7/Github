package com.xworkz.Object.toString;

public class ChefKnife {
    private String brand;
    private double length;
    private String handleMaterial;

    public ChefKnife(String brand, double length, String handleMaterial) {
        this.brand = brand;
        this.length = length;
        this.handleMaterial = handleMaterial;
    }

    @Override
    public String toString() {
        return "ChefKnife{brand='" + brand + "', length=" + length + ", handleMaterial='" + handleMaterial + "'}";
    }
    @Override
    public int hashCode() {
        return 15;
    }
    @Override
    public boolean equals(Object obj) {
        if(obj != null) {
            System.out.println("ref is not null");
            if(obj instanceof ChefKnife) {
                System.out.println("Comparing!!!!!!");
                ChefKnife chefKnife = this;
                ChefKnife chefKnife1 = (ChefKnife) obj;
                if(chefKnife.brand.equals(chefKnife1.brand)) {
                    System.out.println("both are same");
                    return true;
                }
            }
        }
        return false;
    }
}
