package com.xworkz.Object.toString;
public class Clock {
    private String brand;
    private boolean digital;
    private String color;

    public Clock(String brand, boolean digital, String color) {
        this.brand = brand;
        this.digital = digital;
        this.color = color;
    }

    @Override
    public String toString() {
        return "Clock{brand='" + brand + "', digital=" + digital + ", color='" + color + "'}";
    }
    @Override
    public int hashCode() {
        return 17;
    }
    @Override
    public boolean equals(Object obj) {
        if(obj != null) {
            System.out.println("ref is not null");
            if(obj instanceof Clock) {
                System.out.println("Comparing!!!!!!");
                Clock clock = this;
                Clock clock1 = (Clock) obj;
                if(clock.brand.equals(clock1.brand)) {
                    System.out.println("both are same");
                    return true;
                }
            }
        }
        return false;
    }
}

