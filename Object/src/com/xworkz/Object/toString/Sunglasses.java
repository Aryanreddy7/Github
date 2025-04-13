package com.xworkz.Object.toString;

public class Sunglasses {
    private String brand;
    private String lensColor;
    private boolean polarized;

    public Sunglasses(String brand, String lensColor, boolean polarized) {
        this.brand = brand;
        this.lensColor = lensColor;
        this.polarized = polarized;
    }

    @Override
    public String toString() {
        return "Sunglasses{brand='" + brand + "', lensColor='" + lensColor + "', polarized=" + polarized + "}";
    }
    @Override
    public int hashCode() {
        return 70;
    }
    @Override
    public boolean equals(Object obj) {
        if (obj != null) {
            System.out.println("ref is not null");
            if (obj instanceof Sunglasses) {
                System.out.println("Comparing!!!!!!");
                Sunglasses sunglasses = this;
                Sunglasses sunglasses1 = (Sunglasses) obj;
                if (sunglasses.brand.equals(sunglasses1.brand) && sunglasses.lensColor.equals(sunglasses1.lensColor) && sunglasses.polarized == sunglasses1.polarized) {
                    System.out.println("both are same");
                    return true;
                }
            }
        }
        return false;
    }

}
