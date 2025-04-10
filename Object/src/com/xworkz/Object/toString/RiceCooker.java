package com.xworkz.Object.toString;

public class RiceCooker {
    private String brand;
    private int capacity;
    private boolean steamer;

    public RiceCooker(String brand, int capacity, boolean steamer) {
        this.brand = brand;
        this.capacity = capacity;
        this.steamer = steamer;
    }

    @Override
    public String toString() {
        return "RiceCooker{brand='" + brand + "', capacity=" + capacity + ", steamer=" + steamer + "}";
    }
}
