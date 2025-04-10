package com.xworkz.Object.toString;

public class Festival {
    private String name;
    private String country;
    private String month;

    public Festival(String name, String country, String month) {
        this.name = name;
        this.country = country;
        this.month = month;
    }

    @Override
    public String toString() {
        return "Festival{name='" + name + "', country='" + country + "', month='" + month + "'}";
    }
}
