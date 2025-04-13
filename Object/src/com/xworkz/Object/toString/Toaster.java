package com.xworkz.Object.toString;

public class Toaster {
    private String brand;
    private int slots;
    private boolean smart;

    public Toaster(String brand, int slots, boolean smart) {
        this.brand = brand;
        this.slots = slots;
        this.smart = smart;
    }

    @Override
    public String toString() {
        return "Toaster{brand='" + brand + "', slots=" + slots + ", smart=" + smart + "}";
    }
    @Override
    public int hashCode() {
        return 76;
    }
    @Override
    public boolean equals(Object obj) {
        if (obj != null) {
            System.out.println("ref is not null");
            if (obj instanceof Toaster) {
                System.out.println("Comparing!!!!!!");
                Toaster toaster = this;
                Toaster toaster1 = (Toaster) obj;
                if (toaster.brand.equals(toaster1.brand) && toaster.slots == toaster1.slots && toaster.smart==toaster1.smart){
                    System.out.println("both are same");
                    return true;
                }
            }
        }
        return false;
    }

}
