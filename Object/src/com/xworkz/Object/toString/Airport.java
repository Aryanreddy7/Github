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
    @Override
    public boolean equals(Object obj) {
        if(obj!=null)
        {
            System.out.println("ref is not null");
            if(obj instanceof Airport)
            {
                System.out.println("Comparing!!!!!!");
                Airport airport=this;
                Airport airport1=(Airport)obj;
                if(airport.name.equals(airport1.name))
                {
                    System.out.println("both  are same");
                    return true;
                }
            }
        }
        return false;
    }
}
