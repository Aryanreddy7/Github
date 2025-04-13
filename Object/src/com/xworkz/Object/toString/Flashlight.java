package com.xworkz.Object.toString;

public class Flashlight {
    private String brand;
    private int lumens;
    private boolean rechargeable;

    public Flashlight(String brand, int lumens, boolean rechargeable) {
        this.brand = brand;
        this.lumens = lumens;
        this.rechargeable = rechargeable;
    }

    @Override
    public String toString() {
        return "Flashlight{brand='" + brand + "', lumens=" + lumens + ", rechargeable=" + rechargeable + "}";
    }
    @Override
    public int hashCode() {
        return 30;
    }
    @Override
    public boolean equals(Object obj) {
        if(obj != null) {
            System.out.println("ref is not null");
            if(obj instanceof Flashlight) {
                System.out.println("Comparing!!!!!!");
                Flashlight flashlight = this;
                Flashlight flashlight1 = (Flashlight) obj;
                if(flashlight.brand.equals(flashlight1.brand)) {
                    System.out.println("both are same");
                    return true;
                }
            }
        }
        return false;
    }
}
