package com.xworkz.Object.toString;

public class Mixer {
    private String brand;
    private int speedLevels;
    private boolean bowlIncluded;

    public Mixer(String brand, int speedLevels, boolean bowlIncluded) {
        this.brand = brand;
        this.speedLevels = speedLevels;
        this.bowlIncluded = bowlIncluded;
    }

    @Override
    public String toString() {
        return "Mixer{brand='" + brand + "', speedLevels=" + speedLevels + ", bowlIncluded=" + bowlIncluded + "}";
    }
    @Override
    public int hashCode() {
        return 48;
    }
    @Override
    public boolean equals(Object obj) {
        if (obj != null) {
            System.out.println("ref is not null");
            if (obj instanceof Mixer) {
                System.out.println("Comparing!!!!!!");
                Mixer mixer = this;
                Mixer mixer1 = (Mixer) obj;
                if (mixer.brand.equals(mixer1.brand) && mixer.speedLevels == mixer1.speedLevels) {
                    System.out.println("both are same");
                    return true;
                }
            }
        }
        return false;
    }

}
