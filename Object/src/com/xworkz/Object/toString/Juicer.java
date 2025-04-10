package com.xworkz.Object.toString;

public class Juicer {
    private String brand;
    private boolean citrusOnly;
    private double motorPower;

    public Juicer(String brand, boolean citrusOnly, double motorPower) {
        this.brand = brand;
        this.citrusOnly = citrusOnly;
        this.motorPower = motorPower;
    }

    @Override
    public String toString() {
        return "Juicer{brand='" + brand + "', citrusOnly=" + citrusOnly + ", motorPower=" + motorPower + "}";
    }
}
