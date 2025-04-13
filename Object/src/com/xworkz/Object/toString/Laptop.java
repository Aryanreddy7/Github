package com.xworkz.Object.toString;

public class Laptop {
    private String brand;
    private String processor;
    private int ram;

    public Laptop(String brand, String processor, int ram) {
        this.brand = brand;
        this.processor = processor;
        this.ram = ram;
    }

    @Override
    public String toString() {
        return "Laptop{brand='" + brand + "', processor='" + processor + "', ram=" + ram + "}";
    }
    @Override
    public int hashCode() {
        return 44;
    }
    @Override
    public boolean equals(Object obj) {
        if (obj != null) {
            System.out.println("ref is not null");
            if (obj instanceof Laptop) {
                System.out.println("Comparing!!!!!!");
                Laptop laptop = this;
                Laptop laptop1 = (Laptop) obj;
                if (laptop.brand.equals(laptop1.brand) && laptop.processor.equals(laptop1.processor)) {
                    System.out.println("both are same");
                    return true;
                }
            }
        }
        return false;
    }

}
