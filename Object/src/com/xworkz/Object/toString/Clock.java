package com.xworkz.Object.toString;
public class Clock {
    private String brand;
    private boolean digital;
    private String color;

    public Clock(String brand, boolean digital, String color) {
        this.brand = brand;
        this.digital = digital;
        this.color = color;
    }

    @Override
    public String toString() {
        return "Clock{brand='" + brand + "', digital=" + digital + ", color='" + color + "'}";
    }
}

