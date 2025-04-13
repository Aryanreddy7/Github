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
    @Override
    public int hashCode() {
        return 63;
    }
    @Override
    public boolean equals(Object obj) {
        if (obj != null) {
            System.out.println("ref is not null");
            if (obj instanceof Restaurant) {
                System.out.println("Comparing!!!!!!");
                Restaurant restaurant = this;
                Restaurant restaurant1 = (Restaurant) obj;
                if (restaurant.name.equals(restaurant1.name) && restaurant.cuisineType.equals(restaurant1.cuisineType) && restaurant.rating == restaurant1.rating) {
                    System.out.println("both are same");
                    return true;
                }
            }
        }
        return false;
    }

}
