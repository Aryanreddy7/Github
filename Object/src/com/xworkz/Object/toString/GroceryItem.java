package com.xworkz.Object.toString;

public class GroceryItem {
    private String name;
    private double price;
    private String category;

    public GroceryItem(String name, double price, String category) {
        this.name = name;
        this.price = price;
        this.category = category;
    }

    @Override
    public String toString() {
        return "GroceryItem{name='" + name + "', price=" + price + ", category='" + category + "'}";
    }
    @Override
    public int hashCode() {
        return 36;
    }
}
