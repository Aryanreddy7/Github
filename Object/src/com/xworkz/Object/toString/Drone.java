package com.xworkz.Object.toString;

public class Drone {
    private String model;
    private double range;
    private int cameraQuality;

    public Drone(String model, double range, int cameraQuality) {
        this.model = model;
        this.range = range;
        this.cameraQuality = cameraQuality;
    }

    @Override
    public String toString() {
        return "Drone{model='" + model + "', range=" + range + ", cameraQuality=" + cameraQuality + "}";
    }
}
