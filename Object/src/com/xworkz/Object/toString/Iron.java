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
    @Override
    public int hashCode() {
        return 41;
    }
    @Override
    public boolean equals(Object obj) {
        if (obj != null) {
            System.out.println("ref is not null");
            if (obj instanceof Iron) {
                System.out.println("Comparing!!!!!!");
                Iron iron = this;
                Iron iron1 = (Iron) obj;
                if (iron.brand.equals(iron1.brand) && iron.power == iron1.power) {
                    System.out.println("both are same");
                    return true;
                }
            }
        }
        return false;
    }

}
