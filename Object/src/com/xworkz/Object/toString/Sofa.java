package com.xworkz.Object.toString;

public class Sofa {
    private String color;
    private int seats;
    private boolean recliner;

    public Sofa(String color, int seats, boolean recliner) {
        this.color = color;
        this.seats = seats;
        this.recliner = recliner;
    }

    @Override
    public String toString() {
        return "Sofa{color='" + color + "', seats=" + seats + ", recliner=" + recliner + "}";
    }
}
