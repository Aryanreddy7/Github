package com.xworkz.Object.toString;

public class Airport {
    private String name;
    private String code;
    private String city;

    public Airport(String name, String code, String city) {
        this.name = name;
        this.code = code;
        this.city = city;
    }
    @Override
    public int hashCode() {
        return 02;
    }
    @Override
    public String toString() {
        return "Airport{name='" + name + "', code='" + code + "', city='" + city + "'}";
    }
}
