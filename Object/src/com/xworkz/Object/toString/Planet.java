package com.xworkz.Object.toString;

public class Planet {
    private String name;
    private double mass;
    private double radius;

    public Planet(String name, double mass, double radius) {
        this.name = name;
        this.mass = mass;
        this.radius = radius;
    }

    @Override
    public String toString() {
        return "Planet{name='" + name + "', mass=" + mass + ", radius=" + radius + "}";
    }
    @Override
    public int hashCode() {
        return 58;
    }
}
