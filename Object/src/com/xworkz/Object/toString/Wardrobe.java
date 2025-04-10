package com.xworkz.Object.toString;

public class Wardrobe {
    private int doors;
    private String color;
    private boolean sliding;

    public Wardrobe(int doors, String color, boolean sliding) {
        this.doors = doors;
        this.color = color;
        this.sliding = sliding;
    }

    @Override
    public String toString() {
        return "Wardrobe{doors=" + doors + ", color='" + color + "', sliding=" + sliding + "}";
    }
}
