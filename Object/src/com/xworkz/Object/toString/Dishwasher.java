package com.xworkz.Object.toString;

public class Dishwasher {
    private String brand;
    private int placeSettings;
    private boolean energyEfficient;

    public Dishwasher(String brand, int placeSettings, boolean energyEfficient) {
        this.brand = brand;
        this.placeSettings = placeSettings;
        this.energyEfficient = energyEfficient;
    }

    @Override
    public String toString() {
        return "Dishwasher{brand='" + brand + "', placeSettings=" + placeSettings + ", energyEfficient=" + energyEfficient + "}";
    }
    @Override
    public int hashCode() {
        return 24;
    }
    @Override
    public boolean equals(Object obj) {
        if(obj != null) {
            System.out.println("ref is not null");
            if(obj instanceof Dishwasher) {
                System.out.println("Comparing!!!!!!");
                Dishwasher dishwasher = this;
                Dishwasher dishwasher1 = (Dishwasher) obj;
                if(dishwasher.brand.equals(dishwasher1.brand)) {
                    System.out.println("both are same");
                    return true;
                }
            }
        }
        return false;
    }
}
