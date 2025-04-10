package com.xworkz.Object.toString;

public class Iron {
    private String brand;
    private int power;
    private boolean steamEnabled;

    public Iron(String brand, int power, boolean steamEnabled) {
        this.brand = brand;
        this.power = power;
        this.steamEnabled = steamEnabled;
    }

    @Override
    public String toString() {
        return "Iron{brand='" + brand + "', power=" + power + ", steamEnabled=" + steamEnabled + "}";
    }
}
