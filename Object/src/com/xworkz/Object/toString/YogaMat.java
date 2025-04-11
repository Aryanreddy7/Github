package com.xworkz.Object.toString;

public class YogaMat {
    private String brand;
    private double thickness;
    private String color;

    public YogaMat(String brand, double thickness, String color) {
        this.brand = brand;
        this.thickness = thickness;
        this.color = color;
    }

    @Override
    public String toString() {
        return "YogaMat{brand='" + brand + "', thickness=" + thickness + ", color='" + color + "'}";
    }
    @Override
    public int hashCode() {
        return 100;
    }
}
