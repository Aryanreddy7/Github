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
}
