package com.xworkz.Object.toString;

public class Clothing {
    private String type;
    private String size;
    private String color;

    public Clothing(String type, String size, String color) {
        this.type = type;
        this.size = size;
        this.color = color;
    }

    @Override
    public String toString() {
        return "Clothing{type='" + type + "', size='" + size + "', color='" + color + "'}";
    }
}
