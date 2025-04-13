package com.xworkz.Object.toString;

public class YogaMat {
    private String brand;
    private double thickness;
    private String color;

    public YogaMat(String brand, double thickness, String color) {
        this.brand = brand;
        this.thickness = thickness;
        this.color = color;
    }

    @Override
    public String toString() {
        return "YogaMat{brand='" + brand + "', thickness=" + thickness + ", color='" + color + "'}";
    }
    @Override
    public int hashCode() {
        return 100;
    }
    @Override
    public boolean equals(Object obj) {
        if (obj != null) {
            System.out.println("ref is not null");
            if (obj instanceof YogaMat) {
                System.out.println("Comparing!!!!!!");
                YogaMat yogaMat = this;
                YogaMat yogaMat1 = (YogaMat) obj;
                if (yogaMat.color.equals(yogaMat1.color) && yogaMat.brand.equals(yogaMat1.brand) && yogaMat.thickness == yogaMat1.thickness) {
                    System.out.println("both are same");
                    return true;
                }
            }
        }
        return false;
    }

}
