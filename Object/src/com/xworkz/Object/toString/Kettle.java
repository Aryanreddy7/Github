package com.xworkz.Object.toString;

public class Kettle {
    private String brand;
    private double capacity;
    private boolean temperatureControl;

    public Kettle(String brand, double capacity, boolean temperatureControl) {
        this.brand = brand;
        this.capacity = capacity;
        this.temperatureControl = temperatureControl;
    }

    @Override
    public String toString() {
        return "Kettle{brand='" + brand + "', capacity=" + capacity + ", temperatureControl=" + temperatureControl + "}";
    }
    @Override
    public int hashCode() {
        return 43;
    }
    @Override
    public boolean equals(Object obj) {
        if (obj != null) {
            System.out.println("ref is not null");
            if (obj instanceof Kettle) {
                System.out.println("Comparing!!!!!!");
                Kettle kettle = this;
                Kettle kettle1 = (Kettle) obj;
                if (kettle.brand.equals(kettle1.brand) && kettle.capacity == kettle1.capacity) {
                    System.out.println("both are same");
                    return true;
                }
            }
        }
        return false;
    }

}
