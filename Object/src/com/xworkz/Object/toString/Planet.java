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
    @Override
    public boolean equals(Object obj) {
        if (obj != null) {
            System.out.println("ref is not null");
            if (obj instanceof Planet) {
                System.out.println("Comparing!!!!!!");
                Planet planet = this;
                Planet planet1 = (Planet) obj;
                if (planet.name.equals(planet1.name) && planet.mass == planet1.mass) {
                    System.out.println("both are same");
                    return true;
                }
            }
        }
        return false;
    }

}
