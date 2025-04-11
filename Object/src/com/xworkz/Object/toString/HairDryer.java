package com.xworkz.Object.toString;

public class HairDryer {
    private String brand;
    private int power;
    private boolean ionic;

    public HairDryer(String brand, int power, boolean ionic) {
        this.brand = brand;
        this.power = power;
        this.ionic = ionic;
    }

    @Override
    public String toString() {
        return "HairDryer{brand='" + brand + "', power=" + power + ", ionic=" + ionic + "}";
    }
    @Override
    public int hashCode() {
        return 37;
    }
}
