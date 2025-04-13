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
    @Override
    public int hashCode() {
        return 49;
    }
    @Override
    public boolean equals(Object obj) {
        if (obj != null) {
            System.out.println("ref is not null");
            if (obj instanceof Mouse) {
                System.out.println("Comparing!!!!!!");
                Mouse mouse = this;
                Mouse mouse1 = (Mouse) obj;
                if (mouse.brand.equals(mouse1.brand) && mouse.dpi == mouse1.dpi) {
                    System.out.println("both are same");
                    return true;
                }
            }
        }
        return false;
    }

}
