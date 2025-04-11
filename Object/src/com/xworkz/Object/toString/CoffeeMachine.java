package com.xworkz.Object.toString;

public class CoffeeMachine {
    private String brand;
    private boolean automatic;
    private int cupsCapacity;

    public CoffeeMachine(String brand, boolean automatic, int cupsCapacity) {
        this.brand = brand;
        this.automatic = automatic;
        this.cupsCapacity = cupsCapacity;
    }

    @Override
    public String toString() {
        return "CoffeeMachine{brand='" + brand + "', automatic=" + automatic + ", cupsCapacity=" + cupsCapacity + "}";
    }
    @Override
    public int hashCode() {
        return 19;
    }
}
