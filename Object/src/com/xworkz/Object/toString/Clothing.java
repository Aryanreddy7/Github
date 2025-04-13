package com.xworkz.Object.toString;

public class Clothing {
    private String type;
    private String size;
    private String color;

    public Clothing(String type, String size, String color) {
        this.type = type;
        this.size = size;
        this.color = color;
    }

    @Override
    public String toString() {
        return "Clothing{type='" + type + "', size='" + size + "', color='" + color + "'}";
    }
    @Override
    public int hashCode() {
        return 18;
    }
    @Override
    public boolean equals(Object obj) {
        if(obj != null) {
            System.out.println("ref is not null");
            if(obj instanceof Clothing) {
                System.out.println("Comparing!!!!!!");
                Clothing clothing = this;
                Clothing clothing1 = (Clothing) obj;
                if(clothing.type.equals(clothing1.type)) {
                    System.out.println("both are same");
                    return true;
                }
            }
        }
        return false;
    }
}

