package com.xworkz.Object.toString;

public class Kettle {
    private String brand;
    private double capacity;
    private boolean temperatureControl;

    public Kettle(String brand, double capacity, boolean temperatureControl) {
        this.brand = brand;
        this.capacity = capacity;
        this.temperatureControl = temperatureControl;
    }

    @Override
    public String toString() {
        return "Kettle{brand='" + brand + "', capacity=" + capacity + ", temperatureControl=" + temperatureControl + "}";
    }
}
