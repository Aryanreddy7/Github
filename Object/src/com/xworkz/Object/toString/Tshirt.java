package com.xworkz.Object.toString;

import java.util.Objects;

public class Tshirt {
    private String color;
    private String brand;
    private int size;

    public Tshirt() {
        System.out.println("Running no arg Tshirt");
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public int getSize() {
        return size;
    }

    public void setSize(int size) {
        this.size = size;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    @Override
    public boolean equals(Object obj) {
        if (obj != null) {
            System.out.println("ref of not null");
            if (obj instanceof Tshirt) {
                System.out.println("ref of tshirt is compared");
                Tshirt tshirt1 = this;
                Tshirt tshirt2 = (Tshirt) obj;

                if (tshirt1.size == tshirt2.size &&
                        tshirt1.brand.equals(tshirt2.brand) &&
                        tshirt1.color.equals(tshirt2.color)) {
                    System.out.println("Both are same");
                    return true;
                }
                return false;
            }
        }
        return false; // needed if obj is null or not instance of Tshirt
    }
}


