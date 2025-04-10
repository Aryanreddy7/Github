package com.xworkz.Object.toString;

public class Oven {
    private String brand;
    private int capacity;
    private boolean electric;

    public Oven(String brand, int capacity, boolean electric) {
        this.brand = brand;
        this.capacity = capacity;
        this.electric = electric;
    }

    @Override
    public String toString() {
        return "Oven{brand='" + brand + "', capacity=" + capacity + ", electric=" + electric + "}";
    }
}
