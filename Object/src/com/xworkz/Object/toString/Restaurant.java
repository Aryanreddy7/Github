package com.xworkz.Object.toString;

public class Restaurant {
    private String name;
    private String cuisineType;
    private int rating;

    public Restaurant(String name, String cuisineType, int rating) {
        this.name = name;
        this.cuisineType = cuisineType;
        this.rating = rating;
    }

    @Override
    public String toString() {
        return "Restaurant{name='" + name + "', cuisineType='" + cuisineType + "', rating=" + rating + "}";
    }
}
