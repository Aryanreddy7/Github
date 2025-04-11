package com.xworkz.Object.toString;

public class Desk {
    private String material;
    private String color;
    private int drawers;

    public Desk(String material, String color, int drawers) {
        this.material = material;
        this.color = color;
        this.drawers = drawers;
    }

    @Override
    public String toString() {
        return "Desk{material='" + material + "', color='" + color + "', drawers=" + drawers + "}";
    }
    @Override
    public int hashCode() {
        return 23;
    }
}
