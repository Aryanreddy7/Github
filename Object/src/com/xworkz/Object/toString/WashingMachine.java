package com.xworkz.Object.toString;

public class WashingMachine {
    private String brand;
    private double capacity;
    private boolean frontLoad;

    public WashingMachine(String brand, double capacity, boolean frontLoad) {
        this.brand = brand;
        this.capacity = capacity;
        this.frontLoad = frontLoad;
    }

    @Override
    public String toString() {
        return "WashingMachine{brand='" + brand + "', capacity=" + capacity + ", frontLoad=" + frontLoad + "}";
    }
}
