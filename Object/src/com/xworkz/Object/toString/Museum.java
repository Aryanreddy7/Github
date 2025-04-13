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
    @Override
    public boolean equals(Object obj) {
        if (obj != null) {
            System.out.println("ref is not null");
            if (obj instanceof Museum) {
                System.out.println("Comparing!!!!!!");
                Museum museum = this;
                Museum museum1 = (Museum) obj;
                if (museum.name.equals(museum1.name) && museum.city.equals(museum1.city)) {
                    System.out.println("both are same");
                    return true;
                }
            }
        }
        return false;
    }

}
