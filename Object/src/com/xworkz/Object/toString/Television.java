package com.xworkz.Object.toString;

public class Television {
    private String brand;
    private int screenSize;
    private boolean isSmart;

    public Television(String brand, int screenSize, boolean isSmart) {
        this.brand = brand;
        this.screenSize = screenSize;
        this.isSmart = isSmart;
    }

    @Override
    public String toString() {
        return "Television{brand='" + brand + "', screenSize=" + screenSize + ", isSmart=" + isSmart + "}";
    }
    @Override
    public int hashCode() {
        return 73;
    }
    @Override
    public boolean equals(Object obj) {
        if (obj != null) {
            System.out.println("ref is not null");
            if (obj instanceof Television) {
                System.out.println("Comparing!!!!!!");
                Television television = this;
                Television television1 = (Television) obj;
                if (television.brand.equals(television1.brand) && television.screenSize == television1.screenSize && television.isSmart==television1.isSmart) {
                    System.out.println("both are same");
                    return true;
                }
            }
        }
        return false;
    }

}


