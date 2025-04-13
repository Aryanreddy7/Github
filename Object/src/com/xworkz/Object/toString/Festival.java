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
    @Override
    public int hashCode() {
        return 29;
    }
    @Override
    public boolean equals(Object obj) {
        if(obj != null) {
            System.out.println("ref is not null");
            if(obj instanceof Festival) {
                System.out.println("Comparing!!!!!!");
                Festival festival = this;
                Festival festival1 = (Festival) obj;
                if(festival.name.equals(festival1.name)) {
                    System.out.println("both are same");
                    return true;
                }
            }
        }
        return false;
    }
}
