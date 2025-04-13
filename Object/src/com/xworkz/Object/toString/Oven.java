package com.xworkz.Object.toString;

public class Oven {
    private String brand;
    private int capacity;
    private boolean electric;

    public Oven(String brand, int capacity, boolean electric) {
        this.brand = brand;
        this.capacity = capacity;
        this.electric = electric;
    }

    @Override
    public String toString() {
        return "Oven{brand='" + brand + "', capacity=" + capacity + ", electric=" + electric + "}";
    }
    @Override
    public int hashCode() {
        return 53;
    }
    @Override
    public boolean equals(Object obj) {
        if (obj != null) {
            System.out.println("ref is not null");
            if (obj instanceof Oven) {
                System.out.println("Comparing!!!!!!");
                Oven oven = this;
                Oven oven1 = (Oven) obj;
                if (oven.brand.equals(oven1.brand) && oven.capacity == oven1.capacity) {
                    System.out.println("both are same");
                    return true;
                }
            }
        }
        return false;
    }

}
