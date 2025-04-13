package com.xworkz.Object.toString;

public class HairDryer {
    private String brand;
    private int power;
    private boolean ionic;

    public HairDryer(String brand, int power, boolean ionic) {
        this.brand = brand;
        this.power = power;
        this.ionic = ionic;
    }

    @Override
    public String toString() {
        return "HairDryer{brand='" + brand + "', power=" + power + ", ionic=" + ionic + "}";
    }
    @Override
    public int hashCode() {
        return 37;
    }
    @Override
    public boolean equals(Object obj) {
        if (obj != null) {
            System.out.println("ref is not null");
            if (obj instanceof HairDryer) {
                System.out.println("Comparing!!!!!!");
                HairDryer hairDryer = this;
                HairDryer hairDryer1 = (HairDryer) obj;
                if (hairDryer.brand.equals(hairDryer1.brand) && hairDryer.power == hairDryer1.power) {
                    System.out.println("both are same");
                    return true;
                }
            }
        }
        return false;
    }

}
