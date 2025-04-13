package com.xworkz.Object.toString;

public class CoffeeMachine {
    private String brand;
    private boolean automatic;
    private int cupsCapacity;

    public CoffeeMachine(String brand, boolean automatic, int cupsCapacity) {
        this.brand = brand;
        this.automatic = automatic;
        this.cupsCapacity = cupsCapacity;
    }

    @Override
    public String toString() {
        return "CoffeeMachine{brand='" + brand + "', automatic=" + automatic + ", cupsCapacity=" + cupsCapacity + "}";
    }
    @Override
    public int hashCode() {
        return 19;
    }
    @Override
    public boolean equals(Object obj) {
        if(obj != null) {
            System.out.println("ref is not null");
            if(obj instanceof CoffeeMachine) {
                System.out.println("Comparing!!!!!!");
                CoffeeMachine coffeeMachine = this;
                CoffeeMachine coffeeMachine1 = (CoffeeMachine) obj;
                if(coffeeMachine.brand.equals(coffeeMachine1.brand)) {
                    System.out.println("both are same");
                    return true;
                }
            }
        }
        return false;
    }
}
