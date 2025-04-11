package com.xworkz.Object.toString;

public class Tablet {
    private String brand;
    private double screenSize;
    private int batteryLife;

    public Tablet(String brand, double screenSize, int batteryLife) {
        this.brand = brand;
        this.screenSize = screenSize;
        this.batteryLife = batteryLife;
    }

    @Override
    public String toString() {
        return "Tablet{brand='" + brand + "', screenSize=" + screenSize + ", batteryLife=" + batteryLife + "}";
    }
    @Override
    public int hashCode() {
        return 71;
    }
}

