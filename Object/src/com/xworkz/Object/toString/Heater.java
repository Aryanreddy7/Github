package com.xworkz.Object.toString;

public class Heater {
    private String type;
    private int power;
    private boolean portable;

    public Heater(String type, int power, boolean portable) {
        this.type = type;
        this.power = power;
        this.portable = portable;
    }

    @Override
    public String toString() {
        return "Heater{type='" + type + "', power=" + power + ", portable=" + portable + "}";
    }
}
