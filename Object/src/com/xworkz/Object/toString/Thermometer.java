package com.xworkz.Object.toString;

public class Thermometer {
    private String type;
    private double range;
    private boolean digital;

    public Thermometer(String type, double range, boolean digital) {
        this.type = type;
        this.range = range;
        this.digital = digital;
    }

    @Override
    public String toString() {
        return "Thermometer{type='" + type + "', range=" + range + ", digital=" + digital + "}";
    }
    @Override
    public int hashCode() {
        return 74;
    }
    @Override
    public boolean equals(Object obj) {
        if (obj != null) {
            System.out.println("ref is not null");
            if (obj instanceof Thermometer) {
                System.out.println("Comparing!!!!!!");
                Thermometer thermometer = this;
                Thermometer thermometer1 = (Thermometer) obj;
                if (thermometer.type.equals(thermometer1.type) && thermometer.type.equals(thermometer1.type) && thermometer.range == thermometer1.range) {
                    System.out.println("both are same");
                    return true;
                }
            }
        }
        return false;
    }

}
