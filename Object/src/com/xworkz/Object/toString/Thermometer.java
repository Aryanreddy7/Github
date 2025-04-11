package com.xworkz.Object.toString;

public class Thermometer {
    private String type;
    private double range;
    private boolean digital;

    public Thermometer(String type, double range, boolean digital) {
        this.type = type;
        this.range = range;
        this.digital = digital;
    }

    @Override
    public String toString() {
        return "Thermometer{type='" + type + "', range=" + range + ", digital=" + digital + "}";
    }
    @Override
    public int hashCode() {
        return 74;
    }
}
