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
    @Override
    public boolean equals(Object obj) {
        if (obj != null) {
            System.out.println("ref is not null");
            if (obj instanceof GroceryItem) {
                System.out.println("Comparing!!!!!!");
                GroceryItem item = this;
                GroceryItem item1 = (GroceryItem) obj;
                if (item.name.equals(item1.name) && item.price == item1.price) {
                    System.out.println("both are same");
                    return true;
                }
            }
        }
        return false;
    }

}
