package com.xworkz.Object.toString;

public class Flashlight {
    private String brand;
    private int lumens;
    private boolean rechargeable;

    public Flashlight(String brand, int lumens, boolean rechargeable) {
        this.brand = brand;
        this.lumens = lumens;
        this.rechargeable = rechargeable;
    }

    @Override
    public String toString() {
        return "Flashlight{brand='" + brand + "', lumens=" + lumens + ", rechargeable=" + rechargeable + "}";
    }
}
