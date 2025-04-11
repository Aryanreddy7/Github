package com.xworkz.Object.toString;

public class Blender {
    private String brand;
    private int speedSettings;
    private boolean cordless;

    public Blender(String brand, int speedSettings, boolean cordless) {
        this.brand = brand;
        this.speedSettings = speedSettings;
        this.cordless = cordless;
    }

    @Override
    public String toString() {
        return "Blender{brand='" + brand + "', speedSettings=" + speedSettings + ", cordless=" + cordless + "}";
    }
    @Override
    public int hashCode() {
        return 8;
    }
}
