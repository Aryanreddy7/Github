package com.xworkz.Object.toString;

public class WashingMachine {
    private String brand;
    private double capacity;
    private boolean frontLoad;

    public WashingMachine(String brand, double capacity, boolean frontLoad) {
        this.brand = brand;
        this.capacity = capacity;
        this.frontLoad = frontLoad;
    }

    @Override
    public String toString() {
        return "WashingMachine{brand='" + brand + "', capacity=" + capacity + ", frontLoad=" + frontLoad + "}";
    }
    @Override
    public int hashCode() {
        return 97;
    }
    @Override
    public boolean equals(Object obj) {
        if (obj != null) {
            System.out.println("ref is not null");
            if (obj instanceof WashingMachine) {
                System.out.println("Comparing!!!!!!");
                WashingMachine washingMachine = this;
                WashingMachine washingMachine1 = (WashingMachine) obj;
                if (washingMachine.brand.equals(washingMachine1.brand) && washingMachine.capacity == washingMachine1.capacity && washingMachine.frontLoad==washingMachine1.frontLoad) {
                    System.out.println("both are same");
                    return true;
                }
            }
        }
        return false;
    }

}
