package com.xworkz.Object.toString;

public class Mixer {
    private String brand;
    private int speedLevels;
    private boolean bowlIncluded;

    public Mixer(String brand, int speedLevels, boolean bowlIncluded) {
        this.brand = brand;
        this.speedLevels = speedLevels;
        this.bowlIncluded = bowlIncluded;
    }

    @Override
    public String toString() {
        return "Mixer{brand='" + brand + "', speedLevels=" + speedLevels + ", bowlIncluded=" + bowlIncluded + "}";
    }
}
