package com.xworkz.Object.toString;

public class LightBulb {
    private String type;
    private int wattage;
    private String color;

    public LightBulb(String type, int wattage, String color) {
        this.type = type;
        this.wattage = wattage;
        this.color = color;
    }

    @Override
    public String toString() {
        return "LightBulb{type='" + type + "', wattage=" + wattage + ", color='" + color + "'}";
    }
    @Override
    public int hashCode() {
        return 45;
    }
    @Override
    public boolean equals(Object obj) {
        if (obj != null) {
            System.out.println("ref is not null");
            if (obj instanceof LightBulb) {
                System.out.println("Comparing!!!!!!");
                LightBulb lightBulb = this;
                LightBulb lightBulb1 = (LightBulb) obj;
                if (lightBulb.type.equals(lightBulb1.type) && lightBulb.wattage == lightBulb1.wattage) {
                    System.out.println("both are same");
                    return true;
                }
            }
        }
        return false;
    }

}
