package com.xworkz.Object.toString;

public class Tablet {
    private String brand;
    private double screenSize;
    private int batteryLife;

    public Tablet(String brand, double screenSize, int batteryLife) {
        this.brand = brand;
        this.screenSize = screenSize;
        this.batteryLife = batteryLife;
    }

    @Override
    public String toString() {
        return "Tablet{brand='" + brand + "', screenSize=" + screenSize + ", batteryLife=" + batteryLife + "}";
    }
    @Override
    public int hashCode() {
        return 71;
    }
    @Override
    public boolean equals(Object obj) {
        if (obj != null) {
            System.out.println("ref is not null");
            if (obj instanceof Tablet) {
                System.out.println("Comparing!!!!!!");
                Tablet tablet = this;
                Tablet tablet1 = (Tablet) obj;
                if (tablet.brand.equals(tablet1.brand) && tablet.batteryLife == tablet1.batteryLife && tablet.screenSize == tablet1.screenSize) {
                    System.out.println("both are same");
                    return true;
                }
            }
        }
        return false;
    }

}

