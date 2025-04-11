package com.xworkz.Object.toString;

public class Toaster {
    private String brand;
    private int slots;
    private boolean smart;

    public Toaster(String brand, int slots, boolean smart) {
        this.brand = brand;
        this.slots = slots;
        this.smart = smart;
    }

    @Override
    public String toString() {
        return "Toaster{brand='" + brand + "', slots=" + slots + ", smart=" + smart + "}";
    }
    @Override
    public int hashCode() {
        return 76;
    }
}
