package com.xworkz.Object.toString;

public class Juicer {
    private String brand;
    private boolean citrusOnly;
    private double motorPower;

    public Juicer(String brand, boolean citrusOnly, double motorPower) {
        this.brand = brand;
        this.citrusOnly = citrusOnly;
        this.motorPower = motorPower;
    }

    @Override
    public String toString() {
        return "Juicer{brand='" + brand + "', citrusOnly=" + citrusOnly + ", motorPower=" + motorPower + "}";
    }
    @Override
    public int hashCode() {
        return 42;
    }
    @Override
    public boolean equals(Object obj) {
        if (obj != null) {
            System.out.println("ref is not null");
            if (obj instanceof Juicer) {
                System.out.println("Comparing!!!!!!");
                Juicer juicer = this;
                Juicer juicer1 = (Juicer) obj;
                if (juicer.brand.equals(juicer1.brand) && juicer.motorPower == juicer1.motorPower) {
                    System.out.println("both are same");
                    return true;
                }
            }
        }
        return false;
    }

}
