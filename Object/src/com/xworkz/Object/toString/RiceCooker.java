package com.xworkz.Object.toString;

public class RiceCooker {
    private String brand;
    private int capacity;
    private boolean steamer;

    public RiceCooker(String brand, int capacity, boolean steamer) {
        this.brand = brand;
        this.capacity = capacity;
        this.steamer = steamer;
    }

    @Override
    public String toString() {
        return "RiceCooker{brand='" + brand + "', capacity=" + capacity + ", steamer=" + steamer + "}";
    }
    @Override
    public int hashCode() {
        return 64;
    }
    @Override
    public boolean equals(Object obj) {
        if (obj != null) {
            System.out.println("ref is not null");
            if (obj instanceof RiceCooker) {
                System.out.println("Comparing!!!!!!");
                RiceCooker riceCooker = this;
                RiceCooker riceCooker1 = (RiceCooker) obj;
                if (riceCooker.brand.equals(riceCooker1.brand) && riceCooker.capacity == riceCooker1.capacity && riceCooker.steamer==riceCooker1.steamer) {
                    System.out.println("both are same");
                    return true;
                }
            }
        }
        return false;
    }

}
