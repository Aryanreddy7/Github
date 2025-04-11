package com.xworkz.Object.toString;

public class Museum {
    private String name;
    private String city;
    private int exhibits;

    public Museum(String name, String city, int exhibits) {
        this.name = name;
        this.city = city;
        this.exhibits = exhibits;
    }

    @Override
    public String toString() {
        return "Museum{name='" + name + "', city='" + city + "', exhibits=" + exhibits + "}";
    }
    @Override
    public int hashCode() {
        return 51;
    }
}
