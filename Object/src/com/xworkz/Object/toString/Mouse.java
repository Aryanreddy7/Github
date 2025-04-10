package com.xworkz.Object.toString;

public class Mouse {
    private String brand;
    private boolean wireless;
    private int dpi;

    public Mouse(String brand, boolean wireless, int dpi) {
        this.brand = brand;
        this.wireless = wireless;
        this.dpi = dpi;
    }

    @Override
    public String toString() {
        return "Mouse{brand='" + brand + "', wireless=" + wireless + ", dpi=" + dpi + "}";
    }
}
