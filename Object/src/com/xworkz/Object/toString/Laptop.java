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
}
