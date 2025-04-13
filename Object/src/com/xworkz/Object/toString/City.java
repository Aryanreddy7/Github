package com.xworkz.Object.toString;

public class City {
    private String name;
    private String country;
    private int population;

    public City(String name, String country, int population) {
        this.name = name;
        this.country = country;
        this.population = population;
    }

    @Override
    public String toString() {
        return "City{name='" + name + "', country='" + country + "', population=" + population + "}";
    }
    @Override
    public int hashCode() {
        return 16;
    }
    @Override
    public boolean equals(Object obj) {
        if(obj != null) {
            System.out.println("ref is not null");
            if(obj instanceof City) {
                System.out.println("Comparing!!!!!!");
                City city = this;
                City city1 = (City) obj;
                if(city.name.equals(city1.name)) {
                    System.out.println("both are same");
                    return true;
                }
            }
        }
        return false;
    }
}
