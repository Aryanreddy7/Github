package com.xworkz.Object.toString;

public class Sunglasses {
    private String brand;
    private String lensColor;
    private boolean polarized;

    public Sunglasses(String brand, String lensColor, boolean polarized) {
        this.brand = brand;
        this.lensColor = lensColor;
        this.polarized = polarized;
    }

    @Override
    public String toString() {
        return "Sunglasses{brand='" + brand + "', lensColor='" + lensColor + "', polarized=" + polarized + "}";
    }
    @Override
    public int hashCode() {
        return 70;
    }
}
