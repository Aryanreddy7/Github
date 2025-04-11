package com.xworkz.Object.toString;

public class Projector {
    private String color;
    private boolean dimmable;
    private String controlType;

    public void SmartLight(String color, boolean dimmable, String controlType) {
        this.color = color;
        this.dimmable = dimmable;
        this.controlType = controlType;
    }

    @Override
    public String toString() {
        return "SmartLight{color='" + color + "', dimmable=" + dimmable + ", controlType='" + controlType + "'}";
    }

    @Override
    public int hashCode() {
        return 96;
    }
}
