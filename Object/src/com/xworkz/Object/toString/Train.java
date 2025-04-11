package com.xworkz.Object.toString;

public class Train {
    private String name;
    private int coaches;
    private String route;

    public Train(String name, int coaches, String route) {
        this.name = name;
        this.coaches = coaches;
        this.route = route;
    }

    @Override
    public String toString() {
        return "Train{name='" + name + "', coaches=" + coaches + ", route='" + route + "'}";
    }
    @Override
    public int hashCode() {
        return 77;
    }
}
