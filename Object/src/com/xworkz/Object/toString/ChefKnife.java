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
}
