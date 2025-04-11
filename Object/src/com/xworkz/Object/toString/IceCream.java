package com.xworkz.Object.toString;

public class IceCream {
    private String flavor;
    private String size;
    private double price;

    public IceCream(String flavor, String size, double price) {
        this.flavor = flavor;
        this.size = size;
        this.price = price;
    }

    @Override
    public String toString() {
        return "IceCream{flavor='" + flavor + "', size='" + size + "', price=" + price + "}";
    }
    @Override
    public int hashCode() {
        return 40;
    }
}
