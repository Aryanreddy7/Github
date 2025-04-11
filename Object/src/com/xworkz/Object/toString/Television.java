package com.xworkz.Object.toString;

public class Television {
    private String brand;
    private int screenSize;
    private boolean isSmart;

    public Television(String brand, int screenSize, boolean isSmart) {
        this.brand = brand;
        this.screenSize = screenSize;
        this.isSmart = isSmart;
    }

    @Override
    public String toString() {
        return "Television{brand='" + brand + "', screenSize=" + screenSize + ", isSmart=" + isSmart + "}";
    }
    @Override
    public int hashCode() {
        return 73;
    }
}


