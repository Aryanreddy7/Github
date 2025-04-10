package com.xworkz.Object.toString;

public class Building {
    private String type;
    private int floors;
    private String location;

    public Building(String type, int floors, String location) {
        this.type = type;
        this.floors = floors;
        this.location = location;
    }

    @Override
    public String toString() {
        return "Building{type='" + type + "', floors=" + floors + ", location='" + location + "'}";
    }
}
