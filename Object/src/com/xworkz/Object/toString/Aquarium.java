package com.xworkz.Object.toString;

public class Aquarium {
    private String name;
    private int capacity;
    private String waterType;

    public Aquarium(String name, int capacity, String waterType) {
        this.name = name;
        this.capacity = capacity;
        this.waterType = waterType;
    }

    @Override
    public String toString() {
        return "Aquarium{name='" + name + "', capacity=" + capacity + ", waterType='" + waterType + "'}";
    }
}
