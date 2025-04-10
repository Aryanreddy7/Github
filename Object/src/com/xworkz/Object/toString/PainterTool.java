package com.xworkz.Object.toString;

public class PainterTool {
    private String name;
    private String material;
    private double weight;

    public PainterTool(String name, String material, double weight) {
        this.name = name;
        this.material = material;
        this.weight = weight;
    }

    @Override
    public String toString() {
        return "PainterTool{name='" + name + "', material='" + material + "', weight=" + weight + "}";
    }
}


