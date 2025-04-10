package com.xworkz.Object.toString;

public class LightBulb {
    private String type;
    private int wattage;
    private String color;

    public LightBulb(String type, int wattage, String color) {
        this.type = type;
        this.wattage = wattage;
        this.color = color;
    }

    @Override
    public String toString() {
        return "LightBulb{type='" + type + "', wattage=" + wattage + ", color='" + color + "'}";
    }
}
