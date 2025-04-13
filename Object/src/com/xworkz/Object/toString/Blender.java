package com.xworkz.Object.toString;

public class Blender {
    private String brand;
    private int speedSettings;
    private boolean cordless;

    public Blender(String brand, int speedSettings, boolean cordless) {
        this.brand = brand;
        this.speedSettings = speedSettings;
        this.cordless = cordless;
    }

    @Override
    public String toString() {
        return "Blender{brand='" + brand + "', speedSettings=" + speedSettings + ", cordless=" + cordless + "}";
    }
    @Override
    public int hashCode() {
        return 8;
    }
    @Override
    public boolean equals(Object obj) {
        if(obj != null) {
            System.out.println("ref is not null");
            if(obj instanceof Blender) {
                System.out.println("Comparing!!!!!!");
                Blender blender = this;
                Blender blender1 = (Blender) obj;
                if(blender.brand.equals(blender1.brand)) {
                    System.out.println("both are same");
                    return true;
                }
            }
        }
        return false;
    }
}
