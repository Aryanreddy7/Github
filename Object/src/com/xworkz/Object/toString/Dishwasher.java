package com.xworkz.Object.toString;

public class Dishwasher {
    private String brand;
    private int placeSettings;
    private boolean energyEfficient;

    public Dishwasher(String brand, int placeSettings, boolean energyEfficient) {
        this.brand = brand;
        this.placeSettings = placeSettings;
        this.energyEfficient = energyEfficient;
    }

    @Override
    public String toString() {
        return "Dishwasher{brand='" + brand + "', placeSettings=" + placeSettings + ", energyEfficient=" + energyEfficient + "}";
    }
    @Override
    public int hashCode() {
        return 24;
    }
}
